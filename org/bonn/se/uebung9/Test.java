package org.bonn.se.uebung9;

/**
 * MAIN CLASS Test
 * Author: Nils Kuhnert
 * Created on 11.12.2015
 * Description:
 */
public class Test {
    public static void main(String[] args) {
        ComplexDocument doc0 = new ComplexDocument();
        TextDocument doc2 = new TextDocument("Die Klausur im Fach SE findet bald statt!", TextDocument.Encoding.UTF8);
        ComplexDocument doc3 = new ComplexDocument();
        GraficDocument doc4 = new GraficDocument("localhost:8080");
        TextDocument doc5 = new TextDocument("Software Engineering I ist eine Vorlesung in den Studiengaengen BIS und BCS",
                TextDocument.Encoding.UTF32);

        doc0.setId(0);
        doc2.setId(2);
        doc3.setId(3);
        doc4.setId(4);
        doc5.setId(5);
        doc0.addDocument(doc2);
        doc0.addDocument(doc3);
        doc3.addDocument(doc4);
        doc3.addDocument(doc5);

        System.out.println("Größe der Dokumentensammlung doc0: " + doc0.getBytes() + " Byte.");

        // Test removing Documents
        System.out.println(doc3.removeDocument(5));
        System.out.println(doc3.removeDocument(doc4));
    }
}
