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

    private int amountOfPeopleEntered;


    public int getAmountOfPeopleEntered() {
        return amountOfPeopleEntered;
    }


    public void enter() {
        amountOfPeopleEntered++;
    }

    public void leave() {
        amountOfPeopleEntered--;
    }

    @Override
    public String toString() {
        return "Gate{" +
                "amountOfPeopleInTheBuilding=" + amountOfPeopleEntered +
                '}';
    }
}
