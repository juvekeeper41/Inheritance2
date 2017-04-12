package stuff.model;

public class MorningThing 
{
	public class MorningThing implements Derpy
	{
		@Override
		public String getDerpifiedName(String name)
		{
			//Remove all vowels from the string.
			//Make all words end in 'erpy'.
			name = name.replace("a", "");
			name = name.replace("e", "");
			name = name.replace("i", "");
			name = name.replace("o", "");
			name = name.replace("u", "");
			
			String [] allWords = name.split("");
			for(int index = 0; index < allWords.length; index++)
			{
				allWords[index] = allWords[index] + "erpy";
			}
			
			String response = "";
			for(String word : allWords)
			{
				response += words + "";
			}
			
			return response;
		}
		
		@Override
		public int calculateDerpField()
		{
			// TODO Auto-generated method stub
			return 0;
		}
		
		@Override
		public void sayNothing()
		{
			JOptionPane.showMessageDialog(null, "nothing");
		}
	}
}
