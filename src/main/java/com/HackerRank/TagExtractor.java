package com.HackerRank;
import java.util.*;
import java.util.regex.*;

public class TagExtractor {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        int t = Integer.parseInt(in.nextLine());
        while(t-- >0){
            String line = in.nextLine();

            //Write your code here
            Pattern tagPattern = Pattern.compile("<(.+)>([^<]+)</\\1>");
            Matcher tagMatcher = tagPattern.matcher(line);
            if (tagMatcher.find()){
                do {
                    System.out.println(tagMatcher.group(2));
                } while (tagMatcher.find());
            } else{
                System.out.println("None");
            }
        }
        }
    }
