/**
 * 
 */
package de.incentergy.zugferd;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * This interface takes an InputStream probably a FileInputStream from a PDF
 * and creates an output stream probably a PDF with ZugFERD annotations.
 * 
 * @author manuel
 *
 */
public interface InvoiceAnnotator {
	/**
	 * Annotate the PDF that comes in with ZugFerd annotations
	 * and write it to out.
	 * 
	 * @param pdfIn the input document
	 * @param pdfOut the output document
	 * @throws IOException 
	 */
	public void annotateInvoice(InputStream pdfIn, OutputStream pdfOut) throws IOException;
}
