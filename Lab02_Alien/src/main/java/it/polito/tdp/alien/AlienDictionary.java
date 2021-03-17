package it.polito.tdp.alien;

import java.util.LinkedList;

public class AlienDictionary {
	
	LinkedList<WordEnhanced> dizionario = new LinkedList<WordEnhanced>();
	
	public void addWord(String alienWord, String translation) {
		WordEnhanced daAggiungere = new WordEnhanced(alienWord,translation);
		for(WordEnhanced w : dizionario)
			if(w.equals(daAggiungere)) {
				w.addTranslation(translation);
				return;
			}
		dizionario.add(daAggiungere);
	}
	
	public String translateWord(String alienWord) {
		for(WordEnhanced w : dizionario)
			if(w.getAlienWord().toLowerCase().equals(alienWord.toLowerCase())) {
				String s = "";
				for(String ss : w.getTranslation())
					s = s +ss +"\n";
				return s;
			}
		return null;
	}
	
	public void reset() {
		dizionario.clear();
	}
	
}
