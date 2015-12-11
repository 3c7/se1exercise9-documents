package org.bonn.se.uebung9;

/**
 * ABSTRACT CLASS CoreDocucment
 * Author: Nils Kuhnert
 * Created on 11.12.2015
 * Description:
 */
public abstract class CoreDocument implements Document {
    private int id;

    public void setId(int id) {
        this.id = id;
        UtilLog.logDocument(this);
    }

    public int getId() {
        return id;
    }

    public abstract int getBytes();

}
