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

//Binary search in infinite array
package Swapnil.com;

public class InfiniteArrya {
    public static void main(String[] args) {
        int []arr={1,3,8,12,13,15,19,22,41,46,58,65,68,70,73,79,80,81,89};
        System.out.println(ans(arr,8));

    }
    static int ans(int []arr,int target)
    {
        int start=0;
        int end=1; //we select box of two element initially
        //when this while condition become false ..in that chunk our key is present ,,at that value of start and end
        while(target>arr[end])
        {
            int temp=end+1;//basically this is our new start but we cant change here bcz we require this value below to find end
            //doubble the size of box
            //end=previous end + previous box size into 2
            end=end+(end-start+1)*2;
            start=temp;//here we define our start
        }
        //using above while loop we just find our chunk in which our key is belongs
        //and now transfer this chunk with start, end,target, arr to the binary search function for searching
        return BinarySearch(arr,target,start,end);
    }

    static int BinarySearch(int []arr,int target,int start,int end)
    {
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            if(arr[mid]==target)
            {
                return 1;
            }
            else if(arr[mid]<target)
            {
                start=mid+1;
            }
            else {
                end=mid-1;
            }
        }
        return -1;
    }
    
}
//output 1;

//Find how may times sorted arry is rotated it may contain non distinct element 
//my code is for both distinct and non distinct element
//code
package Swapnil.com;

public class UpdatedHowManyTimesArrayRotated {
    public static void main(String[] args) {
        int[] arr={2,2,3,3,4,0,1,2,2};
        int[] nums={1,2,3,4,5,6,7,8,9};
        int start=0,end=arr.length-1;
        System.out.println(findPivot(arr,start,end)+1);
        System.out.println(findPivot(nums,start,end)+1);
    }

    public static int findPivot(int[] nums, int start, int end) {

        if(nums[start]<nums[start+1] && nums[end]>nums[end-1])
        {
            return -1;
        }
        while (start <= end) {
            if (start == end) {
                return start;
            }

            int mid = start + (end - start) / 2;

            // Handle edge cases
            if (mid < end && nums[mid] > nums[mid + 1]) {
                return mid;
            }
            if (mid > start && nums[mid] < nums[mid - 1]) {
                return mid - 1;
            }

            if (nums[start] == nums[mid] && nums[mid] == nums[end]) {
                if (nums[start] > nums[start + 1]) {
                    return start;
                }
                start++;
                if (nums[end] < nums[end - 1]) {
                    return end - 1;
                }
                end--;
            } else if (nums[start] <= nums[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

}
//Output - 
// 5
// 0
