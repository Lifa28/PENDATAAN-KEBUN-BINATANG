public class Main {
    public static void main(String[] args) {
        herbivora kambing = new herbivora();
        System.out.println("_______________");
        System.out.println("Object Dari Kambing |");
        kambing.setData("Kambing |", "Herbivora | ", "Rumput |", " darat  |", "mbee....|");
        kambing.tampilData();
        kambing.memakan();
        System.out.println("____________");

        herbivora sapi = new herbivora();
        System.out.println("___________");
        System.out.println("Object Dari Sapi |");
        sapi.setData("Sapi  |", "Herbivora  |", "Rumput   | ", "darat", "eumoo.....|");
        sapi.tampilData();
        sapi.memakan();
        System.out.println("____________");

        herbivora kuda = new herbivora();
        System.out.println("___________");
        System.out.println("Object Dari kuda |");
        kuda.setData("kuda  |", "Herbivora  |", "Rumput   | ", "darat", "ckck.....|");
        kuda.tampilData();
        kuda.memakan();
        System.out.println("____________");

        herbivora kerbau = new herbivora();
        System.out.println("___________");
        System.out.println("Object Dari kerbau |");
        kerbau.setData("kerbau |", "Herbivora  |", "Rumput   | ", "darat", "ngoo.....|");
        kerbau.tampilData();
        kerbau.memakan();
        System.out.println("____________");


        //karnivora
        karnivora kucing = new karnivora();
        System.out.println("___________");
        System.out.println("Object Dari kucing |");
        kucing.setData("kucing |", "Karnivora  |", "Daging Ikan  | ", "darat", "Meong.....|");
        kucing.tampilData();
        kucing.memakan();
        System.out.println("____________");

        karnivora harimau = new karnivora();
        System.out.println("___________");
        System.out.println("Object Dari kucing |");
        harimau.setData("Harimau |", "Karnivora  |", "Daging   | ", "darat", "GRRR.....|");
        harimau.tampilData();
        harimau.memakan();
        System.out.println("____________");

        karnivora Singa = new karnivora();
        System.out.println("___________");
        System.out.println("Object Dari kucing |");
        Singa.setData("Singa |", "Karnivora  |", "Daging   | ", "darat", "AUMMM.....|");
        Singa.tampilData();
        Singa.memakan();
        System.out.println("____________");

        omnivora ayam = new omnivora();
        System.out.println("___________");
        System.out.println("Object Dari ayam |");
        ayam.setData("ayam |", "Karnivora  |", "Cacing   | ", "darat", "kukuruyuk.....|");
        ayam.tampilData();
        ayam.memakan();
        System.out.println("____________");

        omnivora bebek = new omnivora();
        System.out.println("___________");
        System.out.println("Object Dari Bebek |");
        bebek.setData("Bebek |", "Karnivora  |", "Cacing   | ", "darat", "wekwek.....|");
        bebek.tampilData();
        bebek.memakan();
        System.out.println("____________");
    }
}