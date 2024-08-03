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

