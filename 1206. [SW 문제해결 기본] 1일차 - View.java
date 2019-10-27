import java.util.Scanner;

class Solution{
	
	public static void main(String[] args){
		
		Scanner sc=new Scanner(System.in);
		
		for(int t=1;t<=10;t++){
			int a=sc.nextInt();
			int arr[]=new int[a];
			int result=0;
			//배열 채우기
			for(int i=0;i<a;i++){
				arr[i]=sc.nextInt();
			}
			//좌우 비교 Math.abs
			for(int i=2; i<a-2; i++){
				if(arr[i]>arr[i-1]&&arr[i]>arr[i-2]&&arr[i]>arr[i+1]&&arr[i]>arr[i+2]){
					int top=Math.max(Math.max(arr[i-1],arr[i+1]),Math.max(arr[i-2],arr[i+2]));
					result+=arr[i]-top;
				}
			}
			
			System.out.printf("#%d %d\n",t,result);
		}
				
	}//main end
	
}//class end
