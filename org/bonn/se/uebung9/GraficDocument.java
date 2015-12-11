package org.bonn.se.uebung9;

/**
 * CLASS GraficDocument
 * Author: Nils Kuhnert
 * Created on 11.12.2015
 * Description:
 */
public class GraficDocument extends CoreDocument implements Document {
    private String url;

    public GraficDocument(String s) {
        url = s;
    }

    public int getBytes() {
        return 1200;
    }
}
