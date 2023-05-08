package movies;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeMap;

import enums.Genre;
import enums.MPAA_Rating;
import enums.Roles;

public class MovieDriver {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		//Create MovieMapping object as mapper and initialize it.
		MovieMapping mapper = new MovieMapping();
        //Read given movies.txt and assign objects accordingly
		Scanner scan = new Scanner(new File("movies.txt"));
		String a = "";
		int temp = 0;
		Double col;
		System.out.println("******************************************************\n"
				+ "Details of all movies in mapper\r\n"
				+ "******************************************************"
				+ "");
		while(scan.hasNext())
		{
			if(temp==0)
			{
				a = scan.nextLine();
			}
			String title = scan.nextLine();
			Genre g = Genre.valueOf(scan.nextLine().toUpperCase());
			String[] add_collections = scan.nextLine().split(" ");
			if(add_collections[0].startsWith("$"))
			{
				col = Double.parseDouble(add_collections[0].substring(1));
			}
			else {
				col = Double.parseDouble(add_collections[0]);
			}
			if(add_collections[1].equalsIgnoreCase("million"))
			{
				col = col*1000000;
			}
			else if(add_collections[1].equalsIgnoreCase("billion"))
			{
				col = ((col*100000000)*100)/100;
			}
			
			MPAA_Rating mp_rating = MPAA_Rating.valueOf(scan.nextLine().toUpperCase());
			String d =" ";
			//Start loop
            //Create a Movie object as movie with given data from movies.txt
			Movie movie = new Movie(title,g,mp_rating,col);
			 // If "Actors"
			//Create an Actor object actor and add character name and actor object to the movie 
			//Add actor and movie to mapper
			// If "Technicians"
			//Create Technician object and add technician object to movie
		
			String actors = scan.nextLine();
			int technicians_count = 0;
			if(actors.equals("Actors"))
			{
				while(scan.hasNext())
				{
					String[] characters_a = scan.nextLine().split("-");
					d = characters_a[0];
					if(d.equals("Technicians"))
					{
						technicians_count+=1;
						break;
					}
					String character_1 = characters_a[0];
					String[] actor_Name = characters_a[1].split(" ");
					String first_Name = actor_Name[1];
					String last_Name = actor_Name[2];
					int age = scan.nextInt();
					scan.nextLine();
					String[] remune = scan.nextLine().split(" ");
					
					Double r = Double.parseDouble(remune[0].substring(1));
					if(remune[1].equals("million"))
					{
						r = r * 1000000;
					}
					else if(remune[1].equalsIgnoreCase("Billion"))
					{
						r = r*100000000;
					}
					Actor actor_1 = new Actor(first_Name,last_Name,age,r);
					movie.addCharacter(character_1, actor_1);
					
					mapper.addMovieCrewPerson(movie, actor_1);
					
				}
			}
			
			if(d.equals("Technicians"))
			{
				while(scan.hasNext())
				{
					String[] tech_name = scan.nextLine().split(" ");
					String tech_first_Name = tech_name[0];
					if(tech_first_Name.equals("Movie"))
					{
						temp+=1;
						break;
					}
					String tech_last_Name = tech_name[1];
					String q = (scan.nextLine().replace(" ", "_").toUpperCase());
					Roles r = Roles.valueOf(q);
					Technician t = new Technician(tech_first_Name,tech_last_Name,r);
					mapper.addMovieCrewPerson(movie, t);
				}
			}
	
		}
		 //Print mapper
		System.out.println(mapper.toString());
		
		 //Method call for getting all technicians of a given movie name
		System.out.println("All technicians mapped with in movie Avengers\n"+
				"******************************************************\n");
		for(Technician x: mapper.getAllTechnicians("Avengers: Infinity War")) {
			System.out.println(x);
		}
		System.out.println("******************************************************");
		
		//Method call for getting character names of an actor in different movies
		System.out.println("Character names of actor Prabas Raju in different movies\n"
				+ "******************************************************");
		for(String y:mapper.getListOfCharacterNames("Prabhas Raju")) {
			System.out.println(y);
		}
		System.out.println("******************************************************");
		
		//Method call for getting all movie names of given actor name.
		System.out.println("List of movies Anushka Shetty acted\n"
				+ "******************************************************");
		for(Movie moviename:mapper.getListOfMoviesAPersonActed("Anushka Shetty")) {
			System.out.println(moviename.getTitle());
		}
		System.out.println("******************************************************");
		
		 //Method call for printing all actors in mapper
		System.out.println("List of all actors from all movies in the map\r\n"
				+ "******************************************************");
		for(Actor na:mapper.getAllActors()) {
			System.out.println(na);
		}
		//Method call printing list of all movies based on gross collections in descending order
		System.out.println("******************************************************");
		System.out.println("List of all movies sorted based on gross collections in descending ordery\n");
		System.out.println("******************************************************\n");
		
		HashMap<Double,String> desendingOrder = new HashMap<Double,String>();
		String f = "";
		for(Movie l:mapper.getMovieMap().keySet()) {
			
			f = String.format("%.0f",l.getCollections());
			
			desendingOrder.put(Double.parseDouble(f),l.getTitle());
		}
		 TreeMap<Double,String>mapSorted = new TreeMap<>(desendingOrder);
		 mapSorted.descendingMap().forEach((key, value) -> {
			 String a2 = String.format("%-45s$%.2f", value,key);
	            System.out.println(a2);
		 });
		
				
		
		
           
            
       
       
        
        
       
        
	}

}
