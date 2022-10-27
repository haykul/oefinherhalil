package be.intecbrussel;

public class TurkishVanCat extends Felis{
    private String nickname;

    public TurkishVanCat(String name, int age, int shelterNo, int badgeNo, String nickname) {
        super(name, age, shelterNo, badgeNo);
        this.nickname = nickname;
    }

    @Override
    public String toString() {
        return "TurkishVanCat{" +
                super.toString()+
                "nickname='" + nickname + '\'' +
                '}';
    }
}
