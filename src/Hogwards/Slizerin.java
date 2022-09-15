package Hogwards;

public class Slizerin extends Hogwards {


    private int cunning;//хитрость
    private int determination;//решительность
    private int ambition; //амбициозность
    private int resourcefulness;//находчивость
    private int lustForPower;//жажда власти


    Slizerin(String name, int cunning, int determination, int ambition, int resourcefulness, int lustForPower, int transgress, int thePowerOfMagic) {
        super(name, transgress, thePowerOfMagic);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.lustForPower = lustForPower;
    }


    public int getCunning() {
        return cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public int getLustForPower() {
        return lustForPower;
    }

    private int ability() {
        return cunning + determination + ambition + resourcefulness + lustForPower;
    }

    public void compareSliserin(Slizerin slizerin) {
        int ability1 = this.ability();
        int ability2 = slizerin.ability();
        if (ability1 > ability2) {
            System.out.printf("Студент %s лучше чем студент %s: %d vs %d%n  ", getName(), slizerin.getName(), ability1, ability2);
        } else if (ability2 > ability1) {
            System.out.printf("Студент %s лучше чем студент %s: %d vs %d%n  ", slizerin.getName(), getName(), ability2, ability1);
        } else {
            System.out.printf("Студент %s такой же как студент %s: %d vs %d%n  ", slizerin.getName(), getName(), ability1, ability2);

        }
    }


    @Override
    public String toString() {
        return super.toString() + ",хитрость " + cunning + ",решительность " + determination + ",амбиция " + ambition + ",находчивость " + resourcefulness + ",жажда власти " + lustForPower;
    }

}
