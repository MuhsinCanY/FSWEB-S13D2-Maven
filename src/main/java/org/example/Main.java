package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }


    public static boolean isPalindrome(int num) {
        num = Math.abs(num);
        String orj = String.valueOf(num);
        String reverse = String.valueOf(new StringBuilder(orj).reverse());
        return orj.equals(reverse);
    }


    public static boolean isPerfectNumber(int num) {
        if (num < 0) return false;

        int sum = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }

        return sum == num;
    }

    public static String numberToWords(int num) {
        if (num < 0) return "Invalid Value";

        StringBuilder result = new StringBuilder();

        String[] words = new String[]{"Zero", "One", "Two", "Three", "Four",
                "Five", "Six", "Seven", "Eight", "Nine"};

        while (num != 0) {
            result.insert(0, words[num % 10] + " ");
//            result = words[num % 10] + " " + result;
            num = num / 10;
        }

        return result.toString().trim();
    }
}
