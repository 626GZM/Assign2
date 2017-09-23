import java.util.Scanner;
public class Main {
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();//方阵的边
		int count=1;//计数器
		in.close();
		int num[][]=new int[n][n];//建立矩阵
		int i,j;
		int all=n*n;
		int c=0;
		while(count<=all)  
	    {  
	        i=0;
	        j=0;  
	        for(i+=c,j+=c;i<n-c;i++)  
	        {
	        	if(count>all)
        		{
	        		break;
        		}
	        	num[i][j]=count++;
	        }
	        for(i--,j=j+1;j<n-c;j++)  
	        {
	        	if(count>all)
	        		break;
	        	num[i][j]=count++;
	        }
	        for(j--,i=i-1;i>=c;i--)  
	        {
	        	if(count>all)
	        		break;
	        	num[i][j]=count++;
	        }
	        for(i++,j=j-1;j>c;j--)  
	        {
	        	if(count>all)
	        		break;
	        	num[i][j]=count++;
	        }
	        c++;  
	    }  
		for(int i1=0;i1<n;i1++)
		{
			for(int j1=0;j1<n;j1++)
			{
				System.out.print(num[i1][j1]+"\t");
			}
			System.out.println();
		}
	}
}
