import java.util.ArrayList;

public class Managerr extends Pracownicy {
    private ArrayList<Cel> cele;

    public Managerr(String imie, String nazwisko, String adres, String email, String pesel, int RokZatrudnienia) {
        super(imie, nazwisko, adres, email, pesel, RokZatrudnienia);
        cele = new ArrayList<>();
    }

    public void addCel(Cel cel) {
        cele.add(cel);
    }

    public int calculateSalary() {
        int baseSalary = super.calculateSalar();
        int bonus = 0;
        for (Cel cel : cele) {
            if (cel.isAchived()) {
                bonus += cel.getBonus();
            }
        }
        return baseSalary + bonus;
    }

}

