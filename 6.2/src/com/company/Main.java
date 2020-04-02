package com.company;

import java.io.IOException;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
       Person person = new Person();
       person.getPerson();
       person.viewPerson();
       System.out.println("Verificati fisierele!");
       person.sortare();
       person.viewSortedPerson();
    }
}
