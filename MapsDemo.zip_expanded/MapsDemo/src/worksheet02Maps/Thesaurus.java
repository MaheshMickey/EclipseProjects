package worksheet02Maps;

import java.util.LinkedList;
import java.util.Map;
import java.util.TreeMap;

public class Thesaurus {
	private TreeMap<String, LinkedList<String>> thesaurus;
	
	public Thesaurus() {
		thesaurus = new TreeMap<String, LinkedList<String>>();
	}

	public void addWord(String word) {
		thesaurus.put(word, new LinkedList<String>());
	}
	
	public void addSynonym(String word, String synonym) {
		
			LinkedList<String> synonyms = thesaurus.get(word);
	}
}
