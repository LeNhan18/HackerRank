package com.HackerRank;
import java.math.BigDecimal;
import java.util.Scanner;
public class BigDecimal {
    public static void main(String []args){
        //Input
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String []s = new String[n];
        for(int i = 0; i < n; i++){
            s[i] = sc.next();
        }
        sc.close();

        //Write your code here
        for(int i = 0; i < n; i++) {
            BigDecimal First = new BigDecimal(s[i]);
            int index = i;
            for(int j = i + 1; j < n; j++) {
                BigDecimal Second = new BigDecimal(s[j]);
                if(Second.compareTo(First) > 0){
                    First = Second;
                    index = j;
                }
            }
            String temp = s[i];
            s[i] = s[index];
            s[index] = temp;
        }

        //Output
        for(int i = 0; i < n; i++) {
            System.out.println(s[i]);
        }
    }
}