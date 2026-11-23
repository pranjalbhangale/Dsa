import java.util.Arrays;

public class ArraySort {
	public static void sort(int[] arr) {
		
		for(int i=0;i<arr.length;i++) {
			int temp=arr[i];
			int j;
			for( j=i-1;j>=0;j--) {
				
				if(arr[j] < temp) 
					arr[j+1]=arr[j];
				else
					break;
				
			}
			arr[j+1]=temp;
		}
	}
	public static void main(String args[]) {
		int[] arr= {10,20,12,17,80,40,35};
		
		System.out.println(Arrays.toString(arr));
		sort(arr);
		System.out.println(Arrays.toString(arr));
	}
}
