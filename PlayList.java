package com.mani.labs;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class PlayList {

	Set<String> pL;
	// The recent played will store timestamp of each song played as key and value
	// is songName
	TreeMap<Long, String> recentPL;
	String currUser;
	private final int MAX_SONGS_IN_PL = 50;
	// Max five recently played songs will be stored , Least recently played song
	// will be removed
	private final int MAX_RECENT_SIZE = 3;

	public PlayList(String user) {
		// TODO Auto-generated constructor stub

		pL = new HashSet<>();
		recentPL = new TreeMap<Long, String>();
		currUser = user;
	}

	public Set createPlaylist(Set<String> songs) {

		pL.addAll(songs);
		return pL;

	}

	public void displayPlayList() {

		System.out.println("The entire Playlist for user " + currUser + " is " + pL);
	}

	public String getRecentlyPlayedList() {

		System.out.println("the Recently played songs for user " + currUser + " are ");

		Set<Long> recentSongs = recentPL.navigableKeySet();
		String recentSongsformated = "";

		for (Long key : recentSongs) {
			System.out.print(recentPL.get(key) + "->");
			recentSongsformated = recentSongsformated + recentPL.get(key) + "->";
		}
		System.out.println();
		return recentSongsformated;

	}

	public void PlaySong(String CurrSong) {

		if (SongsApp.songPool.contains(CurrSong)) {

			if (pL.contains(CurrSong)) {
				System.out.println("Playing Song " + CurrSong + " on demand by " + currUser);
				// The below statement is the key solution for the given Problem.
				recentPL.put(System.currentTimeMillis(), CurrSong);
			} else {
				if (pL.size() < MAX_SONGS_IN_PL) {
					pL.add(CurrSong);
					System.out.println("Playing Song " + CurrSong + " on demand by " + currUser);
				}
				recentPL.put(System.currentTimeMillis(), CurrSong);

			}
			// Max five recently played songs will be stored , Least recently played song
			// will be removed
			if (recentPL.size() > MAX_RECENT_SIZE) {
				recentPL.pollFirstEntry();
			}
		}

		else {

			System.out.println("Please provide valid song to play");
			System.out.println(" Here is the list of valid songs " + SongsApp.songPool );
		}
	}

}
