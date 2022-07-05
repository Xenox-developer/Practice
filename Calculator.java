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

public class Main{
    public static void main(String args[]){
        System.out.println("Введите через пробел первое число, операцию, второе число: ");
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        String[] parts = str.split(" ");

        //первое число  
        double num1 = Double.parseDouble(parts[0]); 

        //проверяем корректность введенного первого числа
        try{
            num1 = Double.parseDouble(parts[0]);
        } catch (NumberFormatException e) {
            System.out.println("Error " + parts[0]);
        }

        //второе число
        double num2 = Double.parseDouble(parts[2]);

        //проверяем корректность введенного второго числа
        try{
            num2 = Double.parseDouble(parts[2]);
        } catch (NumberFormatException e) {
            System.out.println("Error " + parts[2]);
        }
        
        switch (parts[1]) {
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
    }   

}
