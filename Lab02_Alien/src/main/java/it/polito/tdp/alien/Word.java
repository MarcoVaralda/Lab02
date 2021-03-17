package it.polito.tdp.alien;

public class Word {
	
	private String alienWord;
	private String translation;
	
	public Word(String alienWord, String translation) {
		this.alienWord = alienWord;
		this.translation = translation;
	}

	public String getAlienWord() {
		return alienWord;
	}

	public String getTranslation() {
		return translation;
	}
	
	public void setTranslation(String translation) {
		this.translation = translation;
	}

	@Override
	public boolean equals(Object obj) {
		Word w = (Word) obj;
		if(w.alienWord.toLowerCase().compareTo(this.alienWord.toLowerCase())==0)
			return true;
		return false;
	}	
	

}
