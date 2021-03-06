package org.bonn.se.uebung9;

import java.util.ArrayList;

/**
 * CLASS ComplexDocument
 * Author: Nils Kuhnert
 * Created on 11.12.2015
 * Description:
 */
public class ComplexDocument extends AbstractDocument {
    private ArrayList<Document> documents = new ArrayList<Document>();

    public boolean addDocument(Document d) {
        return documents.add(d);
    }

    public boolean removeDocument(int id) {
        for (Document d : documents) {
            if (d.getId() == id) return documents.remove(d);
        }
        return false;
    }

    public boolean removeDocument(Document d) {
        return documents.remove(d);
    }

    public int getBytes() {
        int size = 0;
        for (Document d : documents) {
            size += d.getBytes();
        }
        return size;
    }
}
