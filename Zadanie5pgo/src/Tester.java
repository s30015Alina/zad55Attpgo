import java.util.ArrayList;
public class Tester extends Pracownicy {
    private ArrayList<String> rodzajtest;

    public Tester(String imie, String nazwisko, String adres, String email, String pesel, int RokZatrudnienia) {
        super(imie, nazwisko, adres, email, pesel, RokZatrudnienia);
        rodzajtest = new ArrayList<>();
    }

    public void addTestType(String TestType){
        rodzajtest.add(TestType);
    }
    public int calculateSalaty(){
        int baseSalary = super.calculateSalar();
        return baseSalary + (rodzajtest.size()*300);
    }
}
