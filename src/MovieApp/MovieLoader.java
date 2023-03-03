package MovieApp;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import Printer.PDFPrinter;
import Printer.HTMLPrinter;
import Printer.WORDPrinter;
import Printer.MARKDOWNPrinter;
import java.util.Scanner;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import MovieApp.User;

public class MovieLoader implements User
{	
	public static void main(String[] args)
	{
		String filePath = "test.txt";
		
		private HashMap<Integer,Year> Year = new HashMap<Integer,Year>();
		private HashMap<Integer,Comment> Comment = new HashMap<Integer,Comment>();
		private HashMap<Integer,Image> Image = new HashMap<Integer,Image>();
		private HashMap<Integer,uml> uml = new HashMap<Integer,uml>();
	
		private HashMap<Integer,Movie> ID = new HashMap<Integer,Movie>();
		private HashMap<Integer,Actor> Actors = new HashMap<Integer,Actor>();
		private HashMap<Integer,Director> Director = new HashMap<Integer,Director>();
		private HashMap<Integer,Genre> Genre = new HashMap<Integer,Genre>();
		private HashMap<Integer,Title> Title = new HashMap<Integer,Title>();
		private HashMap<Integer,Tag> Tags = new HashMap<Integer,Tag>();
		private HashMap<Integer,Rating> Ratings = new HashMap<Integer,Rating>();
		private HashMap<Integer,CountryOrigin> CountryOrigin = new HashMap<Integer,CountryOrigin>();
		private HashMap<Integer,FilmingLocation> FilmingLocation = new HashMap<Integer,FilmingLocation>();
		private HashMap<Integer,Genre> FilmGenre = new HashMap<Integer,Genre>();
				
		public static void getViewsAnswers()
		{
			int PrinterChoice;
			int html = 1;
			int pdf = 2;
			int word =3;
			int Markdown = 4;
			Scanner keyboard = new Scanner(System.in);
			System.out.println("What type of answers would you like");
			System.out.println("1. html");
		    System.out.println("2. pdf");
		    System.out.println("3. word");
		    System.out.println("4. Markdown");
		    if(Printerchoice == 1)
		    {
		    	PrinterChoice = html;
		    }
		    else if(PrinterChoice == 2)
		    {
		    	PrinterChoice = pdf;
		    }
		    else if(PrinterChoice == 3)
		    {
		    	PrinterChoice = word;
		    }
		    else if(PrinterChoice == 4)
		    {
		    	PrinterChoice = Markdown;
		    }
		    else if(PrinterChoice > 4 || PrinterChoice < 1)
	        {
		    	System.out.println("Try again.");
		    	PrinterChoice = -1;
	            getViewOfAnswers();
	        }

		    PrinterChoice = read_range(keyboard, 1, 4);
			Scanner reader = new Scanner(System.in);
			System.out.println("Enter type of answers: ");
			int PrinterChoice = reader.nextInt();
			reader.close();
			System.out.println("That will be $" + PrinterChoice + ".");
		}
		
		public static void getGiveNameOfMovie(ID)
		{
			this.ID = ID;
			int MoviesChoice;
			Scanner reader = new Scanner(System.in);
			System.out.println("Enter a movie: ");
			int MoviesChoice = reader.nextInt();
			reader.close();
			if(MoviesChoice != ID)
			{
				System.out.println("Try again.");
	            MoviesChoice = -1;
	            getGiveNameOfMovie();
			}
		}
		
		String line;
		BufferedReader reader = new BufferedReader(new FileReader(new File("sample-file.dat")));
		while ((line = reader.readLine()) != null)
		{
			String[] parts = line.split(":", 2);
		    if (parts.length >= 2)
		    {
		        String key = parts[0];
		        String value = parts[1];
		        ID.put(key, value);
		    } 
		    else 
		    {
		            System.out.println("ignoring line: " + line);
		    }
		    
		}

		for (String key : ID.keySet())
		{
			System.out.println(key + ":" + ID.get(key));
		}
		reader.close();
		
		while ((line = reader.readLine()) != null)
		{
			String[] parts = line.split(":", 2);
		    if (parts.length >= 2)
		    {
		        String key = parts[0];
		        String value = parts[1];
		        Actors.put(key, value);
		    } 
		    else 
		    {
		            System.out.println("ignoring line: " + line);
		    }
		    
		}

		for (String key : Actors.keySet())
		{
			System.out.println(key + ":" + Actors.get(key));
		}
		reader.close();
		
		while ((line = reader.readLine()) != null)
		{
			String[] parts = line.split(":", 2);
		    if (parts.length >= 2)
		    {
		        String key = parts[0];
		        String value = parts[1];
		        Director.put(key, value);
		    } 
		    else 
		    {
		            System.out.println("ignoring line: " + line);
		    }
		    
		}

		for (String key : Director.keySet())
		{
			System.out.println(key + ":" + Director.get(key));
		}
		reader.close();
		
		while ((line = reader.readLine()) != null)
		{
			String[] parts = line.split(":", 2);
		    if (parts.length >= 2)
		    {
		        String key = parts[0];
		        String value = parts[1];
		        Genre.put(key, value);
		    } 
		    else 
		    {
		            System.out.println("ignoring line: " + line);
		    }
		    
		}

		for (String key : Genre.keySet())
		{
			System.out.println(key + ":" + Genre.get(key));
		}
		reader.close();
		
		while ((line = reader.readLine()) != null)
		{
			String[] parts = line.split(":", 2);
		    if (parts.length >= 2)
		    {
		        String key = parts[0];
		        String value = parts[1];
		        Title.put(key, value);
		    } 
		    else 
		    {
		            System.out.println("ignoring line: " + line);
		    }
		    
		}

		for (String key : Title.keySet())
		{
			System.out.println(key + ":" + Title.get(key));
		}
		reader.close();
		
		while ((line = reader.readLine()) != null)
		{
			String[] parts = line.split(":", 2);
		    if (parts.length >= 2)
		    {
		        String key = parts[0];
		        String value = parts[1];
		        Tags.put(key, value);
		    } 
		    else 
		    {
		            System.out.println("ignoring line: " + line);
		    }
		    
		}

		for (String key : Tags.keySet())
		{
			System.out.println(key + ":" + Tags.get(key));
		}
		reader.close();
		
		while ((line = reader.readLine()) != null)
		{
			String[] parts = line.split(":", 2);
		    if (parts.length >= 2)
		    {
		        String key = parts[0];
		        String value = parts[1];
		        Ratings.put(key, value);
		    } 
		    else 
		    {
		            System.out.println("ignoring line: " + line);
		    }
		    
		}

		for (String key : Ratings.keySet())
		{
			System.out.println(key + ":" + Ratings.get(key));
		}
		reader.close();
		
		while ((line = reader.readLine()) != null)
		{
			String[] parts = line.split(":", 2);
		    if (parts.length >= 2)
		    {
		        String key = parts[0];
		        String value = parts[1];
		        CountryOrigin.put(key, value);
		    } 
		    else 
		    {
		            System.out.println("ignoring line: " + line);
		    }
		    
		}

		for (String key : CountryOrigin.keySet())
		{
			System.out.println(key + ":" + CountryOrigin.get(key));
		}
		reader.close();
		
		while ((line = reader.readLine()) != null)
		{
			String[] parts = line.split(":", 2);
		    if (parts.length >= 2)
		    {
		        String key = parts[0];
		        String value = parts[1];
		        FilmingLocation.put(key, value);
		    } 
		    else 
		    {
		            System.out.println("ignoring line: " + line);
		    }
		    
		}

		for (String key : FilmingLocation.keySet())
		{
			System.out.println(key + ":" + FilmingLocation.get(key));
		}
		reader.close();
		
		while ((line = reader.readLine()) != null)
		{
			String[] parts = line.split(":", 2);
		    if (parts.length >= 2)
		    {
		        String key = parts[0];
		        String value = parts[1];
		        FilmGenre.put(key, value);
		    } 
		    else 
		    {
		            System.out.println("ignoring line: " + line);
		    }
		    
		}

		for (String key : FilmGenre.keySet())
		{
			System.out.println(key + ":" + FilmGenre.get(key));
		}
		reader.close();
		
	}	
}