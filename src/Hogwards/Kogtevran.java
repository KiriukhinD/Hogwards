package Hogwards;

public class Kogtevran extends Hogwards {


    int smart;//умный
    int wise;//мудрый
    int witty;//остроумный
    int fullOfCreativity;//полный творчества


    Kogtevran(String name, int smart, int wise, int witty, int fullOfCreativity, int transgress, int thePowerOfMagic) {
        super(name, transgress, thePowerOfMagic);
        this.smart = smart;
        this.wise = wise;
        this.witty = witty;
        this.fullOfCreativity = fullOfCreativity;

    }


    public int getSmart() {
        return smart;
    }

    public int getWise() {
        return wise;
    }

    public int getWitty() {
        return witty;
    }

    public int getFullOfCreativity() {
        return fullOfCreativity;
    }

    private int ability() {
        return smart + wise + witty + fullOfCreativity;
    }

    public void compareKogtevran(Kogtevran kogtevran) {
        int ability1 = this.ability();
        int ability2 = kogtevran.ability();
        if (ability1 > ability2) {
            System.out.printf("Студент %s лучше чем студент %s: %d vs %d%n  ", getName(), kogtevran.getName(), ability1, ability2);
        } else if (ability2 > ability1) {
            System.out.printf("Студент %s лучше чем студент %s: %d vs %d%n  ", kogtevran.getName(), getName(), ability2, ability1);
        } else {
            System.out.printf("Студент %s такой же как студент %s: %d vs %d%n  ", kogtevran.getName(), getName(), ability1, ability2);

        }
    }


    @Override
    public String toString() {
        return super.toString() + "умный " + smart + ",мудрость " + wise + ",остроуимие" + witty + ",творчество  " + fullOfCreativity;
    }
}
