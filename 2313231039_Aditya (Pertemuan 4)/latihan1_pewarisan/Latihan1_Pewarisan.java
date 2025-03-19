/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.latihan1_pewarisan;

/**
 *
 * @author Made Aditya
 */
// Kelas induk (superclass)
class Hewan {
    String nama;

    void makan() {
        System.out.println(nama + " sedang makan.");
    }
}

// Kelas anak (subclass) yang mewarisi dari Hewan
class Kucing extends Hewan {
    void suara() {
        System.out.println(nama + " mengeong: Meow!");
    }
}

// Main class untuk menjalankan program
public class Latihan1_Pewarisan {
    public static void main(String[] args) {
        Kucing kucing1 = new Kucing();
        kucing1.nama = "Kiul";
        
        kucing1.makan(); // Memanggil metode dari superclass
        kucing1.suara(); // Memanggil metode dari subclass
    }
}
