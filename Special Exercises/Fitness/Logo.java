// This is completely unnecesary

import java.util.Random;

public class Logo {

   private Random rand;
   
   public void printLogo()
   {
   
      rand = new Random();
      int logo = rand.nextInt(100);
      
      if(logo < 25)
      {
         System.out.print(""
            +"   ('-.                            ('-.    .-')     .-')          _ .-') _     ('-.       .-') _           ('-.  _ .-') _   \n"
            +"  ( OO ).-.                      _(  OO)  ( OO ).  ( OO ).       ( (  OO) )  _(  OO)     ( OO ) )        _(  OO)( (  OO) )  \n"
            +"  / . --. /   .-----.   .-----. (,------.(_)---\\_)(_)---\\_)       \\     .'_ (,------.,--./ ,--,' ,-.-') (,------.\\     .'_  \n"
            +"  | \\-.  \\   '  .--./  '  .--./  |  .---'/    _ | /    _ |        ,`'--..._) |  .---'|   \\ |  |\\ |  |OO) |  .---',`'--..._) \n"
            +".-'-'  |  |  |  |('-.  |  |('-.  |  |    \\  :` `. \\  :` `.        |  |  \\  ' |  |    |    \\|  | )|  |  \\ |  |    |  |  \\  ' \n"
            +" \\| |_.'  | /_) |OO  )/_) |OO  )(|  '--.  '..`''.) '..`''.)       |  |   ' |(|  '--. |  .     |/ |  |(_/(|  '--. |  |   ' | \n"
            +"  |  .-.  | ||  |`-'| ||  |`-'|  |  .--' .-._)   \\.-._)   \\       |  |   / : |  .--' |  |\\    | ,|  |_.' |  .--' |  |   / : \n"
            +"  |  | |  |(_'  '--'\\(_'  '--'\\  |  `---.\\       /\\       /       |  '--'  / |  `---.|  | \\   |(_|  |    |  `---.|  '--'  / \n"
            +"  `--' `--'   `-----'   `-----'  `------' `-----'  `-----'        `-------'  `------'`--'  `--'  `--'    `------'`-------'  \n"
         );
      }
      
      if(logo >= 25 && logo < 50)
      {     
         System.out.print(""
          +"          _____ _____ ______  _____ _____   _____  ______ _   _ _____ ______ _____  \n"
          +"    /\\   / ____/ ____|  ____|/ ____/ ____| |  __ \\|  ____| \\ | |_   _|  ____|  __ \\ \n"
          +"   /  \\ | |   | |    | |__  | (___| (___   | |  | | |__  |  \\| | | | | |__  | |  | |\\ \n"
          +"  / /\\ \\| |   | |    |  __|  \\___ \\\\___ \\  | |  | |  __| | . ` | | | |  __| | |  | |\n"
          +" / ____ \\ |___| |____| |____ ____) |___) | | |__| | |____| |\\  |_| |_| |____| |__| |\\n"
          +"/_/    \\_\\_____\\_____|______|_____/_____/  |_____/|______|_| \\_|_____|______|_____/ \n"
         );
      }
      
      if(logo >= 50 && logo < 60)
      {     
         System.out.print(""    
            +"                               ______________________________________\n"
            +"                             ,'                                      `.\n"
            +"                            /                                          \\\n"
            +"                           |              ACCESS DENIED!                |\n"
            +"                           |                                            |\n"
            +"                            \\                                          /\n"
            +"                             `._______  _____________________________,'\n"
            +"                                     /,'\n"
            +"                                    /'\n"
            +"         \n"
            +"                .--._.-----._.--._.----.\n"
            +"               .' \\  (`._   (_)     _   \\\n"
            +"             .'    |  '._)         (_)  |\n"
            +"             \\ _.')\\      .----..---.   /\n"
            +"             |(_.'  |    /    .-\\-.  \\  |\n"
            +"             \\     0|    |   ( O| O) | o|\n"
            +"              |  _  |  .--.____.'._.-.  |\n"
            +"              \\ (_) | o         -` .-`  |\n"
            +"               |    \\   |`-._ _ _ _ _\\ /\n"
            +"               \\    |   |  `. |_||_|   |\n"
            +"               | o  |    \\_      \\     |     -.   .-.\n"
            +"               |.-.  \\     `--..-'   O |     `.`-' .'\n"
            +"             _.'  .' |     `-.-'      /-.__   ' .-'\n"
            +"           .' `-.' '.|='=.='=.='=.='=|._/_ `-'.'\n"
            +"           `-._  `.  |________/\\_____|    `-.'\n"
            +"              .'   ).| '=' '='\\/ '=' |\n"
            +"              `._.'  '---------------'\n"
            +"                      //___\\   //___\\\n"
            +"                        ||       ||\n"
            +"                        ||_.-.   ||_.-.\n"
            +"                       (_.--__) (_.--__)\n"
         );                                                                  
      }
      
      if(logo >=60 && logo < 80)
      {
         System.out.print(""
               +"               _..-...               \n"
               +"              ,Y+  .:.:\\_                  \n"
               +"             | |./'     ``-\\                  \n"      
               +"             |,'`           `.                   \n"
               +"             |               `_                  \n"
               +"             |     ,-''-. ,-''':                    \n"
               +"             |    /      .'     :                                _\n"
               +"             | .\\ |    o  |__o.,'                           _.-' '\\n"
               +"            '|\\| \\\\      /    `)                        ,..,'     ,'\n"
               +"             |`|  ' `..- .....<:                      ,'    `. ,-:\n"
               +"             ' ,-   _.-'        `.                 _,'       +'  |\n"
               +"              |`|  ,'            '.              ,'       - _/_,'-\\\n"
               +"               `.Y|   _,,.. ____./'           ,-'         /'|`'  _|\n"
               +"                 ||  | |  |  | |           _.-              `--+'\n"
               +"                 |-.  \"|:.|..|-.    _,.. ,/'               ,..Y'\n"
               +"                 / `\\.       ,-'  ,' /,,'               _,'\n"
               +"                .:_    -----'''|.:   |             _,Y''\n"
               +"               /  '`'';'.     /:  \\  |        _,Y-'\n"
               +"               |      |  ' .  | `._| |     _,'\n"
               +"           _/-'';.. _ |     ` |   \\   `.Y'i'\n"
               +"         ,'    ,'    '             |    i/'\n"
               +"      ,.'      /                   ..--'\n"
               +"      |       |                     \\\n"
               +"      : .     /                      ' .\n"
               +"     /'  `._ .'                         `.\n"
               +"     /     _''        ACCESS              \\  \n"
               +"    /     ./          DENIED               \\ \n"
               +"   /      /                                 \\   \n"
               +"  /      |                                   \\  \n"
               +" /     ,'|                                    |  \n"
               );
      }
      
      if(logo >=80 && logo <= 100)
      {
         System.out.print(""
         +"............................................________\n"
         +"....................................,.-'\"...................``~.,\n"
         +".............................,.-\"...................................\"-.,\n"
         +".........................,/...............................................\":,\n"
         +".....................,?......................................................,\n"
         +".................../...........................................................,}\n"
         +"................./......................................................,:`^`..}\n"
         +".............../...................................................,:\"........./\n"
         +"..............?.....__.........................................:`.........../\n"
         +"............./__.(.....\"~-,_..............................,:`........../\n"
         +".........../(_....\"~,_........\"~,_....................,:`........_/\n"
         +"..........{.._$;_......\"=,_.......\"-,_.......,.-~-,},.~\";/....}\n"
         +"...........((.....*~_.......\"=-._......\";,,./`..../\"............../\n"
         +"...,,,___.`~,......\"~.,....................`.....}............../\n"
         +"............(....`=-,,.......`........................(......;_,,-\"\n"
         +"............/.`~,......`-...................................../\n"
         +".............`~.*-,.....................................|,./.....,__\n"
         +",,_..........}.>-._...................................|..............`=~-,\n"
         +".....`=~-,__......`,.................................\n"
         +"...................`=~-,,.,...............................\n"
         +"................................`:,,...........................`..............__\n"
         +".....................................`=-,...................,%`>--==``\n"
         +"........................................_..........._,-%.......`\n"
         +"...................................,\n"
         );
      }

   
   }



}