package com.HackerRank;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DuplicateWord {

    public static void main(String[] args) {

        String regex = "\\b(\\w+)(\\s\\1\\b)+";
        Pattern p = Pattern.compile(regex,Pattern.CASE_INSENSITIVE);

        Scanner in = new Scanner(System.in);
        int numSentences = Integer.parseInt(in.nextLine());

        while (numSentences-- > 0) {
            String input = in.nextLine();

            Matcher m = p.matcher(input);

            // Check for subsequences of input that match the compiled pattern
            //Kieemr tra cac chuoi con cua dau vao khop với mẫu đã bieen dịch
            while (m.find()) {
                input = input.replaceAll(m.group(),m.group(1));
            }

            // Prints the modified sentence.
            // in ra câu đã sửa looix
            System.out.println(input);
        }

        in.close();
    }
}
