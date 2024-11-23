package com.HackerRank;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

public class MD5 {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            String input = sc.nextLine();
            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update(input.getBytes(   ));
            byte[] digest = md.digest();
            BigInteger bigInt = new BigInteger(1, digest);
            String md5Hex = bigInt.toString(16);
            while (md5Hex.length() < 32) {
                md5Hex = "0" + md5Hex;
            }
            System.out.println(md5Hex);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
