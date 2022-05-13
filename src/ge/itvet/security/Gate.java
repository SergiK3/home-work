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

    protected int amountOfPeopleInTheBuilding;



    public void enter() {
        amountOfPeopleInTheBuilding++;
    }
    public void leave() throws ThereCantBeNegativeAmountOfPeopleException {
        if (amountOfPeopleInTheBuilding - 1 < 0) {
            throw new ThereCantBeNegativeAmountOfPeopleException("something went wrong");
        }
        amountOfPeopleInTheBuilding--;
    }
}
