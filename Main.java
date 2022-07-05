//package ru.ac.uniyar.mf.chindin;
//import java.util.Scanner;

// public class Main{  
//     public static void main(String args[]){  
//         System.out.println("Hello");  
//         Scanner in = new Scanner(System.in);
//         int num = in.nextInt();
//         String str = in.next();
//         System.out.println(str);
//         int num2 = Integer.parseInt("123");
//         str = String.valueOf(num2);
//         System.out.println(str);

//         str = "Not num";
//         String[] parts = str.split(" ");
//         System.out.println("Parts: " + parts.length);
//         System.out.println("First: " + parts[0]);
//         System.out.println("Second: " + parts[1]);
//     }  
// }  

// public class Main{
//     public static void main(String args[]){
//         Scanner in = new Scanner(System.in);
//         String str = in.next();

//         try{
//             int num = Integer.parseInt(str);
//             System.out.println(num);
//         }
//         catch (NumberFormatException e) {
//             System.out.println("Error " + str);
//         }
//     }
// }

import java.util.Scanner;

class fraction{
    int numerator;
    int denominator;

    static int find_CSD(int a, int b){
        while (b != 0){
            int tmp = b;
            b = a % b;
            a = tmp;
        }
        return a;
    }

    fraction(int numerator, int denominator){
        this.numerator = numerator;
        if(denominator == 0)
            System.out.println("Нельзя");
        this.denominator = denominator;
    }

    public static fraction sum(fraction a, fraction b){
        int cDenominator = a.denominator * b.denominator;
        int cNumerator = a.numerator * b.denominator + a.denominator * b.numerator;
        int nok = find_CSD(cNumerator, cDenominator);
        fraction c = new fraction(numerator: cNumerator / nok, denominator: cDenominator / nok);
        return c;
    }

    public static fraction minus(fraction a, fraction b){
        int cDenominator = a.denominator * b.denominator;
        int cNumerator = a.numerator * b.denominator - a.denominator * b.numerator;
        int nok = find_CSD(cNumerator, cDenominator);
        fraction c = new fraction(numerator: cNumerator / nok, denominator: cDenominator / nok);
        return c;
    }

    public static fraction div(fraction a, fraction b){
        int cDenominator = a.denominator * b.denominator;
        int cNumerator = a.numerator * b.denominator;
        int nok = find_CSD(cNumerator, cDenominator);
        fraction c = new fraction(numerator: cNumerator / nok, denominator: cDenominator / nok);
        return c;
    }

    public static fraction multiply(fraction a, fraction b){
        int cDenominator = a.denominator * b.denominator;
        int cNumerator = a.numerator * b.denominator;
        int nok = find_CSD(cNumerator, cDenominator);
        fraction c = new fraction(numerator: cNumerator / nok, denominator: cDenominator / nok);
        return c;
    }

    public void showfrac(){
        if(numerator % denominator == 0)
            System.out.println(this.numerator / this.denominator);
        else
            System.out.println(this.numerator + "/" + this.denominator);
    }
}

public class Main{

    static int find_CSD(int a, int b){
        while(b != 0){
            int tmp = b;
            b = a % b;
            a = tmp;
        }
        return a;
    }


public static void main(String args[]){
    System.out.println("Выберите калькулятор: ");
    Scanner in = new Scanner(System.in);
    int case = in.nextInt();
    switch(case){
    case "+":
        System.out.println(num1 + num2);
        break;
    case "-":
        System.out.println(num1 - num2);
        break;
    case "*":
        System.out.println(num1 * num2);
        break;
    case "/":
        if(Double.parseDouble(parts[2]) != 0){
            System.out.println(num1 / num2);
            break;
        }
        else{
            System.out.println("Вы не можете делить на 0");
        }
    }
    case 2:
    int num1 = in.nextInt();
    String symb1 = in.next();
    int num2 = in.nextInt();
    fraction frac1 = new fraction(num1, num2);   
}
