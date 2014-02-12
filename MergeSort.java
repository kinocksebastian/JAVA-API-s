public class MergeSort { 

	private static void merge(Comparable[] a, Comparable[] aux, int lo,int mid, int hi) {
		
		for(int k = lo; k <= hi; k++)
			aux[k] = a[k];

		int i = lo, j = mid + 1;
		for(int k = lo; k <= hi ; k++)
		{
			//inside for
			if(i > mid) a[k] = aux[j++];
			else if(j>hi) a[k] = aux[i++];
			else if(isless(aux[j],a[i])) a[k] = aux[j++];
			else a[k] = aux[i++]; 	
		}
	}

	private static void  sort(Comparable[] a, Comparable[] aux , int lo,int hi) {

		if(hi <= lo ) return ;
		int mid = lo + (hi - lo)/2 ;
 		
		sort(a,aux,lo,mid);
		sort(a,aux,mid+1,hi);
		merge(a,aux,lo,mid,hi);
 	}

	public static void sort(Comparable[] a) {
		
			
		Comparable[] aux = new Comparable[a.length];
		
		sort(a,aux,0,a.length - 1);
	}

	private static boolean isless(Comparable p, Comparable q) {
	
		return p.compareTo(q) < 0 ;
    	}

}
