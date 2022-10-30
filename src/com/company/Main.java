package com.company;

public class Main {
    public static void main(String[] args)  {
        try {
           CircleWithException circle=new CircleWithException(1.2);
           System.out.println(circle.findArea());
       }
       catch (IllegalArgumentException argumentException)
       {
           System.out.println(argumentException);
       }
    }
}

