import java.util.ArrayList;
public class Cel {
    private String name;
    private String data;
    private int bonus;
    public Cel(String name, String data, int bonus){
        this.name = name;
        this.data = data;
        this.bonus = bonus;
    }
    public boolean isAchived(){
        return true;
    }
    public int getBonus(){
        return bonus;
    }
}
