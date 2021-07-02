package I_Inheritance.Challenge;

import I_Inheritance.Challenge.overerving.Rocket;
import I_Inheritance.Challenge.overerving.SpaceXRocket;

public class Main {
    public static void main(String[] args) {
        Rocket genericRocket = new Rocket(100);

        genericRocket.fly(10);
        System.out.println(genericRocket.toString());

        SpaceXRocket spaceXRocket = new SpaceXRocket(100);
        spaceXRocket.fly(10);
        System.out.println(spaceXRocket.toString());
    }
}