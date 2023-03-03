package MovieApp;

import MovieMain.MovieLoader;

public class Title extends Movie
{
	private String titleName;
	public Title(String atitleName,int id,String aTitle)
	{
		super(id, Title, Genre,FilmGenre, Actors, Director, CountryOrigin, FilmingLocation, Tags,Ratings);
		titleName = atitleName;
	}
	public String getTitleName(){return titleName;}
	public int getid(){return id;}
	public void showDetails()
	{
		super.showDetails();
		System.out.println("Title: " + titleName );
	}
}