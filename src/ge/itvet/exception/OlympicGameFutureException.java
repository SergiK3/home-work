package ge.itvet.exception;

public class OlympicGameFutureException extends OlympicGameYearException {
//დაუწერეთ კონსტრუქტორი, რომელსაც პარამეტრად გადმოეცემა წელი, და დააგენერირებს მესიჯს: მომავლის თარიღი:
// ჯერ ოლიპიური თამაში ${პარამეტრად გადმოცემული წელი} წელს არ ჩატარებულა.

    public OlympicGameFutureException(int year) {
        super(year);
        System.err.println(String.format("ჯერ ოლიპიური თამაში %d წელს არ ჩატარებულა.",year));

    }
}
