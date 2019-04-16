package com.goomo;

import org.springframework.beans.factory.annotation.Autowired;

public class TextEditor {
	@Autowired //Without no arg Constructor
	private SpellChecker spellchecker;

	//condtructor
	@Autowired
	public TextEditor() {
		System.out.println("Inside Text editor Constructor");
	}
	
	public SpellChecker getSpellchecker() {
		return spellchecker;
	}
	/*//Autowired on Constructor
	 * @Autowired public void setSpellchecker(SpellChecker spellchecker) {
	 * this.spellchecker = spellchecker; }
	 */
	
	public void spellCheck()
	{
		spellchecker.spellCheck();
	}

	public void setSpellchecker(SpellChecker spellchecker) {
		this.spellchecker = spellchecker;
	}

}
