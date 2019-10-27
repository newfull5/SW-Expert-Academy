import java.util.Scanner;

class Solution{
	
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int c=sc.nextInt();
		int arr[]={0,31,28,31,30,31,30,31,31,30,31,30,31};

		for(int t=1;t<=c;t++){
			int fad=0;
			int sad=0;
			int fm=sc.nextInt();
			int fd=sc.nextInt();
			int sm=sc.nextInt();
			int sd=sc.nextInt();
			for(int i=0;i<fm;i++){fad+=arr[i];}fad+=fd;
			for(int j=0;j<sm;j++){sad+=arr[j];}sad+=sd;
			System.out.print("#"+t+" "+(sad-fad+1)+"\n");

			
		}
		
	}//main end

}//class end
