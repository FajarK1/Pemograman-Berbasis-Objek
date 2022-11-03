
package Praktikum3;

import java.util.Scanner;

public class Soal3 {
    public static void main(String []args){
        Scanner input = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Pilih Metode");
        System.out.println("1. Menghitung Luas Persegi");
        System.out.println("2. Menghitung Keliling Persegi");
        System.out.print("Pilihan = ");
        int input_menu = input.nextInt();
        
        switch (input_menu){
            case 1 :
                System.out.print("Masukkan Panjang Sisi Persegi = ");
                int s = input.nextInt();
                int luas_persegi = s * s;
                System.out.println("Luas Persegi adalah = " +luas_persegi+" cm");
            break;
            
            case 2 :
                System.out.print("Masukkan Panjang Sisi Persegi = ");
                int s1 = input.nextInt();
                int keliling_persegi = 4 * s1;
                System.out.println("Keliling Persegi adalah = "+keliling_persegi+" cm");
            break;
            default:
                System.out.println("SISTEM ERROR");
        }
    }
}
