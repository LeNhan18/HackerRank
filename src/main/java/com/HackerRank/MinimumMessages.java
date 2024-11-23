package com.HackerRank;

import java.util.*;
public class MinimumMessages {
        private static List<List<Integer>> graph;
        private static boolean[] visited;

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            // Đọc dữ liệu đầu vào
            int N = sc.nextInt(); // Số sinh viên
            int K = sc.nextInt(); // Số liên hệ
            graph = new ArrayList<>();

            // Khởi tạo danh sách kề cho đồ thị
            for (int i = 0; i <= N; i++) {
                graph.add(new ArrayList<>());
            }

            // Đọc các cặp liên hệ và xây dựng đồ thị
            for (int i = 0; i < K; i++) {
                int u = sc.nextInt();
                int v = sc.nextInt();
                graph.get(u).add(v);
                graph.get(v).add(u); // Đồ thị vô hướng
            }

            // Mảng đánh dấu đã thăm
            visited = new boolean[N + 1];

            // Đếm số thành phần liên thông
            int components = 0;
            for (int i = 1; i <= N; i++) {
                if (!visited[i]) {
                    components++;
                    visited[i] = true;
                    dfs(i); // Bắt đầu duyệt từ đỉnh này
                }
            }
            // Kết quả: số lượng sinh viên ít nhất cần nhắn tin
            System.out.println(components);
        }

        private static void dfs(int node) {
            Stack<Integer> stack = new Stack<>();
            stack.push(node);
            while (!stack.isEmpty()) {
                int current = stack.pop();
                for (int neighbor : graph.get(current)) {
                    if (!visited[neighbor]) {
                        visited[neighbor] = true;
                        stack.push(neighbor);
                    }
                }
            }
        }
    }

