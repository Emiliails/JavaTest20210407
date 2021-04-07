package calc;

public class Complexity 
{
	public int sort(int iRecordNum, int iType)
	{ 
        int  x = 0;
        int  y = 0;
        while (iRecordNum > 0) 
		{
		   	if (iType == 0) 
			{
	        	x = y + 2;
			} 
			else 
			{
            	if (iType == 1) 
				{
	                x = y + 5;
            	} 
				else 
				{
	                x = y + 10;
	            }
	        }
	        iRecordNum--;
		}
        
        return x;
	}
}
