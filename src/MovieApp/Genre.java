package MovieApp;

import MovieMain.MovieLoader;

public class Genre extends Movie
{
	private String Titles;
	private String MoviesTitle;
	public Genre(int id,String aGenre,String aFilmGenre,String aTitle,String aMoviesTitle)
	{
		super(id,Title,Genre,FilmGenre,Actors,Director,CountryOrigin,FilmingLocation,Tags,Ratings);
		Titles = aTitle;
		MoviesTitle = aMoviesTitle;
	}
	public String getTitle(){return Titles;}
	public int getid(){return id;}
	public String getMoviesTitle(){return MoviesTitle;}
	for(int i = 0;i<MoviesTitle.lenght;i++)
    {
        return getTitle(i);
        return getDirectorName(i];
    }
	public void showDetails()
	{
		super.showDetails();
		System.out.println("Genre: " + Titles + "\n\t Movies with similar genre: " + MoviesTitle );
		//System.out.println(MoviesTitle.size);
	}
}
