package Hogwards;

public class Puffendui extends Hogwards {

    int industrious;//трудолюбивы
    int faithful;//верные
    int honest;//честные

    Puffendui(String name, int industrious, int faithful, int honest, int transgress, int thePowerOfMagic) {
        super(name, transgress, thePowerOfMagic);
        this.industrious = industrious;
        this.faithful = faithful;
        this.honest = honest;

    }


    public int getIndustrious() {
        return industrious;
    }

    public int getFaithful() {
        return faithful;
    }

    public int getHonest() {
        return honest;
    }

    private int ability() {
        return industrious + faithful + honest;
    }

    public void comparePuffendui(Puffendui puffendui) {
        int ability1 = this.ability();
        int ability2 = puffendui.ability();
        if (ability1 > ability2) {
            System.out.printf("Студент %s лучше чем студент %s: %d vs %d%n  ", getName(), puffendui.getName(), ability1, ability2);
        } else if (ability2 > ability1) {
            System.out.printf("Студент %s лучше чем студент %s: %d vs %d%n  ", puffendui.getName(), getName(), ability2, ability1);
        } else {
            System.out.printf("Студент %s такой же как студент %s: %d vs %d%n  ", puffendui.getName(), getName(), ability1, ability2);

        }
    }


    @Override
    public String toString() {
        return super.toString() + ",трудолюбие " + industrious + ",верность " + faithful + ",честность " + honest;
    }
}
