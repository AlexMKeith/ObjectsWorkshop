package com.company;

import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

public class Main {

    public static void main(String[] args) {

        Cat cat = new Cat(4,true, "Calico");

//        System.out.println(cat.getColor());
//        System.out.println(cat.getLegs());
//        System.out.println(cat.isFur());

        Pencil pencil = new Pencil(.7, "Dixon", false, "Orange", true);
        Pencil pencil1 = new Pencil(.8, "Paper-Mate", true, "Yellow", false);
    }
}