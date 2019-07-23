import java.util.Scanner;

class Solution{
	
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int test_case=sc.nextInt();
		int temp=0;
		int flag=0;
		for(int t=1;t<=test_case;t++){
			String word=sc.next();
			char[] data=word.toCharArray();
			for(int i=0;i<(int)(word.length()/2);i++){
				if(data[i]==data[word.length()-1-i]){flag++;}
			}
			if((int)word.length()/2==flag){System.out.printf("#%d 1\n",t);}
			else{System.out.printf("#%d 0\n",t);} flag=0;
		}
				
	}//main end
	
}//clas end
