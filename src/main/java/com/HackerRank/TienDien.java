package com.HackerRank;
import java.util.Scanner;

public class TienDien {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] dinhMuc = {50, 100, 200, 300, 400};
        int[] giaDien = {1678, 1734, 2014, 2536, 2834, 2927};

        // Nhập số điện tiêu thụ
        int n = scanner.nextInt();
        // Tính tiền điện trước VAT
        int tongTien = 0;
        if (n > 0) {
            int remain = n;
            for (int i = 0; i < dinhMuc.length; i++) {
                int muc = dinhMuc[i] - (i > 0 ? dinhMuc[i - 1] : 0);
                if (remain > muc) {
                    tongTien += muc * giaDien[i];
                    remain -= muc;
                } else {
                    tongTien += remain * giaDien[i];
                    remain = 0;
                    break;
                }
            }
            if (remain > 0) {
                tongTien += remain * giaDien[giaDien.length - 1];
            }
        }

        // Tính tiền điện sau VAT
        int tongTienSauVAT = (int) Math.round(tongTien * 1.1);
        // Kết quả
        System.out.println(tongTienSauVAT);
        scanner.close();
    }
}

