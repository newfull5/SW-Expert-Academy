import java.util.Scanner;

class Solution{
	
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int test_case=sc.nextInt();
		for(int t=1;t<=test_case;t++){
			int S=sc.nextInt();
			int E=sc.nextInt();
			int M=sc.nextInt();
			int s=1;
			int e=1;
			int m=1;
			long flag=1;
			
			while(S!=s||E!=e||M!=m){
				s++;e++;m++;flag++;
				if(s==366){s=1;} if(e==25){e=1;} if(m==30){m=1;}
			}
			System.out.printf("#%d %d\n",t,flag);
			
		}
		
	}//main end
	
}//class end
