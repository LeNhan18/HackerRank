package com.HackerRank;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class HoanVi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//    1. Số lớn nhất từ các chữ số
//    Mô tả:
//    Cho một dãy 4 chữ số a, b, c, d, hãy tìm số lớn nhất có thể tạo ra bằng cách sắp xếp lại các chữ số.
//    Ví dụ:
//    Input: 1 2 3 4
//    Output: 4321
//    Input: 0 0 0 1
//    Output: 1000
      Integer[] a ={1,2,3,4};
        Arrays.sort( a, Collections.reverseOrder());
        StringBuilder s = new StringBuilder();
        for (int i : a) {
            s.append(i);
        }
        System.out.println("=========bai1============");
        System.out.println(s);
        System.out.println("===========================");
//    2. Tổng lớn nhất của một dãy con
//    Mô tả:
//    Cho một dãy số nguyên a1, a2, ..., an. Hãy tìm dãy con liên tiếp (tối thiểu một phần tử) có tổng lớn nhất.
//
//    Ví dụ:
//
//    Input: -2, 1, -3, 4, -1, 2, 1, -5, 4
//    Output: 6 (Dãy con: 4, -1, 2, 1)
        int[] b = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int maxSum = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
            if (sum > maxSum) {
                maxSum = sum;
            } else if (sum < 0) {
                sum = 0;
            }
        }
        System.out.println("=========bai2============");
        System.out.println(maxSum);
        System.out.println("===========================");
//    3. T��ng l��n nhất của dãy con liên tiếp

//    3. Đồng hồ tròn
//    Mô tả:
//    Cho hai thời gian HH1:MM1 và HH2:MM2, hãy tính khoảng cách ngắn nhất giữa chúng trên đồng hồ tròn tính theo phút.
//
//    Ví dụ:
//
//    Input: 11:00 và 1:00
//    Output: 120 phút
//    Input: 23:45 và 00:15
//    Output: 30 phút
        System.out.println(findShortestDistance("11:00", "1:00")); // Output: 120
        System.out.println(findShortestDistance("23:45", "00:15")); // Output: 30



//4. Số gần nhất trong danh sách
//    Mô tả:
//    Cho một dãy số nguyên dương a1, a2, ..., an và một số x. Hãy tìm số gần nhất với x trong dãy. Nếu có nhiều số bằng khoảng cách, chọn số nhỏ hơn.
//
//    Ví dụ:
//
//    Input: a = [4, 8, 15, 16, 23, 42], x = 10
//    Output: 8
//    Input: a = [1, 2, 3, 5], x = 4
//    Output: 3
//            5. Thời gian hợp lệ tiếp theo
//    Mô tả:
//    Cho một thời gian HH:MM, hãy tìm thời gian hợp lệ tiếp theo có thể được tạo ra bằng chính các chữ số của HH:MM.
//
//    Ví dụ:
//
//    Input: 19:34
//    Output: 19:39
//    Input: 23:59
//    Output: 22:22
//            6. Số chia hết cho N từ các chữ số
//    Mô tả:
//    Cho một dãy 4 chữ số a, b, c, d và một số N. Hãy tìm số nhỏ nhất có thể tạo ra từ các chữ số và chia hết cho N. Nếu không có số nào thỏa mãn, trả về -1.
//
//    Ví dụ:
//
//    Input: digits = [1, 2, 3, 4], N = 3
//    Output: 123
//    Input: digits = [0, 0, 0, 1], N = 2
//    Output: -1
//            7. Tổ hợp con có tổng bằng T
//    Mô tả:
//    Cho một dãy số nguyên dương a1, a2, ..., an và một số T. Hãy liệt kê tất cả các tổ hợp con có tổng đúng bằng T.
//
//    Ví dụ:
//
//    Input: a = [2, 3, 5, 7], T = 10
//    Output:
//    csharp
//    Sao chép mã
//[3, 7]
//        [2, 3, 5]
        int K = sc.nextInt();
        int N = sc.nextInt(); // read the number of items N
        int[] A =new int[N];
        int count = 0;
        for(int i=0;i<N;i++) {
            A[i] = sc.nextInt();
            Arrays.sort(A); // sort the prices in non-decreasing order
           // initialize the count of items that can be bought
            for (int j = 0; j < N; j++) {
                if (K >= A[j]) { // if the budget is greater than or equal to the price of the current item
                    K -= A[j]; // subtract the price of the current item from the budget
                    count++; // increment the count of items that can be bought
                }
            }
        }
        System.out.println(count); // print the maximum number of items that can be bought

    }
    public static int findShortestDistance(String time1, String time2) {
        int minutes1 = convertToMinutes(time1);
        int minutes2 = convertToMinutes(time2);
        int diff = Math.abs(minutes1 - minutes2);
        return Math.min(diff, 1440 - diff); // 1440 = 24 * 60 (tổng số phút trong 1 ngày)
    }

    public static int convertToMinutes(String time) {
        String[] parts = time.split(":");
        int hours = Integer.parseInt(parts[0]);
        int minutes = Integer.parseInt(parts[1]);
        return hours * 60 + minutes;
    }
}