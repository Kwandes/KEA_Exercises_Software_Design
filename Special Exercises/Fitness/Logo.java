// Fitness Exercise, Logos and other shenanigans
// Jan Bogoryja-Zakrzewski, Dat19i

// This is completely unnecesary

import java.util.Random;

public class Logo {

   private Random rand;
   
   public void printMainMenuLogo()
   {
      System.out.print(""
      +"                                                  \n"
      +"     STAR GYM                                  ___ \n"
      +"            YOUR FITNESS GALAXY            ,o88888\n" 
      +"                                         ,o8888888'\n" 
      +"                   ,:o:o:oooo.        ,8O88Pd8888\" \n"
      +"               ,.::.::o:ooooOoOoO. ,oO8O8Pd888'\" \n"
      +"             ,.:.::o:ooOoOoOO8O8OOo.8OOPd8O8O\" \n"
      +"            , ..:.::o:ooOoOOOO8OOOOo.FdO8O8\" \n"
      +"           , ..:.::o:ooOoOO8O888O8O,COCOO\" \n"
      +"          , . ..:.::o:ooOoOOOO8OOOOCOCO\" \n"
      +"           . ..:.::o:ooOoOoOO8O8OCCCC\"o \n"
      +"              . ..:.::o:ooooOoCoCCC\"o:o \n"
      +"              . ..:.::o:o:,cooooCo\"oo:o: \n"
      +"           `   . . ..:.:cocoooo\"'o:o:::' \n"
      +"           .`   . ..::ccccoc\"'o:o:o:::' \n"
      +"          :.:.    ,c:cccc\"':.:.:.:.:.' \n"
      +"        ..:.:\"'`::::c:\"'..:.:.:.:.:.' \n"
      +"      ...:.'.:.::::\"'    . . . . .' \n"
      +"     .. . ....:.\"' `   .  . . '' \n"
      +"   . . . ....\"'\n"    
      +"   .. . .\"'    \n" 
      +"  . \n"
      );  
   }
   
   public void printQuitLogo()
   {
      System.out.print("\n\n\n"
      +"                               ........                                  \n"
      +"                               ;::;;::;,                                 \n"
      +"                               ;::;;::;;,                                \n"
      +"                              ;;:::;;::;;,                               \n"
      +"              .vnmmnv%vnmnv%,.;;;:::;;::;;,  .,vnmnv%vnmnv,              \n"
      +"           vnmmmnv%vnmmmnv%vnmmnv%;;;;;;;%nmmmnv%vnmmnv%vnmmnv           \n"
      +"         vnmmnv%vnmmmmmnv%vnmmmmmnv%;:;%nmmmmmmnv%vnmmmnv%vnmmmnv        \n"
      +"        vnmmnv%vnmmmmmnv%vnmmmmmmmmnv%vnmmmmmmmmnv%vnmmmnv%vnmmmnv       \n"
      +"       vnmmnv%vnmmmmmnv%vnmmmmmmmmnv%vnmmmmmmmmmmnv%vnmmmnv%vnmmmnv      \n"
      +"      vnmmnv%vnmmmmmnv%vnmm;mmmmmmnv%vnmmmmmmmm;mmnv%vnmmmnv%vnmmmnv,    \n"
      +"     vnmmnv%vnmmmmmnv%vnmm;' mmmmmnv%vnmmmmmmm;' mmnv%vnmmmnv%vnmmmnv    \n"
      +"     vnmmnv%vnmmmmmnv%vn;;    mmmmnv%vnmmmmmm;;    nv%vnmmmmnv%vnmmmnv   \n"
      +"    vnmmnv%vnmmmmmmnv%v;;      mmmnv%vnmmmmm;;      v%vnmmmmmnv%vnmmmnv  \n"  
      +"    vnmmnv%vnmmmmmmnv%vnmmmmmmmmm;;       mmmmmmmmmnv%vnmmmmmmnv%vnmmmnv \n"
      +"    vnmmnv%vnmmmmmmnv%vnmmmmmmmmmm;;     mmmmmmmmmmnv%vnmmmmmmnv%vnmmmnv \n"
      +"    vnmmnv%vnmmmmm nv%vnmmmmmmmmmmnv;, mmmmmmmmmmmmnv%vn;mmmmmnv%vnmmmnv \n" 
      +"    vnmmnv%vnmmmmm  nv%vnmmmmmmmmmnv%;nmmmmmmmmmmmnv%vn; mmmmmnv%vnmmmnv \n"
      +"    `vnmmnv%vnmmmm,  v%vnmmmmmmmmmmnv%vnmmmmmmmmmmnv%v;  mmmmnv%vnnmmnv' \n"
      +"     vnmmnv%vnmmmm;,   %vnmmmmmmmmmnv%vnmmmmmmmmmnv%;'   mmmnv%vnmmmmnv  \n"
      +"      vnmmnv%vnmmmm;;,   nmmm;'              mmmm;;'    mmmnv%vnmmmmnv'  \n"
      +"      `vnmmnv%vnmmmmm;;,.         mmnv%v;,            mmmmnv%vnmmmmnv'   \n"
      +"       `vnmmnv%vnmmmmmmnv%vnmmmmmmmmnv%vnmmmmmmnv%vnmmmmmnv%vnmmmmnv'    \n"
      +"         `vnmvn%vnmmmmmmnv%vnmmmmmmmnv%vnmmmmmnv%vnmmmmmnv%vnmmmnv'      \n"
      +"             `vn%vnmmmmmmn%:%vnmnmmmmnv%vnmmmnv%:%vnmmnv%vnmnv'          \n"
      +"                                                                         \n"
      +"    #  #   #   #### #### #   #                                           \n"
      +"    ####  ###  # ## # ##  ###                                            \n"
      +"    #  # # # # #    #      #                                             \n"
      +"                                                                         \n"
      +"           #  #   #   #   #    ##  #     # #### #### #  ##               \n"
      +"           ####  ###  #   #   #  #  # # #  #--  #--  # # #               \n"
      +"           #  # #   # ### ###  ##    ###   #### #### ##  #               \n"
      );
   
   }
   
   public void printAccessDenied()
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
          +"   /  \\ | |   | |    | |__  | (___| (___   | |  | | |__  |  \\| | | | | |__  | |  | | \n"
          +"  / /\\ \\| |   | |    |  __|  \\___ \\\\___ \\  | |  | |  __| | . ` | | | |  __| | |  | |\n"
          +" / ____ \\ |___| |____| |____ ____) |___) | | |__| | |____| |\\  |_| |_| |____| |__| |\n"
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
               +"             | .\\ |    o  |__o.,'                           _.-' '\\\n"
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