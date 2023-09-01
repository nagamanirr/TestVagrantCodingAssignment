# TestVagrantCodingAssignment
<b>Problem Statement:<br></b>
<b>OVERVIEW<br></b>
Create an in-memory store for recently played songs that can accommodate N songs per user, with a fixed initial capacity. <br>
This store must have the capability to store a list of song-user pairs, with each song linked to a user. <br>
It should also be able to fetch recently played songs based on the user and eliminate the least recently played songs when the store becomes full.<br>
#EXAMPLE<br>
Illustration, when 4 different songs were played by a user & Initial capacity is 3:<br> 
Let's assume that the user has played 3 songs - S1, S2 and S3.<br>
The playlist would look like -> S1,S2,S3<br>
When S4 song is played -> S2,S3,<b>S4</b> <br>
When S2 song is played -> S3,S4,<b>S2</b><br> 
When S1 song is played -> S4,S2,<b>S1</b><br>

<b>#Solution:<br> </b>
This solution has three files <br>
1) SongsApp.java which is a global pool of songs<br>
2) Playlist.java which has the logic for in-memory store for recently played songs that can accommodate N songs per user<br>
3) Test123.java which has the testcases to test , assert and thereby demonstrate the asked behaviour in the problem description.<br>
The highlights of the solution provided in the code are <br>
  1) Associate <b>timestamp with the song played in a treemap.<br> </b>
  2) Use of treemap datastructure instead of regular hashmap so that sorted order will be maintained.<br>
  3) Use of navigablekeyset instead of regular keyset so that order will be maintained.<br>


<b>#How to run the testcases .</b> <br>
  1) In eclipse if you have testng configured you may simply run the testng tests present in Test123.java file.<br>
     if testng is not configured then to configure testng in eclipse follow <br>
     https://www.browserstack.com/guide/how-to-install-testng-in-eclipse <br>
 2) "mvn clean install"  if you have maven .<br>
 3) Entire eclipse project is also present as zip in the repo . Just in case to if anyone wants to improve.<br>
     


