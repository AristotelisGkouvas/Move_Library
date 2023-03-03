package Printer;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class MARKDOWNPrinter extends PrinterChoice
{
	private static void MARKDOWNprinter(String input) throws IOException 
    {
    	String Path = getPath();
    	Scanner Inputs = new scanner(System.in);
    	
    	System.our.println("Input name for output file");
    	String filename = Inputs.nextLine();

    	File Markdown = new File(Path + filename + ".md");
        Document document = new Document(new MarkdownWriter(Markdown));
        document.write("<div><h1>" + input + "</h1></div>")
        document.write("\n");
        document.close();
        System.out.println("Done");
    }
}
