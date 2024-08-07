//2. Store 10 song names and print reference

class SongRunner
{
	public static void main(String[] args)
	{
		String songName1="Perfect";
		String songName2="I Wanna Be Yours";
		String songName3="Dandelions";
		String songName4="Shape Of You";
		String songName5="Thousand years";
		String songName6="Untill I Found You";
		String songName7="As It Was";
		String songName8="Summertime Sadness";
		String songName9="No lie";
		String songName10="Worth It";
		
		String[] songNames={songName1,songName2,songName3,songName4,songName5,songName6,songName7,songName8,songName9,songName10};
		
		for(int begin=songNames.length-1;begin>=0;begin--)
		{
			String name=songNames[begin];
			System.out.println("Song name:"+name);
			System.out.println("Reference:"+begin);
		}
	}
	
}