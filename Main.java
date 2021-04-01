/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package overloading_rriding;


import java.util.Scanner;

/**
 *
 * @author Dhimaz Nur Ramadhan
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("--------------------------------");
        System.out.println("Kalkulator luas bangun datar : ");
        System.out.println("1.Persegi");
        System.out.println("2.Persegi panjang");
        System.out.println("3.Segitiga");
        System.out.println("4.Lingkaran");
        System.out.println("--------------------------------");
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan pilihan anda(angka) : ");
        int pilih = in.nextInt();
        Main objek = new Main();
        ExtendBangunDatar objek1 = new ExtendBangunDatar();
        switch (pilih) {
            case 1:
                objek.BangunDatar(pilih, pilih, pilih);
                break;
            case 4:
                objek.BangunDatar(pilih, pilih);
                break;
            case 3:
                objek.BangunDatar(pilih, pilih, pilih, pilih);
                break;
            case 2:
                objek1.BangunDatar(pilih, pilih, pilih);
                break;
            default:
                break;
        }   
    }
    
    
    void BangunDatar(int panjang,int lebar,int hasil){//Persegi
        Scanner in2 = new Scanner(System.in);
        System.out.print("Masukkan panjang sisi : ");
        panjang = in2.nextInt();
        hasil = panjang*panjang;
        System.out.println("Hasilnya : "+hasil);
    }
    
    void BangunDatar(double jari,double hasil){//Lingkaran
        Scanner in3 = new Scanner(System.in);
        System.out.print("Masukkan jari jari : ");
        jari = in3.nextInt();
        hasil = 3.14*jari*jari;
        System.out.println("Hasilnya : "+hasil);   
    }       
    
     void BangunDatar(int alas,int tinggi,int hasil,int setengah){//Segi Tiga
        Scanner in4 = new Scanner(System.in);
        System.out.print("Masukkan alas : ");
        alas = in4.nextInt();
        System.out.print("Masukkan tinggi : ");
        tinggi = in4.nextInt();
        setengah=1/2;
        hasil = alas*tinggi;
        
        System.out.println("Hasilnya = "+hasil); 
     }
}
