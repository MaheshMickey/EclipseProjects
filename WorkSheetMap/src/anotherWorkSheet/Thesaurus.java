package anotherWorkSheet;

import java.util.LinkedList;
import java.util.TreeMap;

public class Thesaurus {
	
	private TreeMap<String,LinkedList<String>> thesaurus ;

	public Thesaurus() {
		super();
		thesaurus = new TreeMap<String,LinkedList<String>>();
	}
	
	public void addWord(String word)
	{
		thesaurus.put(word, new LinkedList<String>());
	}
	
	public void addSynonym(String word, String synonym) {

		LinkedList<String> synonyms = thesaurus.get(word);
		if(synonyms == null)
		{
			this.addWord(word);
		}
		thesaurus.get(word).add(synonym);
	}
	
	public LinkedList<String> getSynonyms(String word)
	{
		return thesaurus.get(word);
	}
	
	public String toString()
	{
		return thesaurus.toString();
	}
	

}
