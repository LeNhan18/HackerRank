package com.HackerRank;

import java.util.Scanner;

public class UserNameValidator {
    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int n = Integer.parseInt(scan.nextLine());
        while (n-- != 0) {
            String userName = scan.nextLine();

            if (userName.length() >= 8 && userName.length() <= 30) {
                char firstChar = userName.charAt(0);
                if (userName.matches("[a-zA-Z0-9_]*") && Character.isLetter(firstChar)) {
                    System.out.println("Valid");
                } else {
                    System.out.println("Invalid");
                }
            } else {
                System.out.println("Invalid");
            }
        }
    }
}
