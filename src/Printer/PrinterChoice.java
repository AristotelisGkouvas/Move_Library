package Printer;

import MovieApp.MovieLoader;

public class PrinterChoice
{
	public static void main(String[] args)
	{
		if(PrinterChoice == html)
		{
			HTMLprinter(MoviesChoice);
		}
		else if(PrinterChoice == pdf)
		{
			PDFprinter(MoviesChoice);
		}
		else if(PrinterChoice == word)
		{
			WORDprinter(MoviesChoice);
		}
		else if(PrinterChoice == Markdown)
		{
			MARKDOWNprinter(MoviesChoice);
		}
	}
}
