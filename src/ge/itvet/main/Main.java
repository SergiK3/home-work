package ge.itvet.main;

import ge.itvet.security.BuildingType;
import ge.itvet.security.Gate;
import ge.itvet.security.Hospital;
import ge.itvet.security.ThereCantBeNegativeAmountOfPeopleException;

import java.util.UUID;

public class Main {
    public static void main(String[] args) throws ThereCantBeNegativeAmountOfPeopleException {


       Hospital amteli = new Hospital(new Gate[]{new Gate(),new Gate()},"Amtel-Hospital");




    }


}
