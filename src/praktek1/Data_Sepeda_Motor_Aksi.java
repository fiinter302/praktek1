/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktek1;

/**
 *
 * @author Macan Sakti
 */
public class Data_Sepeda_Motor_Aksi {
    public static void main(String[] args) {
        Data_Sepeda_Motor Yamaha = new Data_Sepeda_Motor();
        Data_Sepeda_Motor Honda = new Data_Sepeda_Motor();
        Data_Sepeda_Motor Kawasaki = new Data_Sepeda_Motor();
        
        Yamaha.Produk="Yamaha";
        Yamaha.Merek="Vega";
        Yamaha.Kapasitas="113cc";
        Yamaha.Warna="Hitam";
        Yamaha.Type="Bebek";
        
        Honda.Produk="Honda";
        Honda.Merek="CB";
        Honda.Kapasitas="150cc";
        Honda.Warna="Putih";
        Honda.Type="Naket";
        
        Kawasaki.Produk="Kawasaki";
        Kawasaki.Merek="Ninja";
        Kawasaki.Kapasitas="250cc";
        Kawasaki.Warna="Hijau";
        Kawasaki.Type="Sport";
        
        Yamaha.cetakInfo();
        Honda.cetakInfo();
        Kawasaki.cetakInfo();
     
    
    }
    
}
