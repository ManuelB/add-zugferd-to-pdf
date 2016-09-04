package de.incentergy.zugferd;

import static org.junit.Assert.assertEquals;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.junit.Test;

public class DumpTest {

	@Test
	public void testReadZugFERDFromFile() throws IOException {
		assertEquals(
				new String(Files.readAllBytes(Paths
						.get("src/test/resources/ferd-examples/ZUGFeRD_1p0_BASIC_Einfach.xml"))),
				Dump.readZugFERDFromFile(
						"src/test/resources/ferd-examples/ZUGFeRD_1p0_BASIC_Einfach.pdf"));
	}
}