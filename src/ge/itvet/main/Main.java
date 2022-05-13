package ge.itvet.main;

import ge.itvet.security.BuildingType;
import ge.itvet.security.Gate;
import ge.itvet.security.Hospital;
import ge.itvet.security.ThereCantBeNegativeAmountOfPeopleException;

import java.util.UUID;

public class Main {
    public static void main(String[] args) throws ThereCantBeNegativeAmountOfPeopleException {

        Gate entrance = new Gate();
        Gate exit = new Gate();

       Hospital amteli = new Hospital(new Gate[]{entrance,exit},"Amtel-Hospital");


       entrance.enter();
        System.out.println(entrance.);
        System.out.println(amteli);

    }


}
