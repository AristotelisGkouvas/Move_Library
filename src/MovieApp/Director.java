package MovieApp;

import MovieMain.MovieLoader;

public class Director extends Movie
{
	private String DirectorName;
	public Director(int id,String aDirectorName,String aName)
	{
		super(id, Title, Genre,FilmGenre, Actors, Director, CountryOrigin, FilmingLocation, Tags,Ratings);
		DirectorName = aDirectorName;
	}
	public String getaDirectorName(){return DirectorName;}
	public int getid(){return id;}
	public void showDetails()
	{
		super.showDetails();
		System.out.println("Director: " + DirectorName );
	}
}