package ge.itvet.main;

import ge.itvet.security.*;

import java.util.UUID;

public class Main {
    public static void main(String[] args) throws ThereCantBeNegativeAmountOfPeopleException {


        Hospital amteli = new Hospital(new Gate[]{new Gate(), new Gate()}, "Amtel-Hospital");

        amteli.getGateByIndex(0).enter();
        amteli.getGateByIndex(0).enter();
        amteli.getGateByIndex(0).enter();


        System.out.println("There are - " + amteli.retrieveAmountOfPeopleInTheBuilding() + " - People in the hospital");

        amteli.getGateByIndex(1).leave();
        amteli.getGateByIndex(1).leave();

        System.out.println("There are - " + amteli.retrieveAmountOfPeopleInTheBuilding() + " - People in the hospital");

    }


}
