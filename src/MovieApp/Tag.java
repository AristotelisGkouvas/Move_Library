package MovieApp;

import MovieMain.MovieLoader;

public class Tag extends Movie
{
	private String Tag;
	public Tag(String aTags,int id,String aTag)
	{
		super(id,Title,Genre,FilmGenre,Actors,Director,CountryOrigin,FilmingLocation,Tags,Ratings);
		Tag = aTag;
	}
	
	public String getTag(){return Tag;}
	public int getid(){return id;}
	public void showDetails()
	{
		super.showDetails();
		//System.out.println(Tag.size);
		System.out.println("Tags: " + Tag );
	}
}