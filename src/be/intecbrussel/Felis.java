package be.intecbrussel;

import java.util.Objects;

public class Felis extends Animal {
    private static int vaccinationCount;

    {
        if (isAlive() == true) {
            vaccinationCount++;
        }

    }
    private String name;
    private int age;
    private int shelterNo;
    private int badgeNo;

    public Felis() {
    }

        public Felis(String name, int age, int shelterNo, int badgeNo) {
        this.name = name;
        this.age = age;
        this.shelterNo = shelterNo;
        this.badgeNo = badgeNo;
    }

    public Felis(int shelterNo, int badgeNo) {
        this.shelterNo = shelterNo;
        this.badgeNo = badgeNo;
    }

    public Felis(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void miauw() {
        System.out.println("Felis miauw");
    }

    public void miauw(int times) {

    }
    public static int getVaccinationCount() {

        return vaccinationCount;
    }
    public void setShelterNo(int shelterNo) {

        if (shelterNo > 999) {
            this.shelterNo = 999;
            System.out.println("oops, het kan niet groter dan 999");
        } else if (shelterNo < 0) {
            this.shelterNo = 0;
            System.out.println("oops, het kan niet kleiner dan 0");
        }
    }

    public void setBadgeNo(int badgeNo) {

        if (badgeNo > 999) {
            this.badgeNo = 999;
            System.out.println("oops, het kan niet groter dan 999");
        } else if (badgeNo < 0) {
            this.badgeNo = 0;
            System.out.println("oops, het kan niet kleiner dan 0");
        }

    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Felis)) return false;
        Felis felis = (Felis) o;
        return shelterNo == felis.shelterNo && badgeNo == felis.badgeNo;
    }

    @Override
    public int hashCode() {
        return Objects.hash(shelterNo, badgeNo);
    }

    @Override
    public String toString() {
        return "Felis{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", shelterNo=" + shelterNo +
                ", badgeNo=" + badgeNo +
                '}';
    }


}
