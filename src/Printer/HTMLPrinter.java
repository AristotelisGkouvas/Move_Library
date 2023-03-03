package Printer;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class HTMLPrinter extends PrinterChoice
{
	private static void HTMLprinter(String input) throws IOException 
    {
    	String Path = getPath();
    	Scanner Inputs = new scanner(System.in);
    	
    	System.our.println("Input name for output file");
    	String filename = Inputs.nextLine();

    	File HTML = new File(Path + filename + ".html");
        Document document = new Document(new htmlWriter(HTML));
        document.write(input)
        document.write("\n");
        document.close();
        System.out.println("Done");
        }
    }
}
