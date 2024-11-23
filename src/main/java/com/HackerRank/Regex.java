package com.HackerRank;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class Regex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfTestCases = scanner.nextInt();
        scanner.nextLine();

        while(numberOfTestCases>0)  {
            String pattern = scanner.nextLine();
            if (isValidPattern(pattern)) {
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }
        }
    }

    private static boolean isValidPattern(String pattern) {
        try {
            Pattern.compile(pattern);
            return true;
        } catch (PatternSyntaxException ex) {
            return false;
        }
    }
}
