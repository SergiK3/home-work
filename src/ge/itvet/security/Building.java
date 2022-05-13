package ge.itvet.security;
//ველები
//type - შენობის ტიპი
//gates - შესასვლელები
//
//კონსტრუქტორი
//მხოლოდ პარამეტრიანი protected კონსტრუქტორი, სადაც ორივე ველს მიანიჭებთ მნიშვნელობას.
//
//მეთოდები
//retrieveAmountOfPeopleInTheBuilding - რომელიც დააბრუნებს შენობაში არსებული ადამიანების რაოდენობას.
//
//დაუმატეთ მხოლოდ getter-ები


import java.util.Arrays;


public class Building {

    protected final BuildingType type;
    protected final Gate[] gates;



    protected Building(BuildingType type, Gate[] gates) {
        this.type = type;
        this.gates = gates;
    }

    public BuildingType getType() {
        return type;
    }

    public Gate[] getGates() {
        return gates;
    }

    public int retrieveAmountOfPeopleInTheBuilding() throws ThereCantBeNegativeAmountOfPeopleException {
        if(gates[0].getAmountOfPeopleEntered() + gates[1].getAmountOfPeopleEntered() < 0) {
            throw new ThereCantBeNegativeAmountOfPeopleException("something went wrong");
        }
        return gates[0].getAmountOfPeopleEntered() + gates[1].getAmountOfPeopleEntered();
    }

    @Override
    public String toString() {
        return "Building{" +
                "type=" + type +
                ", gates=" + Arrays.toString(gates) +
                '}';
    }
}
