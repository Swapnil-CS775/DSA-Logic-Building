// find target element in matrix which is sorted row wise and column wise

package Swapnil.com;

public class SearchInTwoDArray {
    public static void main(String[] args) {
        //this is 2d array and elements are sorted row wise as well column wise
        //consider array of n x n
        int [][] arr={
                {10,20,30,40},
                {15,25,35,45},
                {28,29,37,49},
                {33,34,38,50}
        };
        int target=50;
        int lowerBound=0,upperbound= arr.length-1;
        //lowerbound and upperbound is nothing but rows and column of our matrix respectively

        if(search(arr,lowerBound,upperbound,target))
        {
            System.out.println("not found");
        }
    }
    public static boolean search(int[][] arr,int lowerBound,int upperbound ,int target)
    {
        while(lowerBound != arr.length && upperbound != -1)
        {
            if(arr[lowerBound][upperbound]==target)
            {
                System.out.println("found at "+lowerBound +" "+ upperbound);
                return false;
            }
            if(target<arr[lowerBound][upperbound])
            {
                upperbound--;
            }
            else
            {
                lowerBound++;
            }
        }
        return true;
    }


}
