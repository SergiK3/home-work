package ge.itvet.main;


import ge.itvet.gates.Action;
import ge.itvet.gates.EntranceAction;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader("src\\in.csv"));
            List<Action> list = new ArrayList<>();

            String line;
            while( (line = reader.readLine()) != null) {
                String[] tempArray = line.split(",");
                list.add(new Action(Integer.valueOf(tempArray[0]),EntranceAction.valueOf(tempArray[1])));
            }
            System.out.println(list);





        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
