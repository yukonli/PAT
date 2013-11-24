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
	
	//Helper�����ָ����idx��ʼ��n���ҳ����е���m�����
	public static void helper(int dest, int idx, int[] aux, int n)
	{
		if (dest == 0)
			dump(aux); //dest==0��˵��m����Ϊ0���ҵ���һ�����ݡ�
		
		if (dest<=0 || idx == n)
			return; //�Ѿ�����߽磬���Է��ء�
		
		//���ҳ�idx+1�����������У����з�����������ϡ�
		helper(dest, idx+1, aux, n); 
		
		//��Ϊ�����������������϶����ҵ�����ʼ����Ѱ�Ұ�����ǰidx����ϡ�����auxΪ1����ʾѡ�С�
		aux[idx] = 1;
		
		//����������Ѱ��m-idx����ϣ�����еĻ�����Ϊidx�ѱ�ѡ�У������Ѱ�ҹ����д�ӡidx��
		helper(dest-idx-1, idx+1, aux, n);
		//Ѱ�ҽ�������Ҫ��idx��ѡ�������Ƴ���ǰ�ݹ���������idx��
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
