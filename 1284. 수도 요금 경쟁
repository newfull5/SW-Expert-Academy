import java.util.Scanner;
//1284. 수도 요금 경쟁
class Solution{

	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		
		int Case_num=sc.nextInt();
		
		for(int i=1;i<=Case_num;i++){
			int P=sc.nextInt();
			int Q=sc.nextInt();
			int R=sc.nextInt();
			int S=sc.nextInt();
			int W=sc.nextInt();
			int A_cost=P*W;		
			int B_cost = (W>R) ? Q+(W-R)*S : Q;										//if(W>R){B_cost=Q+(W-R)*S;}
			if (A_cost<B_cost){System.out.printf("#%d %d \n",i,A_cost);}			//else{B_cost=Q;}
			else{System.out.printf("#%d %d \n",i,B_cost);}		
		}
		
	}//main end

}//class end
