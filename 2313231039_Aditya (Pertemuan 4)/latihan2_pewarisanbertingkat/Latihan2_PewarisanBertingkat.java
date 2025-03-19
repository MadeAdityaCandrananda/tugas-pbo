/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.latihan2_pewarisanbertingkat;

/**
 *
 * @author Made Aditya
 */
class Hewan {
    void makan() {
        System.out.println("Hewan sedang makan.");
    }
}

// Kelas anak (subclass) yang mewarisi dari Hewan
class Kucing extends Hewan {
    void suara() {
        System.out.println("Meow!");
    }
}

// Kelas anak (subclass) yang mewarisi dari Kucing
class KucingAnggora extends Kucing {
    void jenis() {
        System.out.println("Ini adalah kucing anggora.");
    }
}

// Main class untuk menjalankan program
public class Latihan2_PewarisanBertingkat {
    public static void main(String[] args) {
        KucingAnggora anggora = new KucingAnggora();

        anggora.makan(); // Memanggil metode dari superclass Hewan
        anggora.suara(); // Memanggil metode dari subclass Kucing
        anggora.jenis(); // Memanggil metode dari subclass KucingAnggora
    }
}
