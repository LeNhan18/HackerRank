package com.HackerRank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class LeThanhNhan {
    private static List<List<Integer>> grah;
    private static boolean[] visited;
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          int N = sc.nextInt();
          int K = sc.nextInt();
          grah = new ArrayList<>();
           for(int i =0;i<= N;i++){
               grah.add(new ArrayList<>());
           }
           for(int i = 0; i< K; i++){
               int u = sc.nextInt();
               int v = sc.nextInt();
               grah.get(u).add(v);
               grah.get(v).add(u);

           }
           visited = new boolean[N+1];
           int com =0;
           for(int i=0;i<=N;i++){
               if(!visited[i]){
                   com ++;
                   visited[i] = true;
                   dfs(i);
               }
           }
    }
    private static void dfs(int node) {
        Stack<Integer> stack = new Stack<>();
        stack.push(node);
        while (!stack.isEmpty()) {
            int current = stack.pop();
            for (int neighbor : grah.get(current)) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    stack.push(neighbor);
                }
            }
        }
    }
}
