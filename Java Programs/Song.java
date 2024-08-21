class Song
{
	public static void main(String[] args)
	{
		String songName1="Perfect";
		String songName2="I Wanna Be Yours";
		String songName3="Dandelions";
		
		String[] songNames={songName1,songName2,songName3};
		
		for(int begin=0;begin<songNames.length;begin++)
		{
			String name=songNames[begin];
			System.out.println("Song name:"+name);
			System.out.println("Reference:"+begin);
		}
	}
	
}