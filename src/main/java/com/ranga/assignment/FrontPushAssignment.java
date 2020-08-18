package com.ranga.assignment;

public class FrontPushAssignment {
  static void pushZerosToFront(int arr[], int n) {
    int count = n - 1;
    for (int i = n - 1; i >= 0; i--) {
      if (arr[i] != 0) {
        arr[count--] = arr[i];
      }
    }
    while (count >= 0) {
      arr[count--] = 0;
    }
  }
  public static void main(String[] args) {
    int arr[] = {1, 2, 0, 4, 1, 0, 0, 9};
    int n = arr.length;
    pushZerosToFront(arr, n);
    System.out.println("Array after pushing zeros to the back: ");
    for (int i = 0; i < n; i++) System.out.print(arr[i] + " ");
  }
}
