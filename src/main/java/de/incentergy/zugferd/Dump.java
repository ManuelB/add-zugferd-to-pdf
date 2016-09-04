package de.incentergy.zugferd;

import java.io.IOException;
import java.util.Iterator;

import com.itextpdf.text.pdf.PRIndirectReference;
import com.itextpdf.text.pdf.PRStream;
import com.itextpdf.text.pdf.PdfArray;
import com.itextpdf.text.pdf.PdfDictionary;
import com.itextpdf.text.pdf.PdfName;
import com.itextpdf.text.pdf.PdfObject;
import com.itextpdf.text.pdf.PdfReader;

public class Dump {

	public static String readZugFERDFromFile(String file) throws IOException {
		PdfReader reader = new PdfReader(file);
		PdfArray pdfArray = reader.getCatalog().getAsArray(PdfName.AF);
		Iterator<PdfObject> it = pdfArray.iterator();
		while (it.hasNext()) {
			PdfObject pdfObject = it.next();
			if (pdfObject instanceof PRIndirectReference) {
				PRIndirectReference prIndirectReference = (PRIndirectReference) pdfObject;
				pdfObject = PdfReader.getPdfObject(prIndirectReference);
				if(pdfObject instanceof PdfDictionary) {
					PdfDictionary pdfDictionary = (PdfDictionary) pdfObject;
					PdfObject type = pdfDictionary.get(PdfName.TYPE);
					if(type != null && "/Filespec".equals(type.toString())) {
						PdfObject f = pdfDictionary.get(PdfName.F);
						if(f != null && "ZUGFeRD-invoice.xml".equals(f.toString())) {
							PdfObject ef = pdfDictionary.get(PdfName.EF);
							if(ef instanceof PdfDictionary) {
								PdfObject invoiceStream = ((PdfDictionary) ef).get(PdfName.F);
								if(invoiceStream instanceof PRIndirectReference) {
									PdfObject invoiceStreamObject = PdfReader.getPdfObject(invoiceStream);
									if(invoiceStreamObject instanceof PRStream) {
										byte[] ZUGFeRDBytes = PdfReader.getStreamBytes(((PRStream) invoiceStreamObject));
										// System.out.println(new String(ZUGFeRDBytes));
										return new String(ZUGFeRDBytes);
									}
									
								}
							}
						}
					}
				}
			}
		}
		reader.close();
		return null;
	}

	public static void main(String[] args) throws IOException {
		System.out.print(readZugFERDFromFile(args[0]));
	}
}
