package test;

public class BoxPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m=4;
		
		for(int row=1;row<=m;row++)
		{
			//System.out.print("Entered first for");
			for(int col=1;col<=m;col++)
			{
				if(row==1||row==m)
				System.out.print("*");
				else if(col==1||col==m) 
					System.out.print("*");
				
			}
			
			System.out.println("");
			
		
	}

}
}
