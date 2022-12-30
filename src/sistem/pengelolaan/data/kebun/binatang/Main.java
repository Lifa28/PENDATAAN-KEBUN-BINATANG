//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package sistem.pengelolaan.data.kebun.binatang;

import DataWahana.InisialisasiWahana;
import ProfilPetugas.Inisialisasi;
import java.io.IOException;

public class Main {
    public Main() {
    }

    public static void main(String[] args) throws IOException {
        System.out.println("\n");
        System.out.println("\t =========================================");
        System.out.println("\t =PROGRAM PENDATAAN KEBUN BINATANG=");
        System.out.println("\t =========================================");
        System.out.println("TUGAS AKHIR");
        System.out.println("LIFA (2100018404)");
        System.out.println("KELAS H ");
        System.out.println("\n");
        Inisialisasi init = new Inisialisasi();
        init.inisialisasi();
        InisialisasiWahana inisialisasi = new InisialisasiWahana();
        inisialisasi.InisialisasiWahana();
        sistem.pengelolaan.data.kebun.binatang.MainMenu Balik = new sistem.pengelolaan.data.kebun.binatang.MainMenu();
        Balik.MainMenu();
    }
}
