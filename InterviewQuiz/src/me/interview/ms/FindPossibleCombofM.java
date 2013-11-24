package me.interview.ms;

public class FindPossibleCombofM {
	
	
	public static void main(String[] args)
	{
		int n = 10;
		int m = 10;
		
		int[] aux = new int[n];
		
		for (int i=0; i < n; i++)
			aux[i] = 0;
		
		
		helper(m, 0, aux, n);
		
	}
	
	//Helper负责从指定的idx开始到n，找出所有等于m的组合
	public static void helper(int dest, int idx, int[] aux, int n)
	{
		if (dest == 0)
			dump(aux); //dest==0，说明m被减为0，找到了一组数据。
		
		if (dest<=0 || idx == n)
			return; //已经到达边界，可以返回。
		
		//先找出idx+1后面子数组中，所有符合条件的组合。
		helper(dest, idx+1, aux, n); 
		
		//因为后面的子数组所有组合都已找到，开始尝试寻找包含当前idx的组合。设置aux为1，表示选中。
		aux[idx] = 1;
		
		//从子数组中寻找m-idx的组合，如果有的话，因为idx已被选中，则会在寻找过程中打印idx。
		helper(dest-idx-1, idx+1, aux, n);
		//寻找结束，需要将idx反选，以免推出当前递归后仍误包含idx。
		aux[idx] = 0;
	}
	
	public static void dump(int[] aux)
	{
		for (int i=0; i<aux.length; i++)
			if (aux[i] > 0)
				System.out.print(i+1);
		System.out.println();
	}

}
