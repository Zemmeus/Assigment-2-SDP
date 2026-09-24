package equipment;

public class HordeWolf implements Mount{

    @Override
    public void mount() {
        System.out.println("Mounting Horde Wolf");

    }

    @Override
    public String getMountName() {
        return "Horde Wolf";
    }

}
