/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum3;

import java.util.Scanner;

public class Latihan4 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Apakah anda mahasiswa ITS Mandiri, Muhammad Fajar Khamisa ? ( Y jika setuju) ");
        String jawaban = scan.nextLine();
        if("Y".equals(jawaban)){
            System.out.println("Selamat berjuang di ITS Mandiri, Muhammad Fajar Khamisa ");
        }else{
            System.out.println("Selamat datang di ITS Mandiri, Muhammad Fajar Khamisa");
        }
    }
}
