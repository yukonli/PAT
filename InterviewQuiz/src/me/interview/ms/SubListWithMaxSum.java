package me.interview.ms;

public class SubListWithMaxSum {

	public static void main(String[] args)
	{
		int[] inputs = {1,2,-3,4,5,10,-12,9};
		
		System.out.println(maxsum(inputs));
	}
	
	private static int maxsum(int[] inputs)
	{
		int sum = 0;
		int maxsum = 0;
		for (int ele:inputs)
		{
			sum+=ele;
			if (sum < 0)
				sum = 0;
			if (sum > maxsum)
				maxsum = sum;
		}
		return maxsum;
	}
}
