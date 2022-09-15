package Hogwards;

public class Gryffindor extends Hogwards {
    int nobility;//благородство
    int honor;//честь
    int bravery;//храбрость


    Gryffindor(String name, int nobility, int honor, int bravery, int transgress, int thePowerOfMagic) {
        super(name, transgress, thePowerOfMagic);

        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public int getNobility() {
        return nobility;
    }

    public int getHonor() {
        return honor;
    }

    public int getBravery() {
        return bravery;
    }

    private int ability() {
        return nobility + honor + bravery;
    }

    public void compareGryffindor(Gryffindor gryffindor) {
        int ability1 = this.ability();
        int ability2 = gryffindor.ability();
        if (ability1 > ability2) {
            System.out.printf("Студент %s лучше чем студент %s: %d vs %d%n  ", getName(), gryffindor.getName(), ability1, ability2);
        } else if (ability2 > ability1) {
            System.out.printf("Студент %s лучше чем студент %s: %d vs %d%n  ", gryffindor.getName(), getName(), ability2, ability1);
        } else {
            System.out.printf("Студент %s такой же как студент %s: %d vs %d%n  ", gryffindor.getName(), getName(), ability1, ability2);

        }
    }


    @Override
    public String toString() {
        return super.toString() + ",благородство " + nobility + ",честь " + honor + ",храбрость " + bravery;
    }

}
