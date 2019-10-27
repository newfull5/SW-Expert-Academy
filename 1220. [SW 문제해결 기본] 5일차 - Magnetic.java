import java.util.Scanner;

class Solution{
	
	public static void main(String[] args){
		
		Scanner sc=new Scanner(System.in);
		for(int t=1;t<=10;t++){
			int N=sc.nextInt();
			int arr[][]=new int[N][N];
			int collide=0;
			for(int i=0;i<N;i++){
				for(int j=0;j<N;j++){
					arr[i][j]=sc.nextInt();
				}
			}
			
			for(int i=0;i<N;i++){
				int cnt=0;
				for(int j=0;j<N;j++){			
					if(arr[j][i]==1){cnt++;}
					if(arr[j][i]==2&&cnt!=0){collide++;cnt=0;}
				}
			}
			System.out.printf("#%d %d\n",t,collide);
		}
	}//main end	
}//class end
