//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package Animalia.Vertebrata;

import Animalia.Animalia;

public class Vertebrata extends Animalia {
    private boolean spine = true;

    public Vertebrata(int idAnimal, int umur, String gender) {
        super(idAnimal, umur, gender);
    }

    public boolean isSpine() {
        return this.spine;
    }

    public void setSpine(boolean spine) {
        this.spine = spine;
    }

    public void valueSpine() {
        if (this.spine) {
            System.out.println("Vertebrata adalah hewan yang memiliki tulang belakang");
        }

    }
}
