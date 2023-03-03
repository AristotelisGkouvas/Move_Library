package MovieApp;

import MovieMain.MovieLoader;

public class CountryOrigin extends Movie
{
	private String Country;
	public CountryOrigin(int id,String CountryOrigin,String aCountry)
	{
		super(id, Title, Genre,FilmGenre, Actors, Director, CountryOrigin, FilmingLocation, Tags,Ratings);
		Country = aCountry;
	}
	public int getId(){return id;}
	public String getCountry(){return Country;}
	public void showDetails()
	{
		super.showDetails();
		System.out.println("Country Origin: " + Country);
	}
}