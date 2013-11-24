package me.interview.pat;

public class Main {

	public static void main(String[] args){
		
		String arg = args[0];
		int sum = 0;
		int length = arg.length();
		for (int i = 0; i<length; i++)
		{
			int num = 0;
		
			try {
				num = Integer.valueOf(arg.substring(i, i+1));
			} catch (Exception e) {
				
			}
				
			sum += num;
			
		}
		//System.out.println(sum);
		//System.out.println(arg);
		
		String[] pinyinStrings = {"ling","yi","er","san","si","wu","liu","qi","ba","jiu"};
		
		String sumstring = String.valueOf(sum);
		
		for (int i = 0; i< sumstring.length()-1; i++)
		{
			int p = Integer.valueOf(sumstring.substring(i, i+1));
			System.out.print(pinyinStrings[p]+" ");
		}
		System.out.print(pinyinStrings[Integer.valueOf(sumstring.substring(sumstring.length()-1))]);
		
		return;
	}
}
