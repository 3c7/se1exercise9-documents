package org.bonn.se.uebung9;

import java.io.UnsupportedEncodingException;

/**
 * CLASS TextDocument
 * Author: Nils Kuhnert
 * Created on 11.12.2015
 * Description:
 */
public class TextDocument extends CoreDocument implements Document {
    public enum Encoding {UTF8, UTF16, UTF32}
    private String text;
    private Encoding encoding;

    public TextDocument(String s, Encoding e) {
        text = s;
        encoding = e;
    }

    public int getBytes() {
        byte[] encText;
        int size = 0;
        try {
            if (encoding == Encoding.UTF8) {
                encText = text.getBytes("UTF-8");
            } else if (encoding == Encoding.UTF16) {
                encText = text.getBytes("UTF-16");
            } else {
                encText = text.getBytes("UTF-32");
            }
            size = encText.length;
        } catch (UnsupportedEncodingException uee) {
            System.out.println("Encoding nicht unterstützt.");
        }
        return size;
    }

}
