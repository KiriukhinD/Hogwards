package Hogwards;

public class Hogwards {
    int transgress;//трансгенируют на какое-то расстояние
    int thePowerOfMagic;//сила магии
    private String name;


    Hogwards(String name, int transgress, int thePowerOfMagic) {
        this.name = name;
        this.transgress = transgress;
        this.thePowerOfMagic = thePowerOfMagic;

    }

    public int getTransgress() {
        return transgress;
    }

    public int getThePowerOfMagic() {
        return thePowerOfMagic;
    }

    public String getName() {
        return name;
    }

    public void print() {
        System.out.println(this);
    }

    private int ability() {
        return transgress + thePowerOfMagic;
    }

    public void compareHogwarts(Hogwards hogwards) {
        int ability1 = this.ability();
        int ability2 = hogwards.ability();
        if (ability1 > ability2) {
            System.out.printf("Студент %s лучше чем студент %s: %d vs %d%n  ", getName(), hogwards.getName(), ability1, ability2);
        } else if (ability2 > ability1) {
            System.out.printf("Студент %s лучше чем студент %s: %d vs %d%n  ", hogwards.getName(), getName(), ability2, ability1);
        } else {
            System.out.printf("Студент %s такой же как студент %s: %d vs %d%n  ", hogwards.getName(), getName(), ability1, ability2);

        }
    }

    @Override
    public String toString() {
        return String.format("Студент " + name + ",телеротация " + transgress + ",сила магии " + thePowerOfMagic);
    }

}
