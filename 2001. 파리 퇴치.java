import java.util.Scanner;

class Solution{
	
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int test_case=sc.nextInt();
		int sum, answer;
		for(int t=1;t<=test_case;t++){
			int N=sc.nextInt();
			int M=sc.nextInt();
			//필드 생성
			int field[][]=new int[N][N];
			for(int i=0;i<N;i++){
				for(int j=0;j<N;j++){
					field[i][j]=sc.nextInt();
				}
			}
			
			answer=0;
			for(int n=0;n<=N-M;n++){
				for(int m=0;m<=N-M;m++){
					sum=0;
					for(int i=n;i<M+n;i++){
						for(int j=m;j<M+m;j++){
							sum+=field[i][j];
						}
					}if(answer<=sum){answer=sum;}
				}
			}
			
			System.out.printf("#%d %d\n",t,answer);
		}
				
	}//main end
	
}//clas end
