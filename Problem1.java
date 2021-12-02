package Practice;

import java.util.ArrayList;

public class Problem1 {
//    This problem was recently asked by Google.
//    Given a list of numbers and a number k, return whether any two numbers from the list add up to k.
//    For example, given [10, 15, 3, 7] and k of 17, return true since 10 + 7 is 17.

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(15);
        list.add(3);
        list.add(7);

        int target = 17;

        if (AdditionToTarget(list, target))
            System.out.println("Yes, two numbers in the list add up to " + target);
        else
            System.out.println("No, two numbers in the list do not add up to " + target);

    }

    private static boolean AdditionToTarget(ArrayList<Integer> list, int target) {

        int neededSum;

        for (int i = 0; i < list.size(); i++) {
            neededSum = target - list.get(i);
            if (list.contains(neededSum))
                return true;
        }

        return false;
    }
}
