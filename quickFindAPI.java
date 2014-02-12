/* 	Quick Find (Eager Approach) 
 	array id[] N 
	connected if has same ID */

public class quickFindAPI {
	
	private int[] id;
	public quickFindAPI(int N)
	{
		id = new int[N];
	
		for(int i = 0;i<N;i++)
		{
			id[i]=i;
		}
	}

	public boolean isConnected(int p, int q)
	{
		return (id[p] == id[q]);
	}

	public void union(int p, int q)
	{
		int pid = id[p];
		int qid = id[q];
		
		for(int i = 0;i < id.length; i++)
		{
			if(id[i] == pid) id[i] = qid ;
		}
	}
}
			
