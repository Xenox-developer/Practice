package ru.ac.uniyar.mf.chindin;
import java.util.Scanner;

public class MainIDEA{
    public static void main(String args[]){
        System.out.println("Hello");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        String str = in.next();
        System.out.println(str);
        int num2 = Integer.parseInt("123");
        str = String.valueOf(num2);
        System.out.println(str);
    }
}  