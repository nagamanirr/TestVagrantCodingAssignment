import static org.testng.Assert.assertEquals;

import java.util.Set;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.mani.labs.PlayList;
import com.mani.labs.SongsApp;

public class Test123 {
	SongsApp sa;
	Set<String> spInit;

	@BeforeTest
	public void setup() {
		
		//create songs pool
		sa = new SongsApp();

		spInit = sa.getSongPool();
		spInit.add("S1");
		spInit.add("S2");
		spInit.add("S3");
		spInit.add("S4");
		spInit.add("S5");
		spInit.add("S6");
		spInit.add("S7");
		spInit.add("S8");
		spInit.add("S9");
		spInit.add("S10");
		spInit.add("S11");
		spInit.add("S12");
		// userInit = sa.getUserPool();
		// userInit.add("tester");
		// userInit.add("mani");
		// userInit.add("QAgal");
		
	}

	
	@Test
	public void myTest()
	{
		
		System.out.print("From test");
	}
	
	@Test
	public void staticPlaylistTest() throws InterruptedException {
		
		PlayList maniPL = new PlayList("Mani");
		
		

		maniPL.displayPlayList();

		maniPL.PlaySong("S2");
		Thread.sleep(100);
		maniPL.PlaySong("S3");
		Thread.sleep(100);
		maniPL.PlaySong("S7");
		Thread.sleep(100);

		maniPL.PlaySong("S2");
		Thread.sleep(100);
		maniPL.PlaySong("S1");
		Thread.sleep(100);
		maniPL.PlaySong("S8");
		Thread.sleep(100);

		maniPL.PlaySong("S12");
		Thread.sleep(100);
		maniPL.PlaySong("S11");
		Thread.sleep(100);
		maniPL.PlaySong("S10");
		Thread.sleep(100);
		maniPL.getRecentlyPlayedList();
		
		// here last five songs played are S1 , S8,S12,S11,S10
		// so excepted output should be S1->S8->S12->S11->S10->
		// HENCE THE BELOW ASSERT
		
		    assertEquals(maniPL.getRecentlyPlayedList(),"S12->S11->S10->"," This test demonstrates removing least recently played one");
		    
		    
		
	}
	@Test
	public void dynamicPlaylistTest()
	{
		
		PlayList QAGalPL = new PlayList("QAGal");
		
		QAGalPL.PlaySong("S4");
		QAGalPL.getRecentlyPlayedList();
		
		assertEquals(QAGalPL.getRecentlyPlayedList(),"S4->","this test domenstrats dynamic play list");
		
	}
	
	@Test
	public void Demo() throws InterruptedException
	{
		
		PlayList user = new PlayList("user1");
		user.PlaySong("S1");
		Thread.sleep(100);
		assertEquals(user.getRecentlyPlayedList(),"S1->","this test domenstrats dynamic play list");
		user.PlaySong("S2");
		Thread.sleep(100);
		assertEquals(user.getRecentlyPlayedList(),"S1->S2->","this test domenstrats dynamic play list");
		user.PlaySong("S3");
		Thread.sleep(100);		
		assertEquals(user.getRecentlyPlayedList(),"S1->S2->S3->","this test domenstrats dynamic play list");
		user.PlaySong("S4");
		Thread.sleep(100);
		assertEquals(user.getRecentlyPlayedList(),"S2->S3->S4->","this test domenstrats dynamic play list");
		user.PlaySong("S2");
		Thread.sleep(100);
		assertEquals(user.getRecentlyPlayedList(),"S3->S4->S2->","this test domenstrats dynamic play list");
		user.PlaySong("S1");
		Thread.sleep(100);
		assertEquals(user.getRecentlyPlayedList(),"S4->S2->S1->","this test domenstrats dynamic play list");
	}
	
	@Test
	public void playInvalidSong() {
		PlayList QAbugger = new PlayList("QAB");
		QAbugger.PlaySong("S55");
		
	}
	
	
	
	
}
