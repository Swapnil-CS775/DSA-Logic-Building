//Calculate ceiling
package Swapnil.com;

public class Ceiling {
    public static void main(String[] args) {
        int []src={2,3,5,9,14,16,18};
        int result=findCeiling(src,151);
        System.out.println(result);
    }
    static int findCeiling(int []src,int target)
    {
        if(target>src[src.length-1])
        {
            return -1;
        }
        int start=0,end=src.length-1,mid;
        while(start<=end)
        {
            mid=start+(end-start)/2;
            if(src[mid]==target)
            {
                return 1;
            }
            else if(src[mid]<target)
            {
                start=mid+1;
            }
            else
            {
                end=mid-1;
            }
        }
        return src[start];

    }
}
//Output = -1

//Calculate Floore
package Swapnil.com;

public class Floore {
    public static void main(String[] args) {
        int []src={2,3,5,9,14,16,18};
        int result=findFloore(src,11);
        System.out.println(result);
    }
    static int findFloore(int []src,int target)
    {
        int start=0,end=src.length-1,mid;
        while(start<=end)
        {
            mid=start+(end-start)/2;
            if(src[mid]==target)
            {
                return 1;
            }
            else if(src[mid]<target)
            {
                start=mid+1;
            }
            else
            {
                end=mid-1;
            }
        }
        return src[end];

    }
}
//Outupu=9;
