package com.eudycontreras.othello.capsules;

import java.util.List;

import com.eudycontreras.othello.enumerations.PlayerType;

/**
 * <H2>Created by</h2> Eudy Contreras
 * <h4> Mozilla Public License 2.0 </h4>
 * Licensed under the Mozilla Public License 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <a href="https://www.mozilla.org/en-US/MPL/2.0/">visit Mozilla Public Lincense Version 2.0</a>
 * <H2>Class description</H2>
 */
public class AvailableWrapper {

	private PlayerType playerType;
	
	private List<IndexWrapper> indexes;

	
	public AvailableWrapper(PlayerType playerType, List<IndexWrapper> indexes) {
		super();
		this.playerType = playerType;
		this.indexes = indexes;
	}

	public final PlayerType getPlayerType() {
		return playerType;
	}

	public final List<IndexWrapper> getIndexes() {
		return indexes;
	}
	
	
}
