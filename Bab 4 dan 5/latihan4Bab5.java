/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bab4;

import java.util.Scanner;
/**
 *
 * @author Lenovo
 */
public class latihan4Bab5 {
    public static void main(String[] args) {
        String huruf;
        Scanner h1 = new Scanner(System.in).useDelimiter("\n");
        System.out.print("Masukkan Huruf Yang Mau di Konversi = ");
        huruf = h1.nextLine();
    
    switch (huruf){
        case "A"  :
            System.out.println(  huruf + " adalah 4");
            break;
        case "B" :
            System.out.println(  huruf + " adalah 3");
            break;
        case "C" :
             System.out.println(  huruf + " adalah 2");
             break;
        case "D" :
            System.out.println(  huruf + " adalah 1");
            break;
        case "E" :
            System.out.println(  huruf + " adalah 0");
            break;
        }
    }
}
