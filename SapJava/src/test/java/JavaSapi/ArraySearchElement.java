package JavaSapi;

public class ArraySearchElement {

	public static void main(String[] args) {

		int A[]= {2,3,5,7,33,77,98};
		int key=33;
		
		boolean found=false;
		int position=-1;
		
		for(int i=0;i<A.length;i++)
		{
			if(key==A[i])
			{
				found=true;
				position=i;
				break;
			}
		}
		
		if(found) {
		System.out.println("Element:" + key + " found at index " + position);
		}
		else {
			System.out.print("Element" + key + "not found in the array ");
		}
		
	}

}
