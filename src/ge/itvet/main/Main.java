package ge.itvet.main;

import ge.itvet.security.*;

import java.util.UUID;

public class Main {
    public static void main(String[] args) throws ThereCantBeNegativeAmountOfPeopleException {

        Gate entrance = new Gate();
        Gate exit = new Gate();


        Hospital amteli = new Hospital(new Gate[]{entrance, exit}, "Amtel-Hospital");

        entrance.enter();
        entrance.enter();
        entrance.enter();
        System.out.println(amteli.retrieveAmountOfPeopleInTheBuilding());


    }


}
