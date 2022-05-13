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


public class Building extends Gate {
    protected final BuildingType type;
    protected Gate[] gates;


    public Building(BuildingType type, Gate[] gates) {
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
        return amountOfPeopleInTheBuilding;
    }


}
