//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package Animalia;

public class Animalia {
    private int idAnimal;
    private int umur;
    private String ciriAnimal;
    private String gender;

    public Animalia(int idAnimal, int umur, String gender) {
        this.idAnimal = idAnimal;
        this.umur = umur;
        this.ciriAnimal = "1. Bersifat heterotrof ( tidak memiliki klorofil )\n\n2. Bersifat motil ( aktif bergerak pindah tempat )\n\n3. Multiseluler , eukariotik, dengan sel tanpa dinding sel\n\n4. bereaksi cepat terhadap rangsang";
        this.gender = gender;
    }

    public int getIdAnimal() {
        return this.idAnimal;
    }

    public void setIdAnimal(int idAnimal) {
        this.idAnimal = idAnimal;
    }

    public int getUmur() {
        return this.umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    public String getCiriAnimal() {
        return this.ciriAnimal;
    }

    public void setCiriAnimal(String ciriAnimal) {
        this.ciriAnimal = ciriAnimal;
    }

    public String getGender() {
        return this.gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
