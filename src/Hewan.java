public class Hewan {
    private String namahewan;
    private String jenis;
    private String makanan;
    private String hidup;
    private String suara;

    public void setData(String nh, String jns, String mknn, String hdp, String suara){
        this.namahewan = nh;
        this.jenis = jns;
        this.makanan = mknn;
        this.hidup = hdp;
        this.suara = suara;
    }

    public void tampilData(){
        System.out.println("Nama Hewan  : "+this.namahewan);
        System.out.println("Jenis       : "+this.jenis);
        System.out.println("Makanan     : "+this.makanan);
        System.out.println("Hidup di    : "+this.hidup);
        System.out.println("Suara       : "+this.suara);
    }
}


