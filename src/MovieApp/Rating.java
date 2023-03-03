package MovieApp;

import MovieMain.MovieLoader;

public class Rating extends Movie
{
	private Double Rating;
	public Rating(Double aRating,int id,String aRatings)
	{
		super(id,Title,Genre,FilmGenre,Actors,Director,CountryOrigin,FilmingLocation,Tags,Ratings);
		Rating = aRating;
	}
	public Double getRating(){return Rating;}
	public int getid(){return id;}
	public void showDetails()
	{
		super.showDetails();
		//System.out.println(Ratings.size);
		System.out.println("Ratings: " + Rating );
	}
}