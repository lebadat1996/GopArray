package GopArray;

import java.util.Scanner;

public class GopArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {6, 7, 8, 9, 10, 11};
        int[] newArr = mergeArray(arr1, arr2);
        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i] + " ");
        }
    }

    public static int[] mergeArray(int[] array1, int[] array2) {
        int[] newArray = new int[array1.length + array2.length];
        for (int i = 0; i < array1.length; i++) {
            newArray[i] = array1[i];
        }
        for (int i = 0; i < array2.length; i++) {
            newArray[array1.length + i] = array2[i];
        }
        return newArray;
    }
}