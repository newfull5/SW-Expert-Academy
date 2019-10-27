import java.util.Scanner;
//1945. 간단한 소인수분해
class Solution{
	
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int c=sc.nextInt();
		int two; int three; int five; int seven; int eleven;
		for(int t=1;t<=c;t++){
			two=0; three=0; five=0; seven=0; eleven=0;
			int n=sc.nextInt();
			while(n%2==0){
				n=n/2;
				two++;
			}
			while(n%3==0){
				n=n/3;
				three++;
			}
			while(n%5==0){
				n=n/5;
				five++;
			}
			while(n%7==0){
				n=n/7;
				seven++;
			}
			while(n%11==0){
				n=n/11;
				eleven++;
			}
			System.out.printf("#%d %d %d %d %d %d\n",t,two,three,five,seven,eleven);
			
		}
		
	}//main end

}//class end
