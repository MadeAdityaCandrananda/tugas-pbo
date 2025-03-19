/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.latihan5_super;

/**
 *
 * @author Made Aditya
 */
// Superclass Hewan
class Hewan {
    String nama;

    // Konstruktor Hewan
    Hewan(String nama) {
        this.nama = nama;
    }

    // Method info
    void info() {
        System.out.println("Nama: " + nama);
    }
}

// Subclass Kucing
class Kucing extends Hewan {
    // Konstruktor Kucing
    Kucing(String nama) {
        super(nama); // Memanggil konstruktor superclass (Hewan)
    }
}

// Class utama untuk menjalankan program
public class Latihan5_Super {
    public static void main(String[] args) {
        // Membuat objek Kucing
        Kucing kucing = new Kucing("Kiul");

        // Memanggil method info() dari class Hewan
        kucing.info();
    }
}
