import java.util.Scanner;

class Solution{
	
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int test_case=sc.nextInt();
		int temp=0;
		for(int t=1;t<=test_case;t++){
			int num=sc.nextInt();
			for(int i=0;i<=num;i++){
				if(i%2==1){temp+=i;}
				if(i%2==0){temp-=i;}
			}
			int val=temp; temp=0;
		System.out.printf("#%d %d \n",t,val);
		}
				
	}//main end
	
}//clas end
