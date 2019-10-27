import java.util.Scanner;

class Solution{
	
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int test_case=sc.nextInt();

		for(int t=1;t<=test_case;t++){
			int height=sc.nextInt();
			int arr[][]=new int[200][200];

			//파스칼의 삼각형 생성
			for(int i=0;i<200;i++){
				for(int j=0;j<i;j++){
					if(j==0||i==0||i==j){arr[i][j]=1;}
					else{arr[i][j]=arr[i-1][j-1]+arr[i-1][j];}
										
				}
			}
			System.out.print("#" + t);
			for(int i=0;i<=height;i++){
				for(int j=0;j<i;j++){
					System.out.print(arr[i][j]+" ");
				}System.out.println();
			}

		}
				
	}//main end
	
}//clas end
