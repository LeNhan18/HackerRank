package com.HackerRank;
import java.io.*;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toList;

public class MaxValueCounter {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int upRightCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<String> upRight = IntStream.range(0, upRightCount).mapToObj(i -> {
                    try {
                        return bufferedReader.readLine();
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                })
                .collect(toList());

        long result = countMax(upRight);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }

        public static long countMax(List<String> upRight) {
            // Start with large values for minRow and minCol
            int minRow = Integer.MAX_VALUE;
            int minCol = Integer.MAX_VALUE;

            // Parse each input string
            for (String coord : upRight) {
                String[] parts = coord.split(" ");
                int r = Integer.parseInt(parts[0]);
                int c = Integer.parseInt(parts[1]);

                // Update the minimum row and column values
                minRow = Math.min(minRow, r);
                minCol = Math.min(minCol, c);
            }

            // Calculate the number of cells with the maximal value
            return (long) minRow * minCol;
        }

    }







