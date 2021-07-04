package I_Inheritance.Challenge3;

import I_Inheritance.Challenge3.overerving.FalconRocket;
import I_Inheritance.Challenge3.overerving.Rocket;

public class Main {
    public static void main(String[] args) {
        Rocket genericRocket = new Rocket(100);

        genericRocket.fly(10);
        System.out.println(genericRocket.toString());

        FalconRocket notEnoughFuel = new FalconRocket(12);
        notEnoughFuel.fly(23);
        System.out.println(notEnoughFuel.toString());

        FalconRocket enoughFuel = new FalconRocket(12);
        enoughFuel.fly(21);
        System.out.println(enoughFuel.toString());
    }
}
