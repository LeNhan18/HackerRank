package com.HackerRank;
import java.util.Scanner;
import java.util.StringTokenizer;
public class DoiChuoi {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String s = scanner.nextLine().trim();

            // Nếu chuỗi rỗng, in 0 và thoát
            if (s.isEmpty()) {
                System.out.println(0);
                return;
            }

            // Sử dụng regex để tách các từ
            String[] tokens = s.split("[^A-Za-z]+");

            // In số lượng token
            System.out.println(tokens.length);

            // In từng token
            for (String token : tokens) {
                System.out.println(token);
            }
        }


}
