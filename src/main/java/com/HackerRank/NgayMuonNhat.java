package com.HackerRank;

import java.util.Scanner;

public class NgayMuonNhat {
    public static int[] findLatestDate(int a, int b, int c, int d) {
        int[] digits = {a, b, c, d};
        int maxDay = -1, maxMonth = -1;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (j == i) continue;
                for (int k = 0; k < 4; k++) {
                    if (k == i || k == j) continue;
                    int l = 6 - i - j - k;

                    int day = digits[i] * 10 + digits[j];
                    int month = digits[k] * 10 + digits[l];

                    if (isValidDate(day, month)) {
                        if (month > maxMonth || (month == maxMonth && day > maxDay)) {
                            maxDay = day;
                            maxMonth = month;
                        }
                    }
                }
            }
        }

        return new int[]{maxDay, maxMonth};
    }

    private static boolean isValidDate(int day, int month) {
        if (month < 1 || month > 12) return false;
        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (day < 1 || day > daysInMonth[month - 1]) return false;
        // Kiểm tra năm nhuận (nếu cần thiết)
        // ...
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        int[] result = findLatestDate(a, b, c, d);

        if (result[0] == -1) {
            System.out.println("-1");
        } else {
            // Định dạng lại ngày và tháng thành chuỗi
            String formattedResult = String.format("%02d%02d", result[0], result[1]);

            // In từng chữ số
            for (char digit : formattedResult.toCharArray()) {
                System.out.print(digit + " "); // Tách từng chữ số bởi khoảng trắng
            }
        }
    }
}
