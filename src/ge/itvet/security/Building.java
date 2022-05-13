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

    protected BuildingType type;
    protected Gate[] gates;
    protected Gate gate;


    public Building() {

    }

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

    public int retrieveAmountOfPeopleInTheBuilding() {
        return gate.getAmountOfPeopleInTheBuilding();
    }

    @Override
    public String toString() {
        return "Building{" +
                "type=" + type +
                ", gates=" + Arrays.toString(gates) +
                ", amountOfPeopleInTheBuilding=" + gate.getAmountOfPeopleInTheBuilding() +
                '}';
    }
}
