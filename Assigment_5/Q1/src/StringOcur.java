import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class StringOcur {

	public static void main(String[] args) {
		String str="This is a String Prob That Counts Occurance of Words In String";
//		String str="This is a string Prob That Counts Occurance of Words In String";  //Capital "String" gives -10 slot
		String arr[]=str.split(" ");
		LenearHap lh=new LenearHap(17);
		Map<String,Integer> freq= new HashMap<>();
		for(int i=0;i<arr.length;i++) {
			lh.put(arr[i], lh.get(arr[i]) + 1);
		}
			
//			freq.put(arr[i], freq.getOrDefault(arr[i], 0) + 1);
////			if(freq.containsKey(arr[i])) {
//				freq.put(arr[i], freq.get(arr[i])+1);
//			}
//			else {
//				freq.put(arr[i], 1);
//			}
//		}
//		System.out.println("Lenear Hashmap:-------------------");
		lh.print();
//		System.out.println("HashMap:++++++++++++++++++");
//		for(Entry<String, Integer> f: freq.entrySet() ) {
//			System.out.println(f.getKey()+" : "+f.getValue());
//		}
		
	}

}
	