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
