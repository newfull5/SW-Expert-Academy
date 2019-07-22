import java.util.Scanner;

class Solution{
	
	public static void main(String[] args) throws Exception{
		Scanner sc=new Scanner(System.in);
		int c=sc.nextInt();

		for(int t=1;t<=c;t++){	
			int N=sc.nextInt();
			int[][]a=new int[N][N];
			int move=1;
			int horizon=0; int vertical=-1;
			int value=1;
			int n=N;
			
			while(n>0){
				for(int i=0;i<n;i++){
					vertical+=move;
					a[horizon][vertical]=value;
					value++;
				}
				n--;
				for(int j=0;j<n;j++){
					horizon+=move;
					a[horizon][vertical]=value;
					value++;
				}
				move*=-1;
			}
			
			System.out.println("#"+t);
			for(int i=0;i<N;i++){
				for(int j=0;j<N;j++){
					System.out.print(a[i][j]+" ");
				}
				System.out.println();
			}
		}
		
	}//main end

}//class end
