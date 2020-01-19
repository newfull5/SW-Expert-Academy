import java.util.Scanner;

class Solution{
	//1204.최빈수 구하기
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int	T=sc.nextInt();
		int array[]=new int[1000];
		int index[]=new int[101];
		int max=0;
		int 최빈값=0;
		int nob=0;
		for(int C=1;C<=T;C++){
			max=0;
			최빈값=0;
			nob=sc.nextInt();
			
			for(int i=0;i<index.length;i++){
				index[i]=0;
			}			
			for(int i=0;i<array.length;i++){
				array[i]=sc.nextInt();	
				index[array[i]]++;
			}			
			for(int i=0;i<index.length;i++){
				if(max<=index[i]){
					max=index[i];
					최빈값=i;
				}
			}			
			System.out.printf("#%d %d\n",C,최빈값);
		}
	 
	}//main end

}//class end
