import java.util.Arrays;
import java.util.Scanner;

class Solution{
	
	public static void main(String[] args){
		
		Scanner sc=new Scanner(System.in);
		
		for(int t=1;t<=10;t++){
			int dump=sc.nextInt();
			int arr[]=new int[100];
			//배열 채우기
			for(int i=0;i<100;i++){
				arr[i]=sc.nextInt();
			}
			//덤핑
			for(int i=0;i<dump;i++){
				Arrays.sort(arr);
				arr[99]--; arr[0]++;				
			}
			Arrays.sort(arr);
			int result=arr[99]-arr[0];
			System.out.printf("#%d %d\n",t,result);
		}
				
	}//main end
	
}//class end
