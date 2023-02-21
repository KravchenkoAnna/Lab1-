package com.company;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        MyContainer first = new MyContainer();
        first.setVisible(true);

//      C:\\University\\SECOND year\\ІІ СЕМЕСТР\\BIS\\Lab_1\\data.txt
        PrintStream errStream = System.err;
        System.setErr(new PrintStream("error.log"));


    }
}
