package com.codegym;

public class Arrray {
    public static void main(String[] args) {


        int[] arr =  {7, 6, 7, 1, 3};

        // int[] arr =  {7, 6, 7, 3};
        printArray(arr);
        addElementToArray(2, 10, arr);
        printArray(arr);
    }

    public static void addElementToArray(int index, int value, int[] arr) {
        int[] arrNew = new int[arr.length + 1];
        for (int i = 0; i < index; i++) {
            arrNew[i] = arr[i];
        }
        arrNew[index] = value;
        for (int i = index + 1; i < arrNew.length; i++) {
            arrNew[i] = arr[i-1];
        }
        arr = arrNew;
    }
    public static void spiceArrayIndex(int index, int[] arr) {
        for (int i = index; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[arr.length - 1] = 0;
    }
    public static String findIndexMaxArray(int [] arr) {
        String str = "";
        int max = arr[0];
        int k = 0;
        for (int i = 0; i < arr.length; i++) {
            max = arr[0];
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] >= max) {
                    max = arr[j];
                    k = j;
                }
            }
            if (arr[i] == max) {
                str += i;
                if (i != k) {
                    str += ",";
                }
            }
        }
        return str;
    }
    public static int[] initArray(int size, int max, int min) {
        int [] arr = new int[size];
        for (int i = 0;i< arr.length; i++) {
            arr[i] = (int ) (Math.random() * (max - min + 1) + min);
        }
        return arr;
    }

    public static void printArray(int [] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
