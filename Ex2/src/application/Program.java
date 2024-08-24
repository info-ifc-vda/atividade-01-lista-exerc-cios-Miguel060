package application;

import util.Convert;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter salary value: ");
        double salary = sc.nextDouble();
        System.out.print("Enter quantity kilowatt: ");
        double quantity = sc.nextDouble();
        System.out.println("Value per kilowatt: " + Convert.convertUn(quantity, salary));
        System.out.println("Value total: "+ Convert.convertAll(salary, quantity));

        sc.close();
    }
}
