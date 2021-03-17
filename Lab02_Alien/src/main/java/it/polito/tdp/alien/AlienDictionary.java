package it.polito.tdp.alien;

import java.util.LinkedList;

public class AlienDictionary {
	
	LinkedList<Word> dizionario = new LinkedList<Word>();
	
	public void addWord(String alienWord, String translation) {
		Word daAggiungere = new Word(alienWord,translation);
		if(!dizionario.contains(daAggiungere))
			dizionario.add(daAggiungere);
		else {
			for(Word w : dizionario)
				if(w.equals(daAggiungere)) {
					w.setTranslation(translation);
					break;
				}
		}
	}
	
	public String translateWord(String alienWord) {
		for(Word w : dizionario)
			if(w.getAlienWord().toLowerCase().equals(alienWord.toLowerCase()))
				return w.getTranslation().toLowerCase();
		return null;
	}
	
	public void reset() {
		dizionario.clear();
	}
	
}
