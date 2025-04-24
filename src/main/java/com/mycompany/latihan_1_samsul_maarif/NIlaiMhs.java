/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.latihan_1_samsul_maarif;
import java.util.Scanner; // digunakan untuk membaca input
/**
 *
 * @author Administrator
 */
public class NIlaiMhs {
    
    public static void main (String [] args){
        Scanner input  = new Scanner (System.in);
        String nim, nama, grade;
        double uts, uas, nih, nia,rata;
        
        System.out.println("Data");
        System.out.print("NIM: "); nim = input.next();
        System.out.print("Nama: "); nama = input.next();
        System.out.print("Nilai Harian: "); nih = input.nextDouble();
        System.out.print("Nilai Absen: "); nia = input.nextDouble();
        System.out.print("Nilai UTS: "); uts = input.nextDouble();
        System.out.print("Nilai UAS: "); uas = input.nextDouble();
        
        rata = (uts + uas + nih + nia) / 4;
        
        if(rata < 50)
            grade = "E";
        else if(rata < 60)
            grade = "D";
        else if(rata < 70)
            grade = "C";
        else if(rata < 80)
            grade = "B";
        else 
            grade = "A";
        
        System.out.println("=============================================================================");
        System.out.println("NIM\tNama\tNih\tNia\t\tUTS\tUAS\tRata2\tGrade");
        System.out.println("=============================================================================");
        System.out.println(nim + "\t" + nama + "\t" + nih + "\t" + nia + "\t" + uts + "\t" + uas + "\t" + rata + "\t" + grade);
        System.out.println("");
        System.out.println("");
              
    }
    
}
