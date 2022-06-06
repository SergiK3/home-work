package ge.itvet.main;


import ge.itvet.gates.Action;
import ge.itvet.gates.BugDetector;
import ge.itvet.gates.EntranceAction;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<Action> list = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader("src\\in.csv"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] tempArray = line.split(",");
                list.add(new Action(Integer.valueOf(tempArray[0]), EntranceAction.valueOf(tempArray[1])));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(list);
        System.out.println(BugDetector.fixedProblemSameAction(list));
        System.out.println(BugDetector.fixedProblemFirstActionCheckOut(list));
    }
}
