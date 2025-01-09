package oop;

import java.io.FileReader;
import java.io.IOException;

class exception {
    public static void main(String[] args) {
        try{
        FileReader reader = new FileReader("in.txt");
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}
