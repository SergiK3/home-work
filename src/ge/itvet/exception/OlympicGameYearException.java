package ge.itvet.exception;

public class OlympicGameYearException extends OlympicGameException {
    //დაუწერეთ კონსტრუქტორი, რომელსაც პარამეტრად გადმოეცემა წელი, და დააგენერირებს მესიჯს:
    // არაწორი ოლიპიური თამაშის წელი: ${პარამეტრად გადმოცემული წელი}.

    public OlympicGameYearException (int year) {
        System.err.println("არაწორი ოლიპიური თამაშის წელი: " + year);

    }
}
