package BubbleSort;

import java.util.Scanner;
public class BubbleSort {

    private static Scanner in;
    public static void main(String... args){
        int n,c,d,swap;
        in = new Scanner(System.in);
        System.out.println("input no of integers to sort");
        n = in.nextInt();
        int array[] = new int[n];
        System.out.println("Enter"+n+"integers");
        for(c=0;c<n;c++){
            array[c]=in.nextInt();
        }
        for (c=0;c<(n-1);c++){
            for(d=0;d<n-c-1;d++){
                if (array[d]>array[d+1]) { //ascending order sort
                swap = array[d];
                array[d]=array[d+1];
                array[d+1]=swap;
                }  }
        }
        System.out.println("Sorted List of the Input");
        for (c=0;c<n;c++){
            System.out.println(array[c]);
        }
    }
}
