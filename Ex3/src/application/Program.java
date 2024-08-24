package application;

import util.Triangle;

import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira as medidas do triângulo:");
        System.out.print("Lado 1:");
        double lado1 = sc.nextDouble();
        System.out.print("Lado 2:");
        double lado2 = sc.nextDouble();
        System.out.print("Lado 3:");
        double lado3 = sc.nextDouble();
        System.out.println("Insira os angulos do triângulo:");
        System.out.print("Angulo 1:");
        double angulo1 = sc.nextDouble();
        System.out.print("Angulo 2:");
        double angulo2 = sc.nextDouble();
        System.out.print("Angulo 3:");
        double angulo3 = sc.nextDouble();
        Triangle triangle = new Triangle(lado1, lado2, lado3, angulo1, angulo2, angulo3);
        triangle.defineTriangle();

        sc.close();
    }
}
