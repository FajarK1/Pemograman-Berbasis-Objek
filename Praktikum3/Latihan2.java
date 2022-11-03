/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum3;

import java.util.Scanner;

public class Latihan2 {
    public static void main(String[] args){
        int belanja = 0;
        Scanner scan = new Scanner(System.in).useDelimiter("\n");
        System.out.print("Total Belanja : Rp.");
        belanja = scan.nextInt();
        if (belanja >100000) {
            System.out.println("Selamat anda mendaptkan diskon !");
        }
        System.out.println("Terima Kasih...");
    }
}
