import java.io.File;
import java.util.Random;
import javax.sound.sampled.*;

public class Musik{

   private Clip clip;
   private AudioInputStream audio;
   private Random rand;
   private int soundNum;
   
   public Musik()
   {
      rand = new Random();
      try
      {
         File[] files = new File("music/").listFiles();
         soundNum = rand.nextInt(files.length);
         audio = AudioSystem.getAudioInputStream(files[soundNum].getAbsoluteFile());
         clip = AudioSystem.getClip();
         clip.open(audio);
         setVolume(0.1);
         clip.start();
      } catch (Exception e) {System.out.println(e); }
   }
   
   public void setVolume(double volume)
   {      
      FloatControl gainControl = (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);
      
      double gain = volume; // number between 0 and 1 (loudest)
      float dB = (float) (Math.log(gain) / Math.log(10.0) * 20.0);
      gainControl.setValue(dB);
   }
}