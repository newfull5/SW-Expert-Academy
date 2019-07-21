import java.util.Scanner;
//1288. 새로운 불면증 치료법
class Solution{

	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int c=sc.nextInt();	
		for(int t=1;t<=c;t++){
			int flag=0;
			int[] index=new int[10];
			int n=sc.nextInt();
			int k=n;
			while(flag==0){
				int temp=k;
				while(temp>0){
					index[temp%10]++;
					temp/=10;
				}
				flag=1;
				for(int i=0;i<10;i++){
					if(index[i]==0){
						flag=0;
					}
				}
				k+=n;
			}
			System.out.printf("#%d %d \n",t,k-n);
		}		
		
	}//main end

}//class end
