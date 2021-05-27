package com.master.converters;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Image;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.pdf.PdfContentByte;
import com.itextpdf.text.pdf.PdfImage;
import com.itextpdf.text.pdf.PdfIndirectObject;
import com.itextpdf.text.pdf.PdfName;
import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.PdfStamper;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class MultipleImagesToPdf {
	 public void imagesToPdf(String destination, String pdfName, String imagFileSource) throws IOException, DocumentException {

		    Document document = new Document(PageSize.A4, 20.0f, 20.0f, 20.0f, 150.0f);
		    String desPath = "C:\\Users\\DELL LATITUDE\\Desktop\\"+ destination;

		    File destinationDirectory = new File(desPath);
		    if (!destinationDirectory.exists()){
		        destinationDirectory.mkdir();
		        System.out.println("DESTINATION FOLDER CREATED -> " + destinationDirectory.getAbsolutePath());
		    }else if(destinationDirectory.exists()){
		        System.out.println("DESTINATION FOLDER ALREADY CREATED!!!");
		    }else{
		        System.out.println("DESTINATION FOLDER NOT CREATED!!!");
		    }

		    File file = new File(destinationDirectory, pdfName + ".pdf");

		    FileOutputStream fileOutputStream = new FileOutputStream(file);

		    PdfWriter pdfWriter = PdfWriter.getInstance(document, fileOutputStream);
		    document.open();

		    System.out.println("CONVERTER START.....");

		    String[] splitImagFiles = imagFileSource.split(",");

		    for (String singleImage : splitImagFiles) {
		    Image image = Image.getInstance(singleImage);
		    document.setPageSize(image);
		    document.newPage();
		    image.setAbsolutePosition(0, 0);
		        document.add(image);
		    }

		    document.close();
		    System.out.println("CONVERTER STOPTED.....");
		}



		public static void main(String[] args) {

		    try {
		        MultipleImagesToPdf converter = new MultipleImagesToPdf();
		        Scanner sc = new Scanner(System.in);
		        System.out.print("Enter your destination folder where save PDF \n");
		        // Destination = D:/Destination/;
		        String destination = sc.nextLine();

		        System.out.print("Enter your PDF File Name \n");
		        // Name = test;
		        String name = sc.nextLine();

		        System.out.print("Enter your selected image files name with source folder \n");
		        String sourcePath = sc.nextLine();
		        // Source = D:/Source/a.jpg,D:/Source/b.jpg;
		        if (sourcePath != null || sourcePath != "") {
		            converter.imagesToPdf(destination, name, sourcePath);
		        }

		    } catch (Exception ex) {
		        ex.printStackTrace();
		    }
		}

}
