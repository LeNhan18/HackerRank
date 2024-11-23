package com.HackerRank;

import java.util.Calendar;
import java.util.Scanner;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

public class Main {
    public static String findDay(int month, int day, int year) {
        // Create a Calendar instance
        Calendar calendar = Calendar.getInstance();
        // Set the date
        calendar.set(year, month - 1, day); // Month is 0-based in Calendar

        // Get the day of the week
        int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);

        // Array of days in uppercase
        String[] days = {"SUNDAY", "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY"};

        // Return the corresponding day
        return days[dayOfWeek - 1]; // Adjust index
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    //
        int d = sc.nextInt();
        int m = sc.nextInt();
        int y = sc.nextInt();
        String dayOfWeek = findDay(m, d, y);
        System.out.println(dayOfWeek);

//        Scanner scanner = new Scanner(System.in);
//        int q = scanner.nextInt();
//
//        for (int i = 0; i < q; i++) {
//
//            int a = scanner.nextInt();
//            int b = scanner.nextInt();
//            int n = scanner.nextInt();
//            int currentSum = 0;
//            for (int j = 0; j < n; j++) {
//                currentSum += (int) Math.pow(2, j) * b;
//                int kq = a + currentSum;
//                System.out.print(kq + " \n");
//            }
//        }
//
//        scanner.close();
//        var sum = 0;
//        List<int> a = new ArrayList<>();
//        Scanner sc = new Scanner(System.in);
//        System.out.println("==============================================");
//        for(int i=0;i <3;i++){
//            String s = sc.nextLine();
//            int a = sc.nextInt();
//            System.out.printf("%-15s%03d%n", s, a);
//        }



                // Example usage
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
//
//        int month = Integer.parseInt(firstMultipleInput[0]);
//
//        int day = Integer.parseInt(firstMultipleInput[1]);
//
//        int year = Integer.parseInt(firstMultipleInput[2]);
//
//        String res = .findDay(month, day, year);
//
//        bufferedWriter.write(res);
//        bufferedWriter.newLine();
//
//        bufferedReader.close();
//        bufferedWriter.close();
    }// Output: WEDNESDAY




    }







