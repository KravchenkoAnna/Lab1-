package com.company;

public class Tsesar implements PressMark{
    private static final String alphabet = "abcdefghijklmnopqrstuvwxyz";

    public char symbolToEncrypt(char symbol, int key){
        if (alphabet.indexOf(symbol) != -1) {
            return alphabet.charAt((alphabet.indexOf(symbol) + key) % alphabet.length());
        }else{
            return symbol;
        }

    }

    public char symbolToDecrypt(char symbol, int key){
        if (alphabet.indexOf(symbol) != -1) {
            return alphabet.charAt((alphabet.indexOf(symbol) + (alphabet.length() - key % alphabet.length())) % alphabet.length());
        }else{
            return symbol;
        }

    }

    public void print1(String text, int key){
        text = text.toLowerCase();
        for (int i = 0; i < text.length(); i++) {
            System.out.print(symbolToEncrypt(text.charAt(i), key));
        }
        System.out.println();
    }

    public void print2(String text, int key){
        text = text.toLowerCase();
        for (int i = 0; i < text.length(); i++) {
            System.out.print(symbolToDecrypt(text.charAt(i), key));
        }
        System.out.println();
    }


}
