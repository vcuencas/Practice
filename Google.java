package Practice;

import java.util.*;

public class Google {

    public static int solution(int[] nums) {
        Set<Integer> sums = new HashSet<Integer>();
        int sumResult = 0;

        if (nums.length == 2 || nums.length == 3) {
            // can only do 1 pair
            return 1;
        }

        // if 4 numbers in array
        for (int i = 0; i < nums.length; i++) {

            sumResult = nums[i] + nums[nums.length - 1];
            System.out.println(sumResult);
        }
        return sumResult;
    }
    public static String solution2(String letters) {
        int index = 0, max = 0;
        char[] arrForm = letters.toCharArray();

        for (int i = 0; i < letters.length(); i++) {
            index = letters.lastIndexOf(arrForm[i]);
            if (index > max)
                max = index;
        }
        String vipLetter = String.valueOf(letters.charAt(max));
        int firstInstance = letters.indexOf(vipLetter);
        String answer = letters.substring(firstInstance, max + 1);

        System.out.println(answer);
        return "ok";

        //List<Character> letters = new ArrayList<>();

        // place characters of the string into a list
//        for (char a: S.toCharArray()){
//            letters.add(a);
//        }

//        int index = 0, temp = -1, firstTime = 1;
//        for (int i = 0; i < arrForm.length; i++) {
//
//            if (letters.contains(arrForm[i])) {
//                if (i == 0) {
//                    index = letters.indexOf(arrForm[i]);
//                } else {
//                    temp = letters.indexOf(arrForm[i], index);
//
//                }
//            }
//        }

    }
    public static void main(String[] args) {
        int[] numbers = {1,3,4,6};
        String s = "cbaabaab";

        //int answer = solution(numbers);
        String answer = solution2(s);
        //System.out.println(answer);
    }
}
