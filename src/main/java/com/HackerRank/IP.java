package com.HackerRank;

import java.util.Scanner;

public class IP {
    static class MyRegex {
        //Biểu thức chính quy để kieemr tra địa chỉ ip v4 hợp lệ
        String pattern = "^(([0-1]?[0-9][0-9]?|2[0-4][0-9]|25[0-5])\\.){3}(([0-1]?[0-9][0-9]?|2[0-4][0-9]|25[0-5]))$";
    }
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Create an instance of MyRegex
            //Tạo doi tượng MyRegex
            MyRegex myRegex = new MyRegex();

            // Loop through inputs and validate them
            //Đọc và kiểm tra từng địa chỉ ip
            while (scanner.hasNext()) {
                String ip = scanner.next();
                System.out.println(ip.matches(myRegex.pattern));
            }
            scanner.close();
        }
    }


