import java.io.File;
import java.util.Scanner;

import javax.media.*;
class AudioPlay
{
 public static void main(String args[]) throws Exception
 {


 // Take the path of the audio file from command line
 File f=new File("song.mp3");


 // Create a Player object that realizes the audio
 final Player p=Manager.createRealizedPlayer(f.toURI().toURL());


  // Start the music
  p.start();


  // Create a Scanner object for taking input from cmd
  Scanner s=new Scanner(System.in);


  // Read a line and store it in st
  String st=s.nextLine();


   // If user types 's', stop the audio
   if(st.equals("s"))
   {
   p.stop();
   }
 }
}
