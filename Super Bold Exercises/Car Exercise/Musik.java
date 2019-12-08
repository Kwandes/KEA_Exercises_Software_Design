// Car Exercise - Musik class
// Why? Yes. Am preparing for the "final" exam
// Jan Bogoryja-Zakrzewski, Dat19i
// Done on 08/12/2019 (DD/MM/YYYY) because it was too easy to bother with earlier

import java.io.File;
import java.util.Random;
import javax.sound.sampled.*;

public class Musik{

   private Clip clip;
   private AudioInputStream audio;
   private Random rand;
   private int soundNum;
   
   public Musik(String soundFamily)
   {
      try
      {
         rand = new Random();
         File[] files = new File("music/" + soundFamily + "/").listFiles();
         soundNum = rand.nextInt(files.length);
         
         audio = AudioSystem.getAudioInputStream(files[soundNum].getAbsoluteFile());
         clip = AudioSystem.getClip();
         clip.open(audio);
      } catch (Exception e) { System.out.println(e); }
   }
   
   public void play()
   {
      this.clip.start();
   }
   
   public void stop()
   {
      this.clip.stop();
   }
}