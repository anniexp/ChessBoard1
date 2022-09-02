package com.company;

import java.util.Scanner;

public class Main {
    public static void drawChessBoard(int height, int width) {
        try {
            if (height < 0) {
                System.out.println("Please give valid height");
                inputValues();
            } else if (width < 0) {
                System.out.println("Please give valid width");
                inputValues();
            }

            for (int i = 0, j = 0; i < height && j <= width; ) {
                String s1 = "*";
                String s2 = " ";

                if (i % 2 != 0) {
                    String temp = s1;
                    s1 = s2;
                    s2 = temp;
                }

                if (j % 2 == 0) {
                    System.out.print(s1);
                } else {
                    System.out.print(s2);
                }

                j++;
                if (j == width) {
                    System.out.println();
                    i++;
                    j = 0;
                }
            }
            System.out.println();
        } catch (Exception e) {
            System.out.println("Invalid format input");
        }
    }

    public static void inputValues() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please type in height and width! ");
        System.out.println("Height : ");
        String inputRows = scanner.nextLine();
        System.out.println("Width : ");
        String inputColumns = scanner.nextLine();
        try {
            int rows = Integer.parseInt(inputRows);
            int columns = Integer.parseInt(inputColumns);
            drawChessBoard(rows, columns);
        } catch (Exception e) {
            System.out.println("Please type in numbers!");
            inputValues();
        }
    }

    public static void main(String[] args) {
        drawChessBoard(5, 5);
        drawChessBoard(-1, 0);
        inputValues();
    }
}
