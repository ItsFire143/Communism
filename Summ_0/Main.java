package Summ_0;

public class Main {
    public static void main (String[] args) {
        int firstArray[] = {3, 5, 7, 12, 4, 3, 6};
        int secondArray[] = {6, 7, 2, 17, 8};
        int pArray[] = new int[5];
        int sum1 = 0;
        int sum2 = 0;
        int a = 4;
        int b = 8;
        for (int i = 0; i < firstArray.length; i++) {
            sum1 = sum1 + (firstArray[i] - a*b);
        }
        for (int j = 0; j < secondArray.length; j++) {
            sum2 = sum2 + (secondArray[j] - a);
        }
        int s = sum1/sum2;
        for (int g = 0; g < pArray.length; g++) {
            pArray[g] = s * secondArray[g];
            System.out.println(pArray[g]);
        }

    }
}
