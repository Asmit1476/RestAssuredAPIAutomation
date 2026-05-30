package Upgrade;

public class Cellphone {
    String name;
    String brandName;

    /*
    WARNING: Do not touch the code above this
    TODO-1: Introduce has a relationship with GlobalPositioningSystem

    TODO-2: Create a parameterized constructor with parameters name, brandName and globalPositioningSystem
    */

    //GlobalPositioningSystem globalPositioningSystem;

    public Cellphone(String name, String brandName, GlobalPositioningSystem globalPositioningSystem) {
        this.name=name;
        this.brandName=brandName;

    }

//    public void setName(String name) {
//        this.name = name;
//    }

    //WARNING: Do not touch the code below this
    public String getName() {
        return name;
    }
}
