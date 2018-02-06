import java.util.*;
public class BinarySearch
{
   public static int binarySearch(int[] givenarray,int req_ele)
   {
   	int low=0,high=givenarray.length-1,mid=0;	
     int ans=-1;
     while(low<=high)
     {
      mid=low+(high-low)/2;
      if(givenarray[mid]==req_ele)
      {
      	ans= mid;
      	break;
      } 
      if(givenarray[mid]<req_ele) 	low=mid+1;
       if(givenarray[mid]>req_ele)  high=mid-1;
     }
     return ans;
   }

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int givenarray[]={1,3,5,9,34,45,78};
		int req_ele=99 ;
		int res= binarySearch(givenarray,req_ele);
		if(res==-1) System.out.println("Element doesnt exist");
		else System.out.println("Element index is "+res);
	}
}

