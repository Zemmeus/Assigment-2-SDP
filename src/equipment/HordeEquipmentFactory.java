package equipment;

public class HordeEquipmentFactory implements FactionEquipmentFactory{

    @Override
    public Weapon createWeapon(){
        return new HordeAxe();
    }

    @Override
    public Mount createMount(){
        return new HordeWolf();
    }

}
