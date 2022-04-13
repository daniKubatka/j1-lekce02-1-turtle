package net.sevecek.turtle;

import net.sevecek.turtle.engine.*;

public class HlavniProgram {

    private Turtle zofka;

    public void main(String[] args) {
        zofka = new Turtle();

        udelejDomecek();
    }

    public void udelejCtverec(){
        for (int i = 0; i < 4; i++) {
            zofka.turnRight(90);
            zofka.move(100);
        }

    }

    public void udelejTrojuhelnik(){
        zofka.turnRight(45);
        zofka.move(72);
        zofka.turnRight(90);
        zofka.move(72);
        zofka.turnRight(135);
        zofka.move(100);
    }

    private void udelejDomecek(){
        udelejCtverec();
        udelejTrojuhelnik();
    }


}
