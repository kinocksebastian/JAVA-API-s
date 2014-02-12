public class BottomUpMerge {
	
	public static void sort(Comparable[] a)	{
	
		int N = a.length;
		Comparable[] aux = new Comparable[N];
		for(int sz = 1; sz < N; sz = sz+sz) 
		{
   			for(int lo = 0; lo < N-sz; lo += sz+sz)
			{

				merge(a,aux,lo,lo+sz-1,Math.min(lo+sz+sz-1,N-1));
			}
		}	
	}

	private static void merge(Comparable[] a, Comparable[] aux, int lo, int mid , int hi) {
		if(lo<=hi) return;
		
		int i = lo;
		int j = mid + 1;
		int N = a.length;
		for(int k = 0; k < N; k++) 
			aux[k] = a[k];
	
		for(int k = 0; k < N; k++)
		{
	
			if(i > mid) a[k] = aux[j++];
			else if(j > hi) a[k] = aux[i++];
			else if(less(aux[i],aux[j])) a[k] = a[i++];
			else if(less(aux[j],aux[i])) a[k] = a[j++];
		}
	}		

	private static boolean less(Comparable p, Comparable q)
	{
		return p.compareTo(q) < 0;
	}

}

