package Sorting;

import java.util.Scanner;

public class Merge_Sort {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();

        System.out.println("Enter the array Elements");
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        
        Divide(a,0,n-1);

        System.out.println("Sorted array are ");
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

    public static void Divide(int[] a, int l, int u) {
        if(l>=u){
            return;
        }
        int mid = (l+u)/2;
        Divide(a, l, mid);
        Divide(a, mid+1, u);
        conquer(a,l,mid,u);
        
    }

    public static void conquer(int[] a, int l, int mid, int u) {
        int merged[] = new int[u-l+1];

        int indx1 = l;
        int indx2 = mid+1;
        int x =0;

        while (indx1 <= mid && indx2 <= u) {
            if (a[indx1] <= a[indx2]) {
                merged[x] = a[indx1];
                x++;
                indx1++;
            } else {
                merged[x] = a[indx2];
                x++;
                indx2++;
            }  
        }
        while (indx1<=mid) {
            merged[x] = a[indx1];
            x++;
            indx1++;
        }
        while (indx2 <=u) {
            merged[x] = a[indx2];
            x++;
            indx2++;
        }

        for (int i = 0,j=l; i < merged.length; i++,j++) {
            a[j] = merged[i];
            
        }
    }

    
}
