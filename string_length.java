package javastring;
import java.util.Scanner;
public class string_length {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter a string");
      String a ;
      a=input.nextLine() ;
      int string_length=a.length();
      String uppper_case=a.toUpperCase();


     System.out.println("the given string is :"+a+"  after convating upper case "+uppper_case+"  and the given string length is "+string_length);
    }
}
