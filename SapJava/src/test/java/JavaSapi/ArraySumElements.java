package JavaSapi;

public class ArraySumElements {

	public static void main(String[] args) {

		int A[]= {2,3,5,7,33,77,98};
		
		int sum=0;
		
		for(int i=0;i<A.length;i++)
		{
			sum=sum+A[i];
		}
		System.out.println("Sum is: " + sum);
	}

}
