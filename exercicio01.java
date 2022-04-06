package com.company;

import java.util.Scanner;

//*Faça um Programa que peça dois números e imprima o maior deles.
public class exercicio01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" digite um numero ");
        double primeiroNumero = scanner.nextDouble();
        System.out.println(" digite o segundo numero ");
        Double segundoNumero = scanner.nextDouble();

        if (primeiroNumero > segundoNumero){
            System.out.println(" o primeiro e maior "); }
        else if (segundoNumero > primeiroNumero) {
            System.out.println(" o segundoNumero e maior " +segundoNumero);
        }
        }

    }
