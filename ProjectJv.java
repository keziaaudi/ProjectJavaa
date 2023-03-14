/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projectjava;

/**
 *
 * @author keziaaudi
 */
import java.util.Scanner;

public class ProjectJav{
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        //Print display product
        System.out.println("ES Companies Portal – Cashier App 2");
        System.out.println("==================================");
        System.out.println("1. Keyboard - $49.99");
        System.out.println("2. Mouse - $19.99");
        System.out.println("3. Monitor - $99.99");

        //Jumlah stock
        int stock = 20;

        //Memilih Produk
        System.out.print("Choose : ");
        int choose = input.nextInt();

        //Menentukan kuantitas produk
        System.out.print("Input quantity [1...20] : ");
        int quantity = input.nextInt();
        System.out.println();
        if (quantity > stock) {
            System.out.println("Out of stock!");
            System.out.println("Thanks for using this application :D");
        } else {
            //If Else atau Conditional Statement
            if (choose == 1 && quantity >= 1 && quantity <= stock) {
                System.out.println("ES Companies Portal – Cashier App 2");
                System.out.println("==================================");
                System.out.println("Item's name : Keyboard");
                System.out.println("Price : $49.99");
                System.out.println("Quantity : " + quantity);
                System.out.println();
                double total = 49.99 * quantity;
                System.out.printf("Total : " + "%.2f", total);
                System.out.println();
                System.out.printf("Input your money [min " + "%.2f", total);
                System.out.print("] : ");
                double userMoney = input.nextDouble();
                System.out.println();
                if (userMoney >= total) {
                    System.out.println("Thanks for purchasing!");
                    System.out.printf("Your change : " + "%.2f", (userMoney - total));
                } else if (userMoney < total) {
                    System.out.println("Thanks for using this application :D");
                }
            } else if (choose == 2 && quantity >= 1 && quantity <= stock) {
                System.out.println("ES Companies Portal – Cashier App 2");
                System.out.println("==================================");
                System.out.println("Item's name : Mouse");
                System.out.println("Price : $19.99");
                System.out.println("Quantity : " + quantity);
                System.out.println();
                double total = 19.99 * quantity;
                System.out.printf("Total : " + "%.2f", total);
                System.out.println();
                System.out.printf("Input your money [min " + "%.2f", total);
                System.out.print("] : ");
                double userMoney = input.nextDouble();
                System.out.println();
                if (userMoney >= total) {
                    System.out.println("Thanks for purchasing!");
                    System.out.printf("Your change : " + "%.2f", (userMoney - total));
                } else if (userMoney < total) {
                    System.out.println("Thanks for using this application :D");
                }
            } else if (choose == 3 && quantity >= 1 && quantity <= stock) {
                System.out.println("ES Companies Portal – Cashier App 2");
                System.out.println("==================================");
                System.out.println("Item's name : Monitor");
                System.out.println("Price : $99.99");
                System.out.println("Quantity : " + quantity);
                System.out.println();
                double total = 99.99 * quantity;
                System.out.printf("Total : " + "%.2f", total);
                System.out.println();
                System.out.printf("Input your money [min " + "%.2f", total);
                System.out.print("] : ");
                double userMoney = input.nextDouble();
                System.out.println();
                if (userMoney >= total) {
                    System.out.println("Thanks for purchasing!");
                    System.out.printf("Your change : " + "%.2f", (userMoney - total));
                } else if (userMoney < total) {
                    System.out.println("Thanks for using this application :D");
                }
            } else {
                System.out.println("Invalid input");
            }
        }
    }
}

