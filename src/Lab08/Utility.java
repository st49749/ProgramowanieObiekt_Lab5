package Lab08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Utility {
    public static int GetInt() {
        return new Scanner(System.in).nextInt();
    }

    public static double GetDouble() {
        return new Scanner(System.in).nextDouble();
    }

    public static boolean GetBoolean() {
        return new Scanner(System.in).nextBoolean();
    }

    public static String GetString() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        return reader.readLine();
    }

    public static int GetRandomNumber(int min, int max) {
        return (int) (Math.random() * (max + 1 - min)) + min;
    }

    public static void FillWithRandomNumbers(int[] array, int min, int max) {
        for (int i = 0; i < array.length; i++) {
            array[i] = GetRandomNumber(min, max);
        }
    }

    public static void InsertionSort(int[] array) {
        int n = array.length;
        for (int j = 1; j < n; j++) {
            int key = array[j];
            int i = j - 1;
            while ((i > -1) && (array[i] > key)) {
                array[i + 1] = array[i];
                i--;
            }
            array[i + 1] = key;
        }
    }

    public static long Factorial(int n) {
        if (n <= 2) {
            return n;
        }
        return n * Factorial(n - 1);
    }
}