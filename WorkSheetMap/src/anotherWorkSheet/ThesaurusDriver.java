package anotherWorkSheet;

public class ThesaurusDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thesaurus t = new Thesaurus();
		t.addWord("rapid");
		t.addWord("slow");
		System.out.println(t);
		t.addSynonym("rapid", "fast");
		t.addSynonym("rapid", "quick");
		t.addSynonym("rapid", "swift");
		t.addSynonym("slow", "leisurely");
		t.addSynonym("slow", "sluggish");
		System.out.println(t);
		System.out.println(t.getSynonyms("rapid"));
		
		t.addSynonym("fun", "enjoyable");
		System.out.println(t);

	}

}
