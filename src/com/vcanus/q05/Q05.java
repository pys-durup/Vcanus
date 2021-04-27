package com.vcanus.q05;

import java.io.*;

public class Q05 {
    static int[][] map = new int[10][10];
    static boolean[][] visited = new boolean[10][10];
    static int[] dx = { -1, 0, 1, 0 };
    static int[] dy = { 0, -1, 0, 1 };
    static int lastCount = 0;

    public static void main(String[] args) throws IOException {
        File file = new File(".\\src\\com\\vcanus\\q05\\map.txt");
//        System.out.println(file.getAbsolutePath());

        BufferedReader br = new BufferedReader(new FileReader(file));
        String temp;
        int i = 0;
        while ((temp = br.readLine()) != null) {
            for (int j=0; j<map.length; j++) {
                map[i][j] = temp.charAt(j) - '0';
                visited[i][j] = false;
            }
            i++;
        }

        System.out.println("연못의 깊이 : " + iteration(map));
        printMap(map);


    }

    private static int iteration(int[][] map) {
        int count = 0;

        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                if (map[i][j] == 0) {
                    continue;
                }
                boolean flag = true;
                for (int k = 0; k < 4; k++) {
                    int nextX = i + dx[k];
                    int nextY = j + dy[k];

                    if (flag == false) continue;

                    // 상하좌우 좌표가 배열 밖을 벗어날때
                    if (nextX < 0 || nextY < 0 || nextX >= map.length || nextY >= map.length) {
                        flag = false;
                        continue;
                    }

                    // 상하좌우가 전부 1보다 크거나 같을때만 flag값이 true
                    if (map[nextX][nextY] < map[i][j]) {
                        flag = false;
                        continue;
                    }
                }
                if (flag == true) {
                    map[i][j] += 1;
                    count += map[i][j];
                } else {
                    count += map[i][j];
                }

            }
        }

        // 이전 연못깊이의 합과 같다면
        if ( lastCount == count ) {
            return count;
        } else {
            lastCount = count;
            return iteration(map);
        }

    }

    static void printMap(int[][] map) {
        for (int[] i : map) {
            for (int j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
