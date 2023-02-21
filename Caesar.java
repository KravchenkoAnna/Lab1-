package com.company;

public class Caesar implements PressMark{
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

    public String print1(String text, int key){
        text = text.toLowerCase();
        char ch;
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
             ch = symbolToEncrypt(text.charAt(i), key);
             str.append(ch);
        }
        return str.toString();
    }

    public String print2(String text, int key){
        text = text.toLowerCase();
        char ch;
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            ch = symbolToDecrypt(text.charAt(i), key);
            str.append(ch);
        }
        return str.toString();
    }

}
