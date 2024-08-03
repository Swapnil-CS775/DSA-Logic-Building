//Linear search
//problem 1 - Find specific charactor from string
package Swapnil.com;

public class FindCharacterInString {
    public static void main(String[] args) {
        String str="swapnil";
        char [] arr=str.toCharArray();
        for (char c : arr) {
            if (c == 'a') {
                System.out.println("found");
                return;
            }
        }
        System.out.println("not found");
    }
}



// Problem 2 - Search In Range
package Swapnil.com;

public class SearchInRange {
    public static void main(String[] args) {
        int [] arr={2,8,9,7,11,6,3,99};
        System.out.println(searchNumber(arr,9,0,3));
    }

    public static boolean searchNumber(int []arr,int key,int from,int to)
    {
        for(int i=from;i<=to;i++)
        {
            if(arr[i]==key)
            {
                return true;
            }
        }
        return false;
    }
}

// Problem 3 - Minimum Number in array
package Swapnil.com;

public class MinimumNumber {
    public static void main(String[] args) {
        int [] arr={2,8,9,7,11,6,3,99,-30};
        System.out.println(minimumNumber(arr));
    }
    public static int minimumNumber(int []arr)
    {
        int min=arr[0];
        for(int num:arr)
        {
            if(num<min)
                min=num;
        }
        return min;
    }
}

//Problem 4 : Traversing 2D array and find key and return index of key
package Swapnil.com;

import java.util.Arrays;

public class Traversing2DArray {
    public static void main(String[] args) {
        int [][]arr={
                {2,4,8,3},
                {7},
                {0,9},
                {19,5,23}
        };
        int []ans=traverse2DArray(arr,0);
        System.out.println(Arrays.toString(ans));
        // System.out.println(ans); output =[I@6ce253f1  reason---
        /*
        * If you directly try to print an array using System.out.println(ans);,
        *  you will get a string that represents the array's memory address rather than its contents.
        *  This is because System.out.println will call the array's toString method,
        *  which doesn't provide a human-readable format for array contents.
        * */
    }

    public static int[] traverse2DArray(int [][]arr,int key)
    {
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                if(arr[i][j]==key)
                    return new int[] {i,j};
            }
        }
        return new int[] {};
    }

}


