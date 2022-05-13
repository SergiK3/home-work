package ge.itvet.security;
//ge.itvet.security package-ში შექმენით კლასი Gate (კარი) კლასი
//
//მეთოდები
//
//enter რომელიც ერთით გაზრდის შენობაში შესული პერსონის რაოდენობას.
//
//leave რომელიც ერთით შეამცირებს შენობაში შესული პერსონის რაოდენობას.
// თუ რაოდენობა ჩამოცდება 0-ს დაბეჭდოს "something went wrong"

public class Gate {

    private Building gate;


    public void enter() {
        gate.amountOfPeopleInTheBuilding++;
    }

    public void leave() throws ThereCantBeNegativeAmountOfPeopleException {
        if (gate.amountOfPeopleInTheBuilding - 1 < 0) {
            throw new ThereCantBeNegativeAmountOfPeopleException("something went wrong");
        }
        gate.amountOfPeopleInTheBuilding--;
    }

    @Override
    public String toString() {
        return "Gate{" +
                "gate=" + gate +
                '}';
    }
}
