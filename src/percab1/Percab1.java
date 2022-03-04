/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package percab1;

/**
 *
 * @author LENOVO
 */import java.util.Scanner;
public class Percab1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int bungaMelati, bungaMawar, bungaMatahari, JumlahBunga;
        double Totalbayar, HargaBunga, diskon, total;
        
        Scanner input=new Scanner (System.in);
        
        System.out.println("<<__Toko Bunga Florist");
        System.out.print("Total Bunga Melati = ");
        bungaMelati=input.nextInt();
        System.out.print("Total Bunga Mawar = ");
        bungaMawar=input.nextInt();
        System.out.print("Total Bunga Matahari = ");
        bungaMatahari=input.nextInt();
        
        JumlahBunga = bungaMelati+bungaMawar+bungaMatahari;
        
        System.out.println("Jumlah Bunga Total = "+ JumlahBunga);
        
        HargaBunga=4500.5;
        total = (bungaMelati+bungaMawar+bungaMatahari)* HargaBunga;
        
        if (total>50000) {
            diskon = 0.2 * total;
            Totalbayar = total - diskon;
            System.out.println("Selamat Anda Mendapatkan Diskon 20%");
            System.out.println("<<__Struk Nota Pembelian__>>");
            System.out.println("Total Harga Yang Harus Di Bayar = Rp "+ Totalbayar);
            
        }else{
            System.out.println("Anda Tidak Mendapatkan Diskon");
            System.out.println("<<__Struk Nota Pembelian__>>");
            System.out.println("Total Harga Yang Harus Di Bayar = Rp "+ total);
        }
        
        
    }
    
}
