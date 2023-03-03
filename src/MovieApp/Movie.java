package MovieApp;

import MovieMain.MovieLoader;

public class Movie extends MovieLoader
{
	public Movie(int id,String Title, String Genre, String FilmGenre, String Actors, String Director, String CountryOrigin, String FilmingLocation, String Tags, double Ratings) 
	{
		for(int i=0; i<Title.lenght; i++)
		{
			String Title = Hashmap.get(i);
		}
		for(int i=0; i<Genre.lenght; i++)
		{
			String Genre = Hashmap.get(i);
		}
		for(int i=0; i<FilmGenre.lenght; i++)
		{
			String  FilmGenre = Hashmap.get(i);
		}
		for(int i=0; i<Actors.lenght; i++)
		{
			String Actors = Hashmap.get(i);
		}
		for(int i=0; i<Director.lenght; i++)
		{
			String Director = Hashmap.get(i);
		}
		for(int i=0; i<CountryOrigin.lenght; i++)
		{
			String CountryOrigin = Hashmap.get(i);
		}
		for(int i=0; i<FilmingLocation.lenght; i++)
		{
			String FilmingLocation = Hashmap.get(i);
		}
		for(int i=0; i<Tags.lenght; i++)
		{Actors
			String Tags = Hashmap.get(i);
		}
		for(int i=0; i<Ratings.lenght; i++)
		{
			String Ratings = Hashmap.get(i);
		}
		

	}
	public String getTitle() {return Title;}
	public String getGenre() {return Genre;}
	public String getFilmGenre() {return FilmGenre;}
	public String getActors() {return Actors;}
	public String getDirector() {return Director;}
	public String getCountryOrigin() {return CountryOrigin;}
	public String getFilmingLocation() {return FilmingLocation;}
	public String Tags() {return Tags;}
	public double Ratings() {return Ratings;}
	public int getId() {return id;}
	
	public void showDetails(){
		System.out.println(id + "\n\t Title: "+ Title + "\n\t Genre: " + Genre + "\n\t FilmGenre: " + FilmGenre + "\n\t Actors: " + Actors + 
		"\n\t Director: " + Director + "\n\t CountryOrigin: " + CountryOrigin + "\n\t FilmingLocation: " + FilmingLocation + "\n\t Tags: " + Tags + 
		"\n\t Rating: " + Ratings );
	}
	
	protected int id;
	protected static String Title;
	protected static String Genre;
	protected static String FilmGenre;
	protected static String Actors;
	protected static String Director;
	protected static String CountryOrigin;
	protected static String FilmingLocation;
	protected static String Tags;
	protected static double Ratings;
}
