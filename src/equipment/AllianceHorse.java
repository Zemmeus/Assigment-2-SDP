package equipment;

public class AllianceHorse implements Mount{

    @Override
    public void mount() {
        System.out.println("Mounting Alliance Horse");

    }

    @Override
    public String getMountName() {
        return "Alliance Horse";
    }

}
