package App;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

import org.apache.commons.io.FileUtils;



public class App {
	
	public static void main(String[] args) {
		

		
		
		List <DatiComuni> myArchive = new ArrayList<>();
		
		myArchive.add (new Libro ( "Titolo1", 1992, 145, "Autore1", "Fantasy"));
		myArchive.add (new Libro ( "Titolo2", 1993, 100, "Autore2", "Narrative"));
		myArchive.add (new Libro ( "Titolo3", 1991, 97, "Autore3", "Thriller"));
		myArchive.add (new Libro ( "Titolo4", 2020, 121, "Autore1", "Classic"));
		myArchive.add (new Libro ( "Titolo5", 2000, 320, "Autore4", "Fantasy"));
		myArchive.add (new Rivista ( "Titolo6", 1932, 25, Periodicita.SETTIMANALE));
		myArchive.add (new Rivista ( "Titolo7", 1999, 21, Periodicita.MENSILE));
		myArchive.add (new Rivista ( "Titolo8", 2003, 30, Periodicita.SEMESTRALE));
		myArchive.add (new Rivista ( "Titolo9", 2005, 22, Periodicita.SETTIMANALE));
		myArchive.add (new Rivista ( "Titolo10", 2023, 31, Periodicita.MENSILE));
		
		
		System.out.println(myArchive.toString());
		
		save(myArchive);
		
		System.out.println("************************");
		
		reserchByIsdn( myArchive);
		
		System.out.println("************************");
		
		reserchByYear (myArchive, 2023);
		
		System.out.println("************************");
		
		reserchByAuthor(myArchive, "Autore1");
		
		System.out.println("************************");
		
		removeElement(myArchive);
		
		System.out.println("************************");
		
		System.out.println(myArchive.toString());
		
		System.out.println("************************");
		
		save(myArchive);
	
	}
	
	
	
	//METODO REMOVE
	
    public static void removeElement (List<DatiComuni> myArchive) {
    	
    	Scanner scanner = new Scanner(System.in);
		System.out.println("Inserisci un ISBN");
		long myIsbn = Long.parseLong(scanner.nextLine());
		
		try {
			
		myArchive.removeIf(element -> element.getRandomisbn() == myIsbn);
		
		throw new NumberFormatException("formato errato");
	
		}
		
		catch (NumberFormatException e) {
			
			System.out.println("formato errato");
			e.printStackTrace();
			
			}
		}
    
    //METODO RESEARCH ISBN
	
	public static void reserchByIsdn(List<DatiComuni> myArchive) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Inserisci un ISBN");	
		long myIsbn = Long.parseLong(scanner.nextLine());
		
		try{
			
	    Optional<DatiComuni> research = myArchive.stream().filter(element -> element.getRandomisbn() == myIsbn).findFirst();
	   
	    if (!research.isEmpty()) {
	    	
		System.out.println(research.toString());
	    } else { 
	    System.out.println("non ci sono elementi con questo ISBN");
	    }
		}
		catch (NumberFormatException e) {
			
			System.out.println("formato errato");
			e.printStackTrace();
			
			}
		}
	
	//METODO RESEARCH YEAR
	
	   public static void reserchByYear(List<DatiComuni> myArchive, int year) {
		   List<DatiComuni> research = myArchive.stream().filter(element -> element.getAnnoPublicazione() == year).toList();
		   
		   if (!research.isEmpty()) {
			   
		   System.out.println(research.toString());
		   } else { 
			 System.out.println("non ci sono elementi stampati in quest'anno");
			    
	         }
	   }
	   
	//METODO RESEARCH AUTHOR   
	   
	   public static void reserchByAuthor(List<DatiComuni> myArchive, String author) {
		   List<DatiComuni> research = myArchive.stream().filter(element -> element instanceof Libro && ((Libro) element)
				   .getAutore().equals(author))
				   .toList();
		   
		   if (!research.isEmpty()) {
			   
				System.out.println(research.toString());
			   } else { 
			    System.out.println("non ci sono elementi di questo autore");
			    
	           }
	   }   
	   
	
	//METODI PER SCRITTURA E LETTURA FILE
	   
	   private static File myFile = new File("libreria.txt");
	   
	   public static void save(List<DatiComuni> lista) {
		   
	        try {
	        	
	            List<String> lines = new ArrayList<>();
	            for (DatiComuni elemento : lista) {
	                lines.add(elemento.toString());
	            }
	            
	            FileUtils.writeLines(myFile, "UTF-8", lines, false);
	            
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }

	    public static String read() throws IOException {
	        if (myFile.exists()) {
	            String contenuto = FileUtils.readFileToString(myFile, "UTF-8");
	            System.out.println(contenuto);
	            return contenuto;
	        } else {
	            System.out.println("File non trovato");
	            return "";
	        }
	    }
	
	   
}

	



