package application;

import entities.Worker;

import java.util.Scanner;
/*Faça um programa que recebe o número de horas trabalhadas, e o valor da hora traba-
lhada. Calcule e mostre o salário a receber seguindo estas regras:
        • o salário bruto equivale ao número de horas trabalhadas multiplicado pelo valor da
hora trabalhada;
• o imposto equivale a 30% do salário bruto;
• o salário a receber equivale ao salário bruto menos o imposto.*/
public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Insira o numero de horas trabalhadas: ");
        double hoursWorked = sc.nextDouble();
        sc.nextLine();
        System.out.print("Insira o valor por hora: ");
        double valuePerHour = sc.nextDouble();
        sc.nextLine();
        Worker worker = new Worker(valuePerHour, hoursWorked);
        System.out.println("Salario Bruto: "+ worker.gross_Salary(valuePerHour, hoursWorked));
        System.out.println("Salario Liquido: "+ worker.net_salary());


        sc.close();
    }
}
