package JavaSapi;

public class SecondLargestArray {
	
	public static void main(String[] args) {

		int arr[]= {1,2,5,3,67,45,32};
		
		int largestNum=0;
		int SecondLargest=0;
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>largestNum)
			{
			SecondLargest=largestNum;
			largestNum=arr[i];
		    }
		else if (arr[i]>SecondLargest && arr[i] !=largestNum)
		{
			SecondLargest=arr[i];
		}	
	}
		System.out.println("Highest Num : " + largestNum);
		System.out.println("2nd Highest Num: " + SecondLargest);
	}
}
