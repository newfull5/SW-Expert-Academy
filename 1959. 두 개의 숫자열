import java.util.Scanner;

class Solution{
	
	public static void main(String[] args) throws Exception{
		Scanner sc=new Scanner(System.in);
		int ts=sc.nextInt();

		for(int t=1;t<=ts;t++){
			int alength=sc.nextInt();
			int blength=sc.nextInt();
			int Aj[]=new int[alength];
			int Bj[]=new int[blength];
			for(int i=0;i<alength;i++){Aj[i]=sc.nextInt();}	// 1 5 3
			for(int i=0;i<blength;i++){Bj[i]=sc.nextInt();}	// 3 6 -7 5 4
			int re=0;
			int sum=0;
			int fin=0;
			int temp=0;
			if(alength>blength){
				for(int i=0;i<alength-blength;i++){
					while(re<alength&&re<blength){
						temp=Aj[re+i]*Bj[re];
						sum+=temp;
						re++;
					}
					if(fin<=sum){fin=sum;}
					sum=0; re=0;
				}
			}
			else{for(int i=0;i<blength-alength;i++){
					while(re<alength&&re<blength){	
						temp=Aj[re]*Bj[re+i];
						sum+=temp;
						re++;
					}
					if(fin<=sum){fin=sum;}
					sum=0; re=0;
				}
			}
			System.out.printf("#%d %d \n",t,fin);
			
		}//for #case end
		
	}//main end

}//class end
