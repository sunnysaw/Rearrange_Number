/*
Question : Rearrange array in alternating positive & negative items with O(1) extra space.
 */


import java.util.Scanner;

public class Main {
    public static void rearrange(int[] arr) {
        int n = arr.length;
        int next = 1;
        for (int i = 0; i < n; i += 2) {
            if (arr[i] >= 0) {
                next += 2;
            } else {
                while (i + next < n && arr[i + next] >= 0) {
                    next += 2;
                }

                if (i + next < n) {
                    int temp = arr[i];
                    arr[i] = arr[i + next];
                    arr[i + next] = temp;
                }
                next -= 2;
            }
        }
        for (int start = 0; start < arr.length; start++){
            System.out.print(arr[start] + " ");
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length of array :");
        int length = input.nextInt();
        System.out.println("Enter the element inside array :");
        int[] array = new int[length];
        for (int start = 0; start < array.length; start++){
            array[start] = input.nextInt();
        }
        System.out.println("Printing the result :");
        rearrange(array);
    }
}