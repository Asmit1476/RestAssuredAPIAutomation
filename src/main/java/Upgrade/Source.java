package Upgrade;

public class Source {
    public static void main(String[] args) {
        String globalPositioningSystemVersion = "10.0.1";
        //WARNING: Do not touch the code above this line
        //TODO-4: Create an instance of class GlobalPositioningSystem with name globalPositioningSystem and using the constructor with parameter globalPositioningSystemVersion

        GlobalPositioningSystem globalPositioningSystem = new GlobalPositioningSystem(globalPositioningSystemVersion);
        //WARNING: Do not touch the code below this line
        String cellphoneName = "iPhone";
        String cellphoneBrand = "Apple";
        //WARNING: Do not touch the code above this line
        //TODO-5: Create an instance of class Cellphone with name cellphone and using the parameterized constructor with parameters cellphoneName, cellphoneBrand and globalPositioningSystem
        Cellphone name = new Cellphone(cellphoneName,cellphoneBrand,globalPositioningSystem);
        //System.out.println("Successfully created cellphone with name: " + Cellphone.getName());

        //Successfully created cellphone with name: iPhone

        System.out.println("Successfully created cellphone with name: " + name.getName());


    }
}
