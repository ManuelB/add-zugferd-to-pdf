package de.incentergy.zugferd;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.junit.Test;

public class DeutscheBahnInvoiceAnnotatorTest {

	@Test
	public void testAnnotateInvoice() throws IOException {
		DeutscheBahnInvoiceAnnotator deutscheBahnInvoiceAnnotator = new DeutscheBahnInvoiceAnnotator();
		deutscheBahnInvoiceAnnotator.annotateInvoice(
				new FileInputStream("src/test/resources/deutsche-bahn/GHLAVU.pdf"),
				new FileOutputStream("target/GHLAVU-annotated.pdf"));
	}

}
