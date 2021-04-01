/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package overloading_rriding;

import static java.lang.System.in;
import java.util.Scanner;

/**
 *
 * @author Dhimaz Nur Ramadhan
 */
public class ExtendBangunDatar extends Main {
    
    @Override
    void BangunDatar (int panjang,int lebar,int hasil){//Persegi Panjang                    
        Scanner in = new Scanner (System.in);
        System.out.print("Masukkan panjang : ");
        panjang=in.nextInt();
        System.out.print("Masukkan lebar : ");
        lebar = in.nextInt();
        hasil = panjang*lebar;
        System.out.println("Hasilnya : "+hasil);                              
    }
}
    