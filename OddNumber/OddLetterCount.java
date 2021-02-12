package testing;

public class OddLetterCount {

	public static void main(String[] args) {

		String input="WELCOME";
		int center=input.length()/2;
		int noLetter=input.length();
		int start=noLetter;
		int flag=0;
		
		
		for(int t1=0;t1<noLetter;t1++)
		{
		   center= (input.length()/2)-1;
			start--;
			flag=0;
			for(int t2=0;t2<noLetter;t2++)
			{
				
				if(t2<start)
				{
					System.out.print(" ");
				
				}
				else
				{
					 if(center<noLetter-1)
					  {
						  center=center;
					  }
					  else if(flag==0)
					  {
						  
						  center=-1;
						  flag=1;
					  }
					  center++;
				  	System.out.print(input.charAt(center));
			   }
				
				
			}
			
			System.out.println();
		
		}

	}

}
