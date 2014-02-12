public class ShellSort { 
	 
 	public static void sort(Comparable[] a)	{
		
		int N = a.length;
		int h = 1;
		while(h < N/3)   h = 3*h + 1;
		
		while(h >= 1)
		{

			for(int i = h; i < N ; i++)
			{
		
				for(int j = i; j >= h && less(a[j],a[j-h]) ; j -= h)
					exchange(a,j,j-h);
			}

			h = h/3;

		}
	}

	private static boolean less(Comparable p,Comparable q)
	{
		
		return p.compareTo(q) < 1 ;
	}

	private static void exchange(Comparable[] a, int i, int j)
	{

		Comparable swap = a[i];
		a[i] = a[j];
		a[j] = swap;
	}

}
