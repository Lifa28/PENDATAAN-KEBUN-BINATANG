//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package Animalia.Invertebrata;

public class arthropoda extends Invertebrata {
    private String ciriArthropoda = "Ciri-ciri athropoda:\n1. Tubuh dan kaki yang bersegmen.\n2. Termasuk golongan hewan triplobastik selomata, yaitu rongga tubuh sejati dan memiliki tiga lapisan tubuh.\n3. Tubuh diselimuti eksoskeleton (terbuat dari senyawa protein dan kitin) yang berfungsi untuk melindungi dan membentuk kerangka tubuh.\n4. Tubuh terbagi menjadi tiga bagian, yaitu kepala (caput), dada (toraks), dan perut (abdomen).\n 5. Sudah memiliki sistem saraf, sistem pencernaan, sistem ekskresi, sistem peredaran darah maupun indra.\n6. Menggunakan insang, trakea, permukaan tubuh, atau paru-paru buku sebagai alat respirasi.\n7. Termasuk hewan berumah dua artinya jenis kelamin sudah terpisah antara jantan dan betina.\n8. Reproduksi dilakukan dengan seksual dan aseksual. Seksual, yaitu dengan fertilisasi internal (pembuahan terjadi di dalam tubuh). Aseksual, yaitu dengan partenogenesis (jantan tidak terlibat dalam proses pembuahan) dan paedogenesis (reproduksi terjadi pada individu muda).\n";
    private int jumlahKaki;
    private String namaBinatang;

    public arthropoda(int idAnimal, int umur, String gender, int jumlahKaki, String namaBinatang) {
        super(idAnimal, umur, gender);
        this.jumlahKaki = jumlahKaki;
        this.namaBinatang = namaBinatang;
    }

    public String getCiriArthropoda() {
        return this.ciriArthropoda;
    }

    public void setCiriArthropoda(String ciriArthropoda) {
        this.ciriArthropoda = ciriArthropoda;
    }

    public int getJumlahKaki() {
        return this.jumlahKaki;
    }

    public void setJumlahKaki(int jumlahKaki) {
        this.jumlahKaki = jumlahKaki;
    }

    public String getNamaBinatang() {
        return this.namaBinatang;
    }

    public void setNamaBinatang(String namaBinatang) {
        this.namaBinatang = namaBinatang;
    }
}
