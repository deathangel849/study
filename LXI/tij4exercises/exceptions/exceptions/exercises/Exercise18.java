/************************************************************************
 *                                                                      *
 *  DDDD     SSSS    AAA        Daten- und Systemtechnik Aachen GmbH    *
 *  D   D   SS      A   A       Pascalstrasse 28                        *
 *  D   D    SSS    AAAAA       52076 Aachen-Oberforstbach, Germany     *
 *  D   D      SS   A   A       Telefon: +49 (0)2408 / 9492-0           *
 *  DDDD    SSSS    A   A       Telefax: +49 (0)2408 / 9492-92          *
 *                                                                      *
 *                                                                      *
 *  (c) Copyright by DSA - all rights reserved                          *
 *                                                                      *
 ************************************************************************
 *
 * Initial Creation:
 *    Author      LXI
 *    Created on  Dec 27, 2018
 *
 ************************************************************************/
package exceptions.exercises;

import exceptions.example.LostMessage;

class VeryImportantException extends Exception {
    private static final long serialVersionUID = 1L;

    public String toString() {
        return "A very important exception!";
    }
}

class HoHumException extends Exception {
    private static final long serialVersionUID = 1L;

    public String toString() {
        return "A trivial exception";
    }
}

public class Exercise18 {
    void f() throws VeryImportantException {
        throw new VeryImportantException();
    }

    void dispose() throws HoHumException {
        throw new HoHumException();
    }

    public static void main(String[] args) {
        try {
            Exercise18 lm = new Exercise18();
            try {
                try {
                    lm.f();

                } finally {
                    lm.dispose();
                }
            } finally {
                throw new NullPointerException();
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
