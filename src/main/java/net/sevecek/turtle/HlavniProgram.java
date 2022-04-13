package net.sevecek.turtle;

import net.sevecek.turtle.engine.*;

public class HlavniProgram {
    Turtle zofka;

    public void main(String[] args) {
        zofka = new Turtle();
        nakresliMesto(zofka);
    }

    public void udelejCtverec(Turtle zelva){
        for (int i = 0; i < 4; i++) {
            zelva.turnRight(90);
            zelva.move(100);
        }

    }

    public void udelejTrojuhelnik(Turtle zelva){
        zelva.turnRight(45);
        zelva.move(72);
        zelva.turnRight(90);
        zelva.move(72);
        zelva.turnRight(135);
        zelva.move(100);
    }

    private void udelejDomecek(Turtle zelva){
        udelejCtverec(zelva);
        udelejTrojuhelnik(zelva);
    }

    private void nakresliMesto(Turtle zelva){
        zelva.setLocation(50, 150);
        udelejDomecek(zelva);
        zelva.penUp();
        zelva.turnRight(180);
        zelva.move(200);
        zelva.penDown();
        zelva.turnLeft(90);
        udelejDomecek(zelva);
    }


}
