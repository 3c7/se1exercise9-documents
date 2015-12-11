package org.bonn.se.uebung9;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * UTIL CLASS UtilLog
 * Author: Nils Kuhnert
 * Created on 11.12.2015
 * Description:
 */
public class UtilLog {
    public static void logDocument(Document d) {
        System.out.println("Document with id " + d.getId() + " was registered.");
        System.out.println("Corresponding Class Name: " + d.getClass().getName());
        System.out.println("Date: " + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS").format(new Date()) + "\n");
    }

    // Permit creating instances
    private UtilLog(){}
}
