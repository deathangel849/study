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
 *    Created on  Jan 3, 2019
 *
 ************************************************************************/
package string.example;

import java.util.*;

public class BetterRead {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(SimpleRead.input);
        System.out.println("What is your name?"); //$NON-NLS-1$
        String name = stdin.nextLine();
        System.out.println(name);
        System.out.println("How old are you? What is your favorite double?"); //$NON-NLS-1$
        System.out.println("(input: <age> <double>)"); //$NON-NLS-1$
        int age = stdin.nextInt();
        double favorite = stdin.nextDouble();
        System.out.println(age);
        System.out.println(favorite);
        System.out.format("Hi %s.\n", name); //$NON-NLS-1$
        System.out.format("In 5 years you will be %d.\n", age + 5); //$NON-NLS-1$
        System.out.format("My favorite double is %f.", favorite / 2); //$NON-NLS-1$
    }
} /* Output:
  What is your name?
  Sir Robin of Camelot
  How old are you? What is your favorite double?
  (input: <age> <double>)
  22
  1.61803
  Hi Sir Robin of Camelot.
  In 5 years you will be 27.
  My favorite double is 0.809015.
  *///:~
