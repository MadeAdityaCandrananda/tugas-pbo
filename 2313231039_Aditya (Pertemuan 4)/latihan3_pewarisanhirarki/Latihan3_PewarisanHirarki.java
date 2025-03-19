/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.latihan3_pewarisanhirarki;

/**
 *
 * @author Made Aditya
 */
// Superclass
class Hewan {
    void makan() {
        System.out.println("Hewan sedang makan.");
    }
}

// Subclass Kucing
class Kucing extends Hewan {
    void suara() {
        System.out.println("Meow!");
    }
}

// Subclass Anjing
class Anjing extends Hewan {
    void suara() {
        System.out.println("Guk Guk!");
    }
}

// Class utama untuk menjalankan program
public class Latihan3_PewarisanHirarki {
    public static void main(String[] args) {
        // Membuat objek Kucing
        Kucing kucing = new Kucing();
        
        // Memanggil method dari class Hewan
        kucing.makan();
        
        // Memanggil method dari class Kucing
        kucing.suara();
        
        // Membuat objek Anjing
        Anjing anjing = new Anjing();
        
        // Memanggil method dari class Hewan
        anjing.makan();
        
        // Memanggil method dari class Anjing
        anjing.suara();
    }
}
