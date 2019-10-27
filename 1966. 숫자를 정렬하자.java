import java.util.Arrays;
import java.util.Scanner;

class Solution{
	
	public static void main(String[] args) throws Exception{
		Scanner sc=new Scanner(System.in);
		int ts=sc.nextInt();

		for(int t=1;t<=ts;t++){
			int num=sc.nextInt();
			int arr[]=new int[num];
			for(int i=0;i<num;i++){arr[i]=sc.nextInt();}
			Arrays.sort(arr);
			System.out.printf("#%d ",t);
			for(int i=0;i<num;i++){System.out.printf("%d ",arr[i]);}
			System.out.println();

		}//for #case end
		
	}//main end

}//class end
