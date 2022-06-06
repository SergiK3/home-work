package ge.itvet.gates;

import java.util.ArrayList;
import java.util.List;

public class BugDetector {
    //1)თუ ერთი და იგივე გასაღების ნომერზე მიმდევრობით
    // დაფიქსირდა ორი ერთნაირი ქმედება ( მარტო შესვლა ან მარტო გამოსვლა).
    //
    // 2)პირველად გასაღების ნომერზე დაფიქსირებულია გამოსვლა.
    //
    // 3)სულ ბოლო ჩანაწერი გასაღებზე დაფიქსირებულია შესვლა.

    public static List<Action> fixedBugs(List<Action> buggedList) {


        return null;
    }

    //თუ ერთი და იგივე გასაღების ნომერზე მიმდევრობით
    // დაფიქსირდა ორი ერთნაირი ქმედება ( მარტო შესვლა ან მარტო გამოსვლა).
    //es metodebi private gaxdeba bolos
    public static List<Action> fixedProblemSameAction(List<Action> buggedList) {
        List<Action> fixedList = new ArrayList<>();

        for (int i = 0; i < buggedList.size(); i++) {
            for (int j = 0; j < buggedList.size(); j++) {
                if (buggedList.get(i).equals(buggedList.get(j)) && i != j) {
                    fixedList.add(new Action(buggedList.get(i).getIdNum(), EntranceAction.CHECK_OUT));
                    buggedList.remove(i);
                }
            }
        }
        return fixedList;
    }


    //2)პირველად გასაღების ნომერზე დაფიქსირებულია გამოსვლა.
    public static List<Action> fixedProblemFirstActionCheckOut(List<Action> buggedList) {
        List<Action> fixedList = new ArrayList<>();
//        for (int i = 0; i < buggedList.size(); i++) {
//            for (int j = 0; j < buggedList.size(); j++) {
//                if (buggedList.get(i).getIdNum() == buggedList.get(j).getIdNum()
//                        && i != j
//                        && buggedList.get(i).getAction() == EntranceAction.CHECK_OUT
//                        && buggedList.get(j).getAction() == EntranceAction.CHECK_IN) {
//                  fixedList.add(new Action(buggedList.get(i).getIdNum(), EntranceAction.CHECK_IN);
//                  buggedList.remove(i);
//                }
//            }
//        }
//        buggedList.stream().filter(id -> id.getIdNum() == 2)  gapiltvra minda imati visac check inic aqvs da check outic

        return fixedList;
    }
    //3)სულ ბოლო ჩანაწერი გასაღებზე დაფიქსირებულია შესვლა.
    // es ar gamodis magalitidan imitoro tu sheaswore check out it check in it vapshe ar chans


}
