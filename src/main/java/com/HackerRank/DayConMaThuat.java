package com.HackerRank;
import java.util.Scanner;
public class DayConMaThuat {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int n = scanner.nextInt();
            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();

            }

            boolean hasMagicalSubsequence = false;

            for (int i = 0; i < n - 2; i++) {
                if (arr[i] == arr[i + 2]) {
                    hasMagicalSubsequence = true;
                    break;
                }
            }

            if (hasMagicalSubsequence) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }

