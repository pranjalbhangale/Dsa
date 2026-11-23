import java.util.HashMap;
import java.util.Map;

public class ArrayMode {

	public static void main(String[] args) {
		int arr[]= {10,20,30,40,20,30,10,40,40,40,40,20,20};
		Map<Integer, Integer> freq=new HashMap<>();
		int maxF=0;
		int mode=0;
		for(int i=0;i<arr.length;i++) {
			freq.put(arr[i], freq.getOrDefault(arr[i], 0)+1);
			if(maxF<freq.get(arr[i])) {
				maxF=freq.get(arr[i]);
				mode=arr[i];
			}
		}
		System.out.println("mode OF Arr is : "+mode);

	}

}
