package com.HackerRank;

import java.util.Scanner;

public class CanWin {
        public static boolean canWin(int leap, int[] game) {
            int position = 0;
            int lastIndex = game.length-1;
            //did you win by jumping over the last index?
            if(position>lastIndex){
                return true;
            }
            //did you reverse out of bounds or meet a obstacle?
            if(position<0 || game[position]==1){
                return false;
            }
            //mark current position as explored
            game[position] = 1;
            //Explore all possible solutions from current position
            return canWin(leap, game) || canWin(leap, game) || canWin(leap, game);
        }
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int q = scan.nextInt();
            while (q-- > 0) {
                int n = scan.nextInt();
                int leap = scan.nextInt();

                int[] game = new int[n];
                for (int i = 0; i < n; i++) {
                    game[i] = scan.nextInt();
                }

                System.out.println( (canWin(leap, game)) ? "YES" : "NO" );
            }
            scan.close();
        }

}
