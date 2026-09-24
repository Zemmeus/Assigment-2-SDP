package equipment;

public class AllianceSword implements Weapon{

    @Override
    public void attack(){
        System.out.println("Attacking with Alliance Sword!");
    }


    @Override
    public String getWeaponName(){
        return "Alliance Sword";
    }

}
