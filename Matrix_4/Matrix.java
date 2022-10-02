package Matrix_4;
import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        int[][] firstMatrix = {{4, 6}, {7, 2}};
        int[][] secondMatrix = {{6, 11}, {8, 5}};
        int[][] resultMatrix = new int[2][2];

//            for (int i = 0; i < 2; i++) {
//                for (int j = 0; j < 2; j++) {
//                }
        System.out.println("Введите операцию");
        Scanner operation = new Scanner(System.in);
        String s = operation.nextLine();
        if (s.equals("+")) { //Сложение матриц
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 2; j++) {
                    resultMatrix[i][j] = firstMatrix[i][j] + secondMatrix[i][j];
                    System.out.print(" " + resultMatrix[i][j] + " ");
                }
                System.out.println();
            }
        } else {
            if (s.equals("*")) { //Умножение на число
                System.out.println("Введите число");
                Scanner numb = new Scanner(System.in);
                int x = numb.nextInt();
                for (int i = 0; i < 2; i++) {
                    for (int j = 0; j < 2; j++) {
                        resultMatrix[i][j] = firstMatrix[i][j] * x;
                        System.out.print(" " + resultMatrix[i][j] + " ");
                    }
                    System.out.println();
                }
            } else {
                if (s.equals("*m")) { //Умножения матриц
                    for (int i = 0; i < 2; i++) {
                        for (int j = 0; j < 2; j++) {
                            resultMatrix[i][j] = firstMatrix[i][j] * secondMatrix[i][j];
                            System.out.print(" " + resultMatrix[i][j] + " ");
                        }
                        System.out.println();
                    }
                } else {
                        System.out.println("Error");
                    }
                }
            }
        }
    }
