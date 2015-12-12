package org.bonn.se.uebung9;

/**
 * ABSTRACT CLASS AbstractDocument
 * Author: Nils Kuhnert
 * Created on 12.12.2015
 * Description:
 */
public abstract class AbstractDocument implements Document {
    private int id;

    public final void setId(int i) {
        id = i;
        UtilLog.logDocument(this);
    }

    public final int getId() {
        return id;
    }
}
