package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)throws FileNotFoundException {
        Scanner klawiatura = new Scanner (new File("tekst.txt"));
        int slowo =0;
        while (klawiatura.hasNext()) {
            klawiatura.next();
            slowo++;
        }
        klawiatura.close();
        Scanner klawiatura1 = new Scanner (new File("tekst.txt")).useDelimiter("[^\\s]");
      int znak =0;
              while (klawiatura1.hasNext()) {
                  klawiatura1.next();
                  znak++;
              }
        klawiatura1.close();
        Scanner klawiatura2 = new Scanner (new File("tekst.txt")).useDelimiter("[\\t\\n\\x0B\\f\\r\\s]");
        int logo =0;
                while (klawiatura2.hasNext()) {
                    klawiatura2.next();
                    logo++;
                }System.out.println("liczb slow to " +slowo);
        System.out.println("liczb znakow to " +znak);
        System.out.println("liczb bialych znakow to " +logo);






	// write your code here
    }
}
