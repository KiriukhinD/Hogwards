package Hogwards;

public class Main {
    public static void main(String[] args) {

        Slizerin slizerinStudent1 = new Slizerin("Draco Malfoy", 40, 65, 55, 32, 80, 67, 87);
        Slizerin slizerinStudent2 = new Slizerin("Graham Montague", 65, 21, 69, 34, 55, 76, 89);
        Slizerin slizerinStudent3 = new Slizerin("Gregory Goyle", 41, 96, 87, 22, 54, 90, 41);
        slizerinStudent1.print();
        slizerinStudent2.print();
        slizerinStudent3.print();

        System.out.println();

        Gryffindor gryffindorsStudent1 = new Gryffindor("Garri Potter", 85, 45, 25, 45, 67);
        Gryffindor gryffindorsStudent2 = new Gryffindor("Germiona Greinj", 25, 56, 58, 43, 78);
        Gryffindor gryffindorsStudent3 = new Gryffindor("Ron Uyzli", 55, 89, 100, 65, 87);
        gryffindorsStudent1.print();
        gryffindorsStudent2.print();
        gryffindorsStudent3.print();

        System.out.println();

        Kogtevran kogtevransStudent1 = new Kogtevran("Zhou Chang", 75, 46, 24, 22, 55, 12);
        Kogtevran kogtevransStudent2 = new Kogtevran("Padma Patil", 55, 61, 35, 43, 75, 18);
        Kogtevran kogtevransStudent3 = new Kogtevran("Marcus Belby", 23, 84, 69, 22, 25, 47);
        kogtevransStudent1.print();
        kogtevransStudent2.print();
        kogtevransStudent3.print();
        System.out.println();


        Puffendui puffenduisStudent1 = new Puffendui("Zacharias Smith", 30, 58, 69, 85, 67);
        Puffendui puffenduisStudent2 = new Puffendui("Cedric Diggory", 84, 64, 99, 30, 76);
        Puffendui puffenduisStudent3 = new Puffendui("Justin Finch-Fletchley", 56, 24, 78, 35, 98);
        puffenduisStudent1.print();
        puffenduisStudent2.print();
        puffenduisStudent3.print();
        System.out.println();

        gryffindorsStudent1.compareHogwarts(slizerinStudent1);
        gryffindorsStudent1.compareHogwarts(gryffindorsStudent2);
    }
}