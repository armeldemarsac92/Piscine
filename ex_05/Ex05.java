package ex_05;

import java.util.ArrayList;

public class Ex05 {
    public static void myGetArgs(ArrayList <String> args) {
        ArrayList <String> input = new ArrayList<String>();
        for (String arg : args) {
            input.add(arg);
        }
        System.out.println(input);
    }
}
