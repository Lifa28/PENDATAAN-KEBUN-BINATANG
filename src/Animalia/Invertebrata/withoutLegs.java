//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package Animalia.Invertebrata;

public class withoutLegs extends Animalia.Invertebrata.Invertebrata {
    private String ciriWL = "Invertebrata/Avertebrata yang tidak memiliki kaki adalah fillum golongan selain athropoda,\nalias tujuh lainnya, yaitu:\n1. Annelida\n2. Coelenterata\n3. Echinodermata\n4. Mollusca\n5. Nemathelminthes\n6. Platyhelminthes\n7. Porifera\nKetujuh fillum tersebut ada yang memiliki bentuk seperti cacing dan ada yang tidak seperti cacing\n";
    private String namaBinatang;

    public withoutLegs(int idAnimal, int umur, String gender, String namaBinatang) {
        super(idAnimal, umur, gender);
        this.namaBinatang = namaBinatang;
    }

    public String getCiriWL() {
        return this.ciriWL;
    }

    public void setCiriWL(String ciriWL) {
        this.ciriWL = ciriWL;
    }

    public String getNamaBinatang() {
        return this.namaBinatang;
    }

    public void setNamaBinatang(String namaBinatang) {
        this.namaBinatang = namaBinatang;
    }
}
