
public class MultDigit {
	public static int priority(String opr) {
		switch (opr) {
		case "$":
			return 10;
		case "*":
			return 8;
		case "/":
			return 8;
		case "%":
			return 8;
		case "+":
			return 5;
		case "-":
			return 5;
		}
		return 0;
	}

	public static String postfix(String[] inf) {
		StringBuffer str = new StringBuffer();
		int top = -1;
		String arr[] = new String[20];
		for (int i = 0; i < inf.length; i++) {
			String ele = inf[i];
			if (Character.isDigit(ele.charAt(0))) {

				str.append(inf[i] + " ");
			} else {
				if (top == -1) {
					arr[++top] = inf[i];
					continue;
				}
				while (top != -1 && priority(arr[top]) >= priority(ele)) {
//					System.out.println(ele);
					str.append(arr[top--] + " ");
				}
				arr[++top] = ele;
			}
		}
		while (top != 0)
			str.append(arr[top--] + " ");
		str.append(arr[top--]);

		return str.toString();
	}

	/**
	 * @param pre
	 * @return
	 */
	public static String prefix(String[] pre) {
		StringBuffer str = new StringBuffer();
		int top = -1;
		String[] arr=new String[20];
		for (int i = pre.length - 1; i >= 0; i--) {
			String ele=pre[i];
			if(Character.isDigit(ele.charAt(0))) {
				if(i==pre.length-1) {
					str.insert(0, ele);
					continue;
				}
				str.insert(0, ele+" ");
			}
			else {
				
				while(top!=-1 &&priority(arr[top])> priority(ele)) {
					str.insert(0, arr[top--]+" ");
				}
				arr[++top]=ele;
			}
		}
		while(top!=-1) {
			str.insert(0, arr[top--]+" ");
		}
		
		

		return str.toString();

	}

	public static int evaluate(int a, String ele, int b) {

		switch (ele) {
		case "+":
			return a + b;
		case "-":
			return a - b;
		case "/":
			return a / b;
		case "%":
			return a % b;
		case "*":
			return a * b;
		case "$":
			return (int) Math.pow(a, b);
		}
		return 0;
	}
	
	
	
	public static int preeval(String[] prtf) {
		
		String[] arr=new String[30];
		int top=-1;
		
		for(int i=prtf.length-1;i>=0;i--) {
			String ele=prtf[i];
			if(Character.isDigit(ele.charAt(0))) {
				arr[++top]=ele;
			}
			
			else {
				int a=Integer.valueOf( arr[top--]);
				int b=Integer.valueOf( arr[top--]);
				String res=String.valueOf( evaluate(a, ele, b));
				arr[++top]=res;
			}
		}
		return Integer.valueOf(arr[top]);
	}
	
	
	public static int postEval(String[] ptf) {
		int res;
		String[] arr = new String[20];
		int top = -1;

//		System.out.println(ptf[0]);
		for (int i = 0; i < ptf.length; i++) {
			String ele = ptf[i];

			if (Character.isDigit(ele.charAt(0))) {
				arr[++top] = ele;
			} else {
				int b = Integer.valueOf(arr[top--]);
				int a = Integer.valueOf(arr[top--]);
				res = evaluate(a, ele, b);
				arr[++top] = String.valueOf(res);

			}

		}
		return Integer.valueOf(arr[top]);
	}

	public static void main(String[] args) {
		String infix = "10 + 40 - 60 * 7 / 6";

		System.out.println("Infix: " + infix);
		String[] exp = infix.split(" ");

		String postf = postfix(exp);
		System.out.println("Postfix :" + postf);
		int res = postEval(postf.split(" "));
		System.out.println("Result of Postfix : " + res);
		System.out.println();
		String pref=prefix(exp);
		System.out.println("Prefix :"+pref);
		res = preeval(pref.split(" "));
		System.out.println("Result Of Prefix :" + res);

		
	}

}
