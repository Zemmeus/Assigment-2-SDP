package equipment;

public class HordeAxe implements Weapon{

    @Override
    public void attack(){
        System.out.println("Attacking with Orc Axe!");
    }


    @Override
    public String getWeaponName(){
        return "Orc Axe";
    }

}
