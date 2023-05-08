package movies;

import java.util.HashMap;
import java.util.Map.Entry;

import enums.Genre;
import enums.MPAA_Rating;

/**
 * 
 * @author Mahesh Kumar Nanganoori
 *
 */
public class Movie implements Comparable<Movie> {
	
	/**
	 * Private instance variables for Movie class
	 */
	private String title;
	private Genre genre;
	private MPAA_Rating rating;
	private double collections;
	private HashMap<String,Actor> characters = new HashMap<String,Actor>();;
	
	/**
	 * Four argument constructor for movie class
	 * @param title holds the title of the movie
	 * @param genre holds the genre for the movie
	 * @param rating holds the rating for the movie
	 * @param collections holds the collections collected for the movie
	 */
	public Movie(String title, Genre genre, MPAA_Rating rating, double collections) {
		super();
		this.title = title;
		this.genre = genre;
		this.rating = rating;
		this.collections = collections;
	}

	/**
	 * Getter method to get the title name of the movie
	 * @return returns the title of the movie
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * Getter method of type Genre Enum
	 * @return returns the type of genre the movie is
	 */
	public Genre getGenre() {
		return genre;
	}

	/**
	 * Getter method to get the rating of the movie of type MPAA_Rating Enum
	 * @return returns the rating of the movie
	 */
	public MPAA_Rating getRating() {
		return rating;
	}

	/**
	 * Getter method to get the collections of the movie 
	 * @return returns the collections collected by movie
	 */
	public double getCollections() {
		return collections;
	}

	/**
	 * Getter method of type HashMap
	 * @return returns the characters in the movie 
	 */
	public HashMap<String, Actor> getCharacters() {
		return characters;
	}
	
	/**
	 * Void method to add the character to a specified movie
	 * @param characterName holds the character name in the movie
	 * @param actor holds the actor name acted in the movie
	 */
	
	public void addCharacter(String characterName, Actor actor)
	{
		characters.put(characterName, actor);
	}

	/**
	 * Overriden method from comparable interface
	 */
	@Override
	public int compareTo(Movie o) {
		// TODO Auto-generated method stub
		return this.genre.compareTo(o.genre);
	}
	
	/**
	 * toString() to print the output in a string format
	 */

	@Override
	public String toString() {
		return printActor();
				
	}
	
	/**
	 * a private method to print the string output
	 * @return returns the toString values
	 */
	private String printActor()
	{
		String movie_N= title + "\n" + 
		"Genre: "+genre+"                        "+"Rating:"+rating +" ("+rating.getAge() +")\n"+
		"Collections: $"+String.format("%.2f",collections) +"\n" +
		"Cast : "+"\n"+ 
		"-----------------------------------------------------------"+"\n" +
		"Character Played                        Actor Name \n"+ 
		"-----------------------------------------------------------" +"\n";
		for(Entry<String, Actor> e : characters.entrySet())
		{
			movie_N += String.format("%-40s%-10s",e.getKey(),e.getValue().getFirstName()+
					" "+e.getValue().getLastName()+"\n");
		}
		return movie_N ;
	}
	
	
	
	
	
	

}
