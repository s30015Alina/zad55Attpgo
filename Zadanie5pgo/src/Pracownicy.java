import java.util.ArrayList;
public class Pracownicy {
    protected String imie;
    protected String nazwisko;
    protected String adres;
    protected String email;
    protected String pesel;
    protected int RokZatrudnienia;

    public Pracownicy(String imie, String nazwisko, String adres, String email, String pesel,int RokZatrudnienia){
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.adres = adres;
        this.email = email;
        this.pesel = pesel;
        this.RokZatrudnienia = RokZatrudnienia;
    }
    public int calculateSalar(){
        int baseSalary = 3000;
        int yearsWorked = 2024 - RokZatrudnienia;
        return baseSalary + (yearsWorked * 1000);
    }
}
