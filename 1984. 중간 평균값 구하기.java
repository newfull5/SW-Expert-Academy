import java.util.Arrays;
import java.util.Scanner;

class Solution{
	
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int test_case=sc.nextInt();
		double temp=0;
		int num[]=new int[10];
		for(int t=1;t<=test_case;t++){
			
			for(int i=0;i<10;i++){
				num[i]=sc.nextInt();
			}
			
			Arrays.sort(num);
			for(int i=1;i<9;i++){
				temp+=num[i];
			}
			
			double average=temp/8;
			temp=0;
			if((average-(int)average)>=0.5){average++;}
			System.out.printf("#%d %d\n",t,(int)average);
		}
		
		
	}//main end
	
}//clas end
