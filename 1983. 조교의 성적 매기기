import java.util.Arrays;
import java.util.Scanner;

class Solution{
	
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int test_case=sc.nextInt();
		String[] grade=new String[] {"D0", "C-", "C0", "C+", "B-", "B0", "B+", "A-", "A0", "A+"};
		for(int t=1;t<=test_case;t++){
			int people=sc.nextInt();
			int student=sc.nextInt();
			double arr[]=new double[people];
			
			//학점 계산후 대입
			for(int i=0;i<people;i++){
				int mexam=sc.nextInt();
				int fexam=sc.nextInt();
				int task=sc.nextInt();
				arr[i]=(mexam*0.35*100)+(fexam*0.45*100)+(task*0.20*100);
			}
			double temp=arr[student-1];
			Arrays.sort(arr);
			int index;
			for(int i=people-1; i>=0; i--){
				if(arr[i]==temp){
					index=i/(people/10);
					System.out.printf("#%d %s\n",t,grade[index]);
					break;
				}
			}		
		}
	}
}
