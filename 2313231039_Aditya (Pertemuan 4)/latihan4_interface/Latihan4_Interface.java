/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.latihan4_interface;

/**
 *
 * @author Made Aditya
 */
// Interface Hewan
interface Hewan {
    void makan();
}

// Interface Mamalia
interface Mamalia {
    void menyusui();
}

// Class Kucing yang mengimplementasikan interface Hewan dan Mamalia
class Kucing implements Hewan, Mamalia {
    // Implementasi method dari interface Hewan
    public void makan() {
        System.out.println("Kucing makan ikan.");
    }

    // Implementasi method dari interface Mamalia
    public void menyusui() {
        System.out.println("Kucing menyusui anaknya.");
    }
}

// Class utama untuk menjalankan program
public class Latihan4_Interface {
    public static void main(String[] args) {
        // Membuat objek Kucing
        Kucing kucing = new Kucing();

        // Memanggil method dari interface Hewan
        kucing.makan();

        // Memanggil method dari interface Mamalia
        kucing.menyusui();
    }
}