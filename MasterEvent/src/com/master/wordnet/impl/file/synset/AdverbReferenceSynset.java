/*

  Java API for WordNet Searching 1.0
  Copyright (c) 2007 by Brett Spell.

  This software is being provided to you, the LICENSEE, by under the following
  license.  By obtaining, using and/or copying this software, you agree that
  you have read, understood, and will comply with these terms and conditions:
   
  Permission to use, copy, modify and distribute this software and its
  documentation for any purpose and without fee or royalty is hereby granted,
  provided that you agree to comply with the following copyright notice and
  statements, including the disclaimer, and that the same appear on ALL copies
  of the software, database and documentation, including modifications that you
  make for internal use or for distribution.

  THIS SOFTWARE AND DATABASE IS PROVIDED "AS IS" WITHOUT REPRESENTATIONS OR
  WARRANTIES, EXPRESS OR IMPLIED.  BY WAY OF EXAMPLE, BUT NOT LIMITATION,  
  LICENSOR MAKES NO REPRESENTATIONS OR WARRANTIES OF MERCHANTABILITY OR FITNESS
  FOR ANY PARTICULAR PURPOSE OR THAT THE USE OF THE LICENSED SOFTWARE OR
  DOCUMENTATION WILL NOT INFRINGE ANY THIRD PARTY PATENTS, COPYRIGHTS,
  TRADEMARKS OR OTHER RIGHTS.

 */
package com.master.wordnet.impl.file.synset;

import com.master.wordnet.AdverbSynset;
import com.master.wordnet.SynsetType;
import com.master.wordnet.WordNetException;
import com.master.wordnet.WordSense;

import com.master.wordnet.impl.file.ReferenceSynset;
import com.master.wordnet.impl.file.RelationshipPointers;
import com.master.wordnet.impl.file.RelationshipType;
import com.master.wordnet.impl.file.RetrievalException;
import com.master.wordnet.impl.file.SenseKey;

/**
 * Reference implementation of an adverb synset.
 * 
 * @author Brett Spell
 */
public class AdverbReferenceSynset extends ReferenceSynset
		implements AdverbSynset
{

	/**
	 * Constructor that accepts adverb synset properties.
	 * 
	 * @param  definition Short description / definition of the meaning.
	 * @param  examples Examples of how the synset is used.
	 * @param  senseKeys Keys of word senses associated with this synset.
	 * @param  pointers Pointers to unresolved relationships.
	 * @param  lexFile Lexical file that contains the synset.
	 * @param  offset Byte offset into the data file where synset is defined.
	 */
	public AdverbReferenceSynset(String definition, String[] examples,
			SenseKey[] senseKeys, RelationshipPointers pointers,
			int lexFile, int offset)
	{
		super(SynsetType.ADVERB, definition, examples, senseKeys,
				pointers, lexFile, offset);
	}

	/**
	 * Returns the pertainyms (adjectives from which this adverb was derived),
	 * if any, associated with a word form in this synset.
	 * <br><p>
	 * For example, a pertainym of "genuinely" is "genuine".
	 * 
	 * @param  wordForm Word form for which to return pertainyms.
	 * @return The pertainyms of this synset.
	 * @throws WordNetException An error occurred retrieving data.
	 */
	public WordSense[] getPertainyms(String wordForm) throws RetrievalException
	{
		return getReferences(RelationshipType.PERTAINYM, wordForm);
	}

}