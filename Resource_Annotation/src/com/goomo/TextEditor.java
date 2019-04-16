package com.goomo;

import javax.annotation.Resource;

public class TextEditor {
	private SpellChecker spellchecker;

	public SpellChecker getSpellchecker() {
		return spellchecker;
	}
	@Resource(name="spellChecker")
	public void setSpellchecker(SpellChecker spellchecker) {
		this.spellchecker = spellchecker;
	}
	public void spellcheck()
	{
		spellchecker.checkspelling();
	}
}
