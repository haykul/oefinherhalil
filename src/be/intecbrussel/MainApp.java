package be.intecbrussel;

public class MainApp {
    public static void main(String[] args) {
        Felis felis = new Felis();
        SiameseCat siameseCat = new SiameseCat("Maya", 10);
        NorwegianForest norwegianForest = new NorwegianForest();
        TurkishVanCat turkishvanCat = new TurkishVanCat("halil",5,333,543, "lovely");
        PersianCat persianCat = new PersianCat(333, 543);
        AndeanMountainCat andeanMountainCat = new AndeanMountainCat();
        Felis[] felises = {siameseCat, norwegianForest, turkishvanCat, persianCat, andeanMountainCat};
        for (Felis anim : felises) {
            System.out.println(anim);
        }
        System.out.println(persianCat.equals(turkishvanCat));
        System.out.println(norwegianForest.hashCode());
        System.out.println(andeanMountainCat.isAlive());
        System.out.println(siameseCat.isAlive());
        System.out.println(Felis.getVaccinationCount());

    }
}




