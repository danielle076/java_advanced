package I_Inheritance.Challenge2;

import I_Inheritance.Challenge2.overerving.ApolloRocket;
import I_Inheritance.Challenge2.overerving.Rocket;

public class Main {
    public static void main(String[] args) {
        Rocket genericRocket = new Rocket(100);

        genericRocket.fly(10);
        System.out.println(genericRocket.toString());

        ApolloRocket apolloRocket = new ApolloRocket(100, 10);
        apolloRocket.fly(10);
        System.out.println(apolloRocket.toString());
    }
}
