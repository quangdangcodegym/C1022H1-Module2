package com.codegym.triangle;

public class SapXep {
    public static void main(String[] args) {
        int[] arr = {3, 5, 7, 1, 6, 9};
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < args.length; j++) {
                if (arr[j] < arr[i]) {
                    int temp = arr[j];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}
