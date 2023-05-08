/**
 * 
 */
package movies;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author Mahesh Kumar Nanganoori
 *
 */
public class MovieMapping {

	/**
	 * Creating a hashmap movieMap
	 */
	 HashMap<Movie, LinkedList<Person>> movieMap = 
			new HashMap<Movie, LinkedList<Person>>();

	 /**
	  * Constructor for the class MovieMapping
	  */
	public MovieMapping() {
		super();
	}
	
	/**
	 * Getter Method to get the MovieMap of type HashMAp
	 * @return returns the movieMap contains
	 */

	public HashMap<Movie, LinkedList<Person>> getMovieMap() {
		return movieMap;
	}
	
	/**
	 * Void method to add the movie crew person in to the hashMap 
	 * @param movie hols the movie class object
	 * @param person holds the person class object
	 */
	public void addMovieCrewPerson(Movie movie, Person person)
	{
		LinkedList<Person> p = new LinkedList<Person>();
		if(movieMap.containsKey(movie))
		{
			movieMap.get(movie).add(person);
		}
		else
		{
			p.add(person);
			movieMap.put(movie, p);
		}
	}
	
	/**
	 * A method to get the list of movie a person acted 
	 * @param actorFullName holds the actor full name
	 * @return returns the list of movies a person acted
	 */
	public List<Movie> getListOfMoviesAPersonActed(String actorFullName)
	{
		List<Movie> movies = new LinkedList<Movie>();
		for(Movie m : movieMap.keySet())
		{
			LinkedList<Person> person_list = movieMap.get(m);
			for(Person p : person_list)
			{
				String combine = p.getFirstName() + " "+p.getLastName();
				if(combine.equals(actorFullName))
				{
					movies.add(m);
				}
			}
			Collections.sort(movies);
		}
		return movies;
	}
	
	/**
	 * a method to get all the technicians who worked in movie
	 * @param movieName holds the movie name 
	 * @return returns the list of technicians for specified movie
	 */
	public List<Technician> getAllTechnicians(String movieName)
	{
		List<Technician> techies = new LinkedList<Technician>();
		for(Movie m : movieMap.keySet())
		{
			LinkedList<Person> person_list = movieMap.get(m);
			
			for(Person p : person_list)
			{
				if(p instanceof Technician)
				{
					if(movieName.equals(m.getTitle()))
					{
						techies.add((Technician)p);
					}
				}
			}
		}
		return techies;
	}
	
	/**
	 * a method to get the list of character names in a movie
	 * @param actor holds the actor name 
	 * @return returns the list of character names who acted in movie
	 */
	public LinkedList<String> getListOfCharacterNames(String actor) {
		LinkedList<String> charactersList = new LinkedList<String>();
			for(Movie m : movieMap.keySet())
			{
				for(Entry<String,Actor> e1 : m.getCharacters().entrySet())
				{
					String c_Name = e1.getValue().getFirstName()+" "+
				e1.getValue().getLastName();
					if(c_Name.equals(actor))
					{
						charactersList.add(e1.getKey());
					}
				}
				Collections.sort(charactersList);
			}
		return charactersList;
	}
	
	/**
	 * a method to get all the actors in a movie
	 * @return returns the list of actors acted in  movie
	 */
	public List<Actor> getAllActors() {
		Set<Actor> uni_actors = new TreeSet<Actor>();
		List<Actor> actors = new LinkedList<Actor>();
		for(Movie m : movieMap.keySet())
		{
			LinkedList<Person> p_list = movieMap.get(m);

			for(Person p: p_list)
			{
					if(p instanceof Actor)
					{
						uni_actors.add((Actor)p);
						//actors.add(p1.toString());
					}
			}
		}
		for(Person p : uni_actors)
		{
			actors.add((Actor)p);
		}
			
		return actors;
	}

	/**
	 * toString() to display the output in a 
	 */
	@Override
	public String toString() {
		String s = " ";
		for(Movie m : movieMap.keySet())
		{
			s+=m.toString()+"\n"+
					"-----------------------------------------------------------\n"+
			        "Movie crew \n"+
					"-----------------------------------------------------------\n"+
			        "Name                                Role \n"+
					"-----------------------------------------------------------\n";
			for(Technician e : getAllTechnicians(m.getTitle()))
			{
				s+=e+"\n";
			}
			s+="******************************************************\n";
		}
		
		return s;
	}
	
	
	
}
