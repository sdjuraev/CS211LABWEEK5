package com.company.file;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadData {
    public static void main(String[] args) throws FileNotFoundException {
        File file=new File("scores.txt");
        Scanner input = new Scanner(file);
        while (input.hasNext()){
            System.out.println(input.next());
        }


    }
}
