import java.util.Iterator;
import java.util.Scanner;

public class Arraypro1 {

	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 10, 4, 2, 3, 5};
		// int a[]= {5,4,3,2,1};
		// int a[] = { 1, 2, 3 };
       // int a[]= {1};
		Scanner sc = new Scanner(System.in);

		int n = a.length;

		int rem[] = new int[a.length];

		int max = a[0];

		int j = 0, t = 0, index = 0, k = 0;
		int b[] = new int[a.length];
		int p = 0, c = 0, q = 0, h = 0, f = 0, flag = 0;

		for (int i = 0; i < n - 1; i++) {
			if (a[i] > a[i + 1]) {
				// System.out.println(a[i]);
			//	t = i;
				rem[h++] = a[i];
				index = i + 1;
				c++;
				flag = 1;
			} else {
				b[p++] = a[i];
			}

		}

		for (k = index; k < n; k++) {
			if (a[index] == a[k]) {
				// System.out.println(k);
				break;
			}
		}
		if (index == a.length - 1) {
			for (int i = 0; i < a.length; i++) {
				if (max <= a[i]) {
					max = a[i];
					// System.out.println(a[i]);
				}
			}
			for (int i = 0; i < a.length; i++) {
				if (a[i] != max) {
					rem[f++] = a[i];
					;
				}
			}
			System.out.println(f);

		} else if (flag == 0) {
			System.out.println(c);
		} else {
			int d = index - c - 1;
			p = d + 1;

			// System.out.println(b[d]);
			for (int i = k; i < n; i++) {
				// System.out.println(i);
				if (a[d] > a[i]) {
					rem[h++] = a[i];
					c++;
				} else
					b[p++] = a[i];// System.out.println(a[i]);

			}
			System.out.println(c);
		}

//		for(int i=0;i<p;i++)
//		{
//			
//				System.out.println(b[i]);
//			
//		}	

//		for(int i=0;i<h;i++)
//		{
//			
//			System.out.println(rem[i]);
//		
//	  }
//		

	}

}
