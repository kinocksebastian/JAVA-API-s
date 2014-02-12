import java.lang.Comparable;

public class SelectionSort {

	public static void sort(Comparable[] a) {

		int N = a.length;
		try
		{
		for( int i = 0; i < N; i++ ) {
		
			int min = i;
			
			for(int j = i+1 ;j < N ; j++)
				if(less(a[j],a[min]))
					min = j;
			
			exchange(a,i,min);
		}
		}catch (Exception e) { System.out.println(e);}

	}
		private static boolean less(Comparable p, Comparable q) {

			return p.compareTo(q) < 0; 
		}

		private static void exchange(Comparable[] a,int i, int j) {

			Comparable swap = a[i];
			a[i] = a[j]; 
			a[j] = swap;
		}

}
		
