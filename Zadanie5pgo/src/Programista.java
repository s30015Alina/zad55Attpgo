import java.util.ArrayList;
public class Programista extends Pracownicy{
    private ArrayList<String> technologia;
    public Programista(String imie, String nazwisko, String adres, String email, String pesel, int RokZatrudnienia){
        super(imie, nazwisko, adres, email, pesel, RokZatrudnienia);
        technologia = new ArrayList<>();
    }
    public void addTechnology(String technology){
        technologia.add(technology);
    }
    public int calculateSalary(){
        int baseSalary = super.calculateSalar();
        return baseSalary + (technologia.size()*500);
    }
}
