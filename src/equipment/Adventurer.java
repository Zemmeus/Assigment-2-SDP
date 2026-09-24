package equipment;

public class Adventurer {

    private final String name;
    private final Weapon weapon;
    private final Mount mount;

    public Adventurer(String name, FactionEquipmentFactory factory) {
        this.name = name;
        this.weapon = factory.createWeapon();
        this.mount = factory.createMount();
    }

    public void goToBattle() {
        System.out.println(name + " rides " + mount.getMountName() + " and carries " + weapon.getWeaponName());
        mount.mount();
        weapon.attack();
    }

}
