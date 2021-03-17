package it.polito.tdp.alien;

import java.util.Collection;
import java.util.LinkedList;

public class WordEnhanced {
	
	private String alienWord;
	private LinkedList<String> translation;
	
	public WordEnhanced(String alienWord, String translation) {
		this.alienWord = alienWord;
		this.translation = new LinkedList<String>();
		this.translation.add(translation);
	}

	public String getAlienWord() {
		return alienWord;
	}

	public Collection<String> getTranslation() {
		return this.translation;
	}
	
	public void addTranslation(String translation) {
		this.translation.add(translation);
	}

	@Override
	public boolean equals(Object obj) {
		WordEnhanced w = (WordEnhanced) obj;
		if(w.alienWord.toLowerCase().compareTo(this.alienWord.toLowerCase())==0)
			return true;
		return false;
	}	
	

}
