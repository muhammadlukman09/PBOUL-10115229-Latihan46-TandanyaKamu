/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboul.pkg10115229.latihan46.tandanyakamu;

/**
 *
 * @author Lukman
 * NIM      : 10115229
 * NAMA     : MUHAMMAD LUKMAN HAKIM
 * KELAS    : PBO ULANG   
 */
public class Age {
    
    private int yearBirth;
    private int yearNow;
    private String red;
    
    public Age(){
    }
    
    public Age (int yearNow){
    this.yearNow = yearNow;
    }

    public int getYearBirth() {
        return yearBirth;
    }

    public void setYearBirth(int yearBirth) {
        this.yearBirth = yearBirth;
    }

    public int getYearNow() {
        return yearNow;
    }
    
   public int hitungUmur(){
       int umur;
       umur = yearNow - yearBirth;
       return umur;
   }
   
   public String tandanyaKamu(int umur){
       if(umur > 0 && umur < 150) {
           
           if (umur <= 5){
               red = "Lagi Lucu-Lucunya";   
           }
           else 
               if (umur <=10){
                   red = "Masih Anak-Anak";
                   
               }
           else
                   if (umur <=13){
                       red = "Masih Remadja";
                       
                   }
           else
                       if (umur <=19){
                           red = "Alay";
                           
                       }
           else
                           if (umur <=29){
                               red ="Lagi Galau Nyari Jodoh";
                               
                           }
           else
                               if (umur <=35){
                                   red = "Lagi Sibuk Nyari Uang";
                                   
                               }
           else
                                   if (umur <=150){
                                       red = "Sudah Tua";
                                       
                                   }
           else
                                       {
                                           red = "Tidak Terdektesi Di Kehidupan";
                                       }
       }
       return red;
       
   }
   }
    
    

    
    

