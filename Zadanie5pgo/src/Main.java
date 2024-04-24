import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        ArrayList<Pracownicy> pracownicy = new ArrayList<>();
        Programista prog = new Programista("John", "Doe", "New York", "john@doe.com", "123456789", 2020);
        prog.addTechnology("Java");
        prog.addTechnology("Python");
        pracownicy.add(prog);

        Tester test = new Tester("Jane", "Smith", "Los Angeles", "jane@smith.com", "987654321", 2021);
        test.addTestType("UI/UX");
        test.addTestType("Integration");
        pracownicy.add(test);

        Managerr managerr = new Managerr("Bob", "Johnson", "Chicago", "bob@johnson.com", "1122334455", 2019);
        Cel c = new Cel("Implementing FB login","15.10.2010", 1000);
        managerr.addCel(c);
        pracownicy.add(managerr);

        int totalAmount = 0;
        for (Pracownicy pracownik : pracownicy){
            totalAmount += pracownik.calculateSalar();
        }
        System.out.println(totalAmount + "USD");
    }
}