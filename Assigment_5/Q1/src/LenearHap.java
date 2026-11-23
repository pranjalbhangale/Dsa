
public class LenearHap {
	private HashEntry arr[];
	private int SIZE;

	static class HashEntry {
		String key;
		int val;

		HashEntry(String key, int val) {
			this.key = key;
			this.val = val;
		}
	}

	public LenearHap(int size) {
		SIZE = size;
		arr = new HashEntry[size];
	}

	private int hash(String key) {
		return Math.floorMod((key.hashCode() * 7) , 17);  
		//hashCode()-> can give negative because  
//		its return val can exceed `int` range and java wrap using 32bit 2's compliment
		//floorMod() over abs(key.hashcode) 
//		for same reason its positive value exceeds 32bit and get again wrap in negative
	}

	public int put(String key, int val) {
		int slot = hash(key);

		if (arr[slot] == null) {
			arr[slot] = new HashEntry(key, val);
			return 1;

		}
		else if (arr[slot].key.equals(key)) {
			arr[slot] = new HashEntry(key, val);
			
			return 1;

		}
		// colision
		else {
			
			for (int i = (slot + 1)%SIZE; i != slot; i =( (i + 1) % SIZE)) {
				
				
				if (arr[i] == null) {

					arr[i] = new HashEntry(key, val);
					return 1;
				}
				if (arr[i].key.equals(key)) {
					arr[i] = new HashEntry(key, val);
				
					System.out.println(i + "  " + key + "   " + val + "  " + arr[i]);
					return 1;

				}

			}

		}
		return -1;

	}

	public int get(String key) {
		int slot = hash(key);
		if (arr[slot] == null) {

			return 0;
		}
		if (arr[slot].key.equals(key)) {

			return arr[slot].val;
		}
		for (int i = (slot + 1) %SIZE; i != slot; i = (i + 1) % SIZE) {
			if (arr[slot] == null) {

				return 0;
			}
			if (arr[slot].key.equals(key)) {

				return arr[slot].val;
			}

		}

		return 0;

	}

	public void print() {
		for (int i = 0; i < SIZE; i++) {
			if (arr[i] != null)
				System.out.println(arr[i].key + " : " + arr[i].val + "  Idx: " + i + " --------->>>key.hashCode() " + arr[i].key.hashCode());
		}
	}

}
