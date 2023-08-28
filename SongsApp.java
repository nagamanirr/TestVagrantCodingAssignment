package com.mani.labs;

import java.util.HashSet;
import java.util.Set;

public class SongsApp {

	public static Set<String> songPool;

	// Set<String> userPool;

	public SongsApp() {

		// TODO Auto-generated constructor stub
		songPool = new HashSet<String>();
		// userPool = new HashSet<String>();
	}

	
	public Set<String> getSongPool() {
		return songPool;
	}

	
//	public Set<String> getUserPool() {
	// return userPool;
//	}

//	public void setUserPool(Set<String> userPool) {
//		this.userPool = userPool;
//	}

}
