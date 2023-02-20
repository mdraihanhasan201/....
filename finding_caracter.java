package javastring;

import java.util.Scanner;

public class finding_caracter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter a string");
        String b;
       b= input.nextLine();
       System.out.println("enter your fiding latter");

       String c;
       c= input.nextLine();

   int find_latter =b.indexOf(c);

   System.out.println("the string is "  +b+"finding latter/word is :"+find_latter);

 

       
    //    System.out.println(b.indexOf("y"));

    }
}
