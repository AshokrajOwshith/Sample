package array.twodimensions;

public class Matrix2DArray 
{
public static void main(String[] args) 
{
	int b [][] = new int[5][5];
	
	b[0][4]=5;
	
	b[1][3]=9;
	b[1][4]=2;
	b[2][0]=0;
	b[2][1]=0;
	b[2][3]=1;
	for (int l = 0; l < 5; l++) {
		for (int m = 0; m < 5; m++) {
			System.out.print(b[l][m]+"   ");	
		}
		System.out.println();
	
	}
	for (int i = 1; i < 5; i++) 
	{
		
	for (int j = 5; j >i; j--)
	{
	System.out.print(" ");

	}
for (int k = 0; k < i; k++) {
	System.out.print("9");
	
}
System.out.println();
	}
}
}
