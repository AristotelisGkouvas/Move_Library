package MovieApp;

import MovieMain.MovieLoader;

public class FilmingLocation extends Movie
{
	private String Location;
	public FilmingLocation(int id,String aFilmingLocation,String aLocation)
	{
		super(id, Title, Genre,FilmGenre, Actors, Director, CountryOrigin, FilmingLocation, Tags,Ratings);
		Location = aLocation;
	}
	public int getid(){return id;}
	public String getLocation(){return Location;}
	public void showDetails()
	{
		super.showDetails();
		System.out.println("Filming Location: " + Location);
	}
}