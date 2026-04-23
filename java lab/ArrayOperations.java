import java.util.*;

public class ArrayOperations {
    int arr[] = new int[5];

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 5 elements:");
        for(int i=0;i<5;i++) {
            arr[i] = sc.nextInt();
        }
    }

    void output1() {
        System.out.print("Normal: ");
        for(int i=0;i<5;i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    void reverse() {
        for(int i=0;i<5/2;i++) {
            int temp = arr[i];
            arr[i] = arr[4-i];
            arr[4-i] = temp;
        }
    }

    void output2() {
        System.out.print("Reversed: ");
        for(int i=0;i<5;i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        ArrayOperations obj = new ArrayOperations();
        obj.input();
        obj.output1();
        obj.reverse();
        obj.output2();
    }
}