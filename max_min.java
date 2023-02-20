package javastring;

import java.util.Scanner;

public class max_min {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter first value");
        int a, b;
        a = input.nextInt();
        System.out.println("enter 2nd value");

        b = input.nextInt();
        int maximum = Math.max(a, b);
        int mimmum=Math.min(a, b);
        double sqar = Math.sqrt(maximum);
        System.out.println("the maximum value is " + maximum+ "minuman: "+mimmum+"max number squar"+sqar);

    }
}
