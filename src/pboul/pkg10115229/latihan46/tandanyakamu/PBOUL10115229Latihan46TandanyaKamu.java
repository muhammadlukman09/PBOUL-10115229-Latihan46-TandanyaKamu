/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboul.pkg10115229.latihan46.tandanyakamu;

import java.util.Calendar;
import java.util.Scanner;

/**
 *
 * @author Lukman
 * NIM      : 10115229
 * NAMA     : MUHAMMAD LUKMAN HAKIM
 * KELAS    : PBO ULANG   
 */
public class PBOUL10115229Latihan46TandanyaKamu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int yearNow = Calendar.getInstance().get(Calendar.YEAR);
        Age age1 = new Age (yearNow);
        System.out.print("Masukkan Tahun Lahir Anda : ");
        Scanner scn = new Scanner(System.in);
        int yearBirth = scn.nextInt();
        age1.setYearBirth(yearBirth);
        System.out.print("Kamu "+ age1.tandanyaKamu(age1.hitungUmur())+"\n\n");
    }
    
}
