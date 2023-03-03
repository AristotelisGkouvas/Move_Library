package Printer;

import com.itextpdf.text.*;
import com.itextpdf.text.pdf.PdfWriter;
import MovieApp.Document;
import java.awt.Font;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class PDFPrinter extends PrinterChoice
{
    private static void PDFprinter(String input) throws IOException 
    {
    	String Path = getPath();
    	Scanner Inputs = new Scanner(System.in);
    	
    	System.our.println("Input name for output file");    	
    	String filename = Inputs.nextLine();
    	Document document = new Document();
    	
        PdfWriter.getInstance(document, new FileOutputStream(Path + filename + ".pdf")));
        document.open();
        document.add(new Paragraph(input))
        Font f = new Font();
        f.setSize(8);
        document.close();
        System.out.println("Done");

    }
}