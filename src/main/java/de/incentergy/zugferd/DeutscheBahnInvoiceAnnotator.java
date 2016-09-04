package de.incentergy.zugferd;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.parser.PdfTextExtractor;
import com.itextpdf.text.pdf.parser.TextExtractionStrategy;

public class DeutscheBahnInvoiceAnnotator implements InvoiceAnnotator {

	public void annotateInvoice(InputStream pdfIn, OutputStream pdfOut)
			throws IOException {
		PdfReader pdfReader = new PdfReader(pdfIn);
		for (int i = 1; i <= pdfReader.getNumberOfPages(); i++) {
			System.out.println(PdfTextExtractor.getTextFromPage(pdfReader, i));
		}
		pdfReader.close();
		// https://regex101.com/
		// /Gültigkeit: (\d\d\.\d\d\.\d\d\d\d) - (\d\d\.\d\d\.\d\d\d\d)(.|\n)*Hinfahrt: ([^ ]*)  ([^ ]*),(.|\n)*Summe (\d+,\d\d)€ (\d+,\d\d)€ (\d+,\d\d)€(.|\n)*(Herr|Frau)  (.*)\n/Ugmi
		
		/*
Online-Ticket
Bitte auf A4 ausdrucken
ICE Fahrkarte
Gültigkeit: 19.08.2016 - 20.08.2016
Flexpreis (Einfache Fahrt)
Klasse: 2
Erw: 1, mit 1 BC50
Hinfahrt: München+City  Tübingen+City, mit ICE
Über: A*(GZ*UL*PLO/DON*AA*SGM*S)
UMTAUSCH / ERSTATTUNG KOSTENPFLICHTIG AB 1. GELTUNGSTAG
Zahlungspositionen und Preis
Positionen Preis MwSt (D) 19% MwSt D: 7%
ICE Fahrkarte 1 33,50€ 33,50€ 5,35€
Hinfahrt:
Summe 33,50€ 33,50€ 5,35€
Zertifikat: 20C1 QP2B 75B 
Lastschriftzahlung
Gültig ab: 19.08.2016
Betrag 33,50€ Bank apoBank Düsseldorf
Datum 19.08.2016 IBAN DExxxxxxxxxxxxxxxxx071
Zangenabdruck
Der oben genannte Betrag wird von Ihrem Konto eingezogen. Die Buchung Ihres
Herr  Manuel Blechschmidt
Online-Tickets erfolgte am 19.08.2016 18:55 Uhr. DB Fernverkehr AG/DB Regio AG,
ID-Karte: BahnCard 7114
Stephensonstr. 1, 60326 Frankfurt, Steuernummer: 29/550/00001.
Auftragsnummer: GHLAVU
Ihre Reiseverbindung und Reservierung Hinfahrt am 19.08.2016
Halt Datum Zeit Gleis Produkte Reservierung
München Hbf 19.08. ab 19:15 18
ICE 1010
Stuttgart Hbf 19.08. an 21:43 10
Stuttgart Hbf (tief) 19.08. ab 22:05 101 S 1
Herrenberg 19.08. an 22:43 3
Herrenberg 19.08. ab 22:48 102 RB 22956
Tübingen Hbf 19.08. an 23:12 1
Wichtige Nutzungshinweise:
- Beauftragen Sie niemals Unbekannte mit der Buchung eines personalisierten Online-Tickets zu vermeintlich besonders günstigen Preisen.
Tickets werden nur zu dem aufgedruckten Originalpreis ausgegeben. Mit der Nutzung eines solchen Online-Tickets erkennen Sie die Gültigkeit
des durch den Buchenden für Sie abgeschlossenen Beförderungsvertrags zu dem aufgedruckten Preis an
- Die Fahrkarte muss ausgedruckt vorliegen und gilt nur zusammen mit der beim Kauf angegebenen eigenen gültigen Identifizierungskarte
- Bei Tickets mit BahnCard-Rabatt müssen Sie bei der Fahrkartenkontrolle eine gültige BahnCard sowie einen amtlichen Lichtbildausweis
vorlegen können
- Bei Flexpreisen auch in anderen Zügen als in der Reiseverbindung angegeben innerhalb der Geltungsdauer gültig (ggf. Aufpreis für anderen
Weg erforderlich)
- Erstattung oder Rücknahme über www.bahn.de, in DB Reisezentren oder die in Ihrer Auftragsbestätigung angegebene Serviceadresse. Keine
Erstattung oder Rücknahme in Reisebüros
- Das Online-Ticket gilt nur für den unter "Fahrkarte" angegebenen Reiseabschnitt. Die Übersicht "Ihre Reiseverbindung" enthält ggf.
Reiseinformationen zu Teilstrecken (z.B. mit dem Bus), für die ein weiteres Ticket erforderlich ist
- Wenn Ihr Ticket den Zusatz "+City" oder "City mobil" beinhaltet, gilt dieser nur am Tag der Hinfahrt bzw. am Tag der Rückfahrt (Reisetage wie
unter "Ihre Reiseverbindung" angegeben)
- Es gelten die nationalen und internationalen Beförderungsbedingungen der jeweiligen Beförderer bzw. innerhalb von Verkehrsverbünden und
Tarifgemeinschaften deren Beförderungsbedingungen. Den jeweiligen Beförderer finden Sie unter: www.DieBefoerderer.de bzw. www.bahn.de/
agb .
Bitte informieren Sie sich kurz vor Ihrer Reise über mögliche Änderungen Ihrer Reisedaten unter www.bahn.de/reiseplan oder mobil über die
App DB Navigator. Achten Sie auch auf Informationen und Ansagen im Zug und am Bahnhof. Wir danken Ihnen für Ihre Buchung und wünschen
Ihnen eine angenehme Reise!
Aktuelle
Infos aufs
Handy!
Fahrpläne, Pünktlichkeit,
Alternativen zur Fahrt
und mehr!
m.bahn.de
GHLAVU Seite 1 / 1
Barcode bitte nicht knicken!               
Vielen Dank für Ihre Buchung auf www.bahn.de! 
Bitte beachten Sie die folgenden Hinweise zum Online-Ticket: 
Bitte drucken Sie Ihr Online-Ticket auf weißem DIN A4 Papier aus. Achten Sie darauf, dass beim 
Druck des Online-Tickets die Bilder nicht unterdrückt werden. 
Nehmen Sie die Identifizierungskarte, die Sie beim Kauf angegeben haben im Zug mit - 
auch wenn sie zwischenzeitlich abgelaufen ist. Ihr Ticket gilt nur für Sie persönlich in 
Verbindung mit Ihrer eigenen Identifizierungskarte (BahnCard, bahn.bonus Card, Kreditkarte, 
EC-Karte oder Personalausweis). Reisepässe sind als Identifizierungskarte nicht zugelassen. 
 
Ihr Online-Ticket gilt nur für den unter „Fahrkarte“ auf dem Ticket angegebenen 
Reiseabschnitt. Unter „Ihre Reiseverbindung“ finden Sie ggf. Informationen zu weiteren 
Teilstrecken (z.B. mit Bus), für die ggf. ein weiteres Ticket erforderlich ist. 
 
 
Enthält Ihr Online-Ticket den Zusatz +City hinter der Bahnhofsbezeichnung, können Sie im 
zugehörigen Stadtgebiet die öffentlichen Verkehrsmittel für eine Fahrt zum bzw. vom Bahnhof 
nutzen (Reisetage wie unter "Ihre Reiseverbindung" angegeben).  
Weitere Informationen unter www.bahn.de/city-ticket. 
 
 
Eine Fahrkarte entspricht grundsätzlich einem Beförderungsvertrag. Vertraglicher Beförderer 
können dabei ein oder mehrere Verkehrsunternehmen sein. Informationen zu den 
Fahrgastrechten erhalten Sie bei Ihrem Zugbegleiter, einer Verkaufsstelle oder unter 
www.bahn.de/fahrgastrechte. 
 
 
Falls sich Ihre Reiseplanung ändert, können Sie Online-Tickets über 
www.bahn.de/erstattung oder in DB Reisezentren stornieren/erstatten lassen  
(nach Tarif). Eine Rückgabe in Reisebüros ist nicht möglich. 
 
 
Mit dem Reiseplan haben Sie Ihre Verbindung aktuell im Blick und sind z.B. über 
Ankunftszeiten, Services am Bahnhof, Wege oder Call-a-Bike-Stationen informiert.  
Für relationslose Angebote, z.B. Länder-Tickets, leider nicht verfügbar.  
Ihr persönlicher Reiseplan unter www.bahn.de/reiseplan.   
 
 
Informieren Sie sich kurz vor Abfahrt über mögliche Änderungen online auf www.bahn.de, 
mobil über die Navigator App/m.bahn.de oder telefonisch unter 
0180 6 99 66 33 (20 ct/Anruf aus dem Festnetz, Tarif bei Mobilfunk max. 60 ct/Anruf). 
Bei telefonischen Anfragen zur BahnCard über die Nummer 0180 6 34 00 35 
(20 ct/Anruf aus dem Festnetz, Tarif bei Mobilfunk max. 60 ct/Anruf). 
 
 
 
Reisen Sie mit Kindern? Dann finden Sie unter www.bahn.de/kinder wertvolle Informationen für 
Ihre Familienreise. Drucken Sie sich dort auch gleich die kostenlose Kinderfahrkarte mit 
Gutschein aus. Mit dieser erhalten  Ihre Kinder eine tolle Spiel-Überraschung im BordBistro. 
 
 
Mit "Umwelt-Plus", "BahnCard", „Zeitkarte“ oder als "bahn.corporate"-Kunde reisen Sie im 
Fernverkehr mit 100% Ökostrom. Berechnen Sie Ihren persönlichen Beitrag unter 
www.bahn.de/umweltmobilcheck.  
Wir wünschen Ihnen eine angenehme Reise! 
		 */
	}

}
