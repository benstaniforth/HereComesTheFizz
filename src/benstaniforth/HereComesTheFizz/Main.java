package benstaniforth.HereComesTheFizz;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.print("Please enter a number > ");

        String userInput = getInputFromUser();

        for (int number = 1; number <= Integer.parseInt(userInput); number++) {


            List myArray = new ArrayList();

            if (number % 3 == 0) {
                myArray.add("Fizz");
            }
            if (number % 5 == 0) {
                myArray.add("Buzz");
            }
            if (number % 7 == 0) {
                myArray.add("Bang");
            }
            if (number % 11 == 0) {
                myArray.clear();
                myArray.add("Bong");
            }
            if (number % 13 == 0) {
                if (getIndexOfB(myArray, "B") != -1) {
                    myArray.add(getIndexOfB(myArray, "B"), "Fezz");
                }
            }
            if (number % 17 == 0) {
                Collections.reverse(myArray);
            }

            StringBuilder sb = new StringBuilder();
            if (myArray.isEmpty()) {
                System.out.println(number);
            } else {
                System.out.println(String.join("", myArray));
            }

            System.out.print(sb);

        }
    }

    public static int getIndexOfB (List<String> myArray, String criteria) {

        for (int i = 0; i < myArray.size(); i++) {
            if (myArray.get(i).contains(criteria)) {
                return i;
            }
        }
        return -1;

    }

    public static String getInputFromUser () {

        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }


}


//public static boolean applyFizz (Integer number){
//
//        boolean Fizz;
//
//        if (number % 3 == 0)
//
//            return listForOutput().add("Fizz");
//
//
//    }
//
//    public static boolean applyBuzz (Integer number){
//
//        boolean Buzz = false;
//
//        if (number % 5 == 0){
//            Buzz = true;
//        }
//
//        return false;
//    }
//
//    public static boolean applyBang (Integer number){
//
//        boolean Bang = false;
//
//        if (number % 7 == 0){
//            Bang = true;
//        }
//
//        return false;
//    }
//
//
//    public static boolean applyBong (Integer number){
//
//        boolean Bong = false;
//
//        if (number % 11 == 0) {
//            Bong = true;
//        }
//
//        return false;
//    }
//
//
//    public static boolean applyFezz (Integer number) {
//
//        boolean Fezz = false;
//
//        if (number % 13 == 0) {
//            Fezz = true;
//        }
//
//        return false;
//    }
//
//    public static boolean applyReverse (Integer number) {
//
//        boolean Reverse = false;
//
//        if (number % 17 == 0) {
//            Reverse = true;
//        }
//
//        return false;
//
//    }
//
//
//    public static List<Object> listForOutput () {
//
//        List<Object> listForOutput = new ArrayList<>();
//        return listForOutput;
//
//    }