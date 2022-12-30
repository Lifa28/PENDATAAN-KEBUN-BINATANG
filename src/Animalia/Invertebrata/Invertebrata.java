//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package Animalia.Invertebrata;

import Animalia.Animalia;

public class Invertebrata extends Animalia {
    private boolean spine = false;

    public Invertebrata(int idAnimal, int umur, String gender) {
        super(idAnimal, umur, gender);
    }

    public boolean isSpine() {
        return this.spine;
    }

    public void setSpine(boolean spine) {
        this.spine = spine;
    }

    public void valueSpine() {
        if (!this.spine) {
            System.out.println("Invertebrata adalah hewan yang tidak memiliki tulang belakang");
        }

    }
}
