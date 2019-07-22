import java.util.Scanner;

class Solution{
	
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int test_case=sc.nextInt();
		
		for(int t=1;t<=test_case;t++){
			int fh=sc.nextInt();
			int fm=sc.nextInt();
			int sh=sc.nextInt();
			int sm=sc.nextInt();
			int h=fh+sh; int m=fm+sm;
			if(m>=60){h+=1; m-=60;}
			if(h>12){h-=12;}
			System.out.printf("#%d %d %d %n",t,h,m);
		}
	}
}
