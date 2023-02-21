package com.company;

public interface PressMark {
     char symbolToEncrypt(char symbol, int key);
     char symbolToDecrypt(char symbol, int key);
}
