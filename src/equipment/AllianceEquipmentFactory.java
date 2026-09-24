package equipment;

public class AllianceEquipmentFactory implements FactionEquipmentFactory {

    @Override
    public Weapon createWeapon() {
        return new AllianceSword();
    }

    @Override
    public Mount createMount() {
        return new AllianceHorse();
    }

}
