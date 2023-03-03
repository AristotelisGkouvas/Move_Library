package MovieApp;

import MovieMain.MovieLoader;

public class Actor extends Movie
{
	private String ActorName;
	public Actor (String aActorName,int id,String aActors)
	{
		super(id, Title, Genre,FilmGenre, Actors, Director, CountryOrigin, FilmingLocation, Tags,Ratings);
		ActorName = aActorName;
	}
	public String getActorName(){return ActorName;}
	public int getid(){return id;}
	public void showDetails()
	{
		super.showDetails();
		System.out.println("Actors: " + ActorName );
	}
}