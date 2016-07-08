
public class Stars 
{
	int sRow;
	int sCol;
	
	public Stars(int row, int col)
	{
		sRow = row;
		sCol = col;
	}
	
	public void setStars(int row, int col)
	{
		sRow = row;
		sCol = col;
	}
	
	public int getRow()
	{
		return sRow;
	}
	
	public int getCol()
	{
		return sCol;
	}
	
	public void displayStars()
	{
		for(int i = 0; i < sRow; ++i)
		{
			if(i % 2 == 0)
			{
				for(int k = 0; k < sCol; ++k)
				{
					System.out.print("*");
				}
				System.out.printf("\n");
			}
			else
			{
				System.out.print(" ");
				for(int k = 0; k < sCol; ++k)
				{
					System.out.print("*");
				}
				System.out.printf("\n");
			}
		}
	}
}
