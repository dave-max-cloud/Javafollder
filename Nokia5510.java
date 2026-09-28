import java.util.Scanner;

public class Nokia5510{

	public static void main(String [] args){

		Scanner inputCollector = new Scanner(System.in);
		
String menu = """

Welcome to Nokia

press

1:Phonebook
2:Messages
3:Chat
4:Call register
5:Tones
6:Settings
7:Call divert
8:Music
9.Games
10.Calculator
11.Reminders
12.Clock
13.Profiles
14.Service
15.Sim services
""";
       System.out.println(menu);
		     int menuChoice = inputCollector.nextInt();

		   switch(menuChoice){
		   
		   case 1 -> {System.out.println("Phonebook");
String phonebookMenu = """

Welcome to Phonebook Menu

Press

1.Search
2.Service Nos
3.Add name
4.Erase
5.Edit
6.Copy
7.Assign tone
8.Send b'card
9.Options
10.Speed dails
11.Voice tags

"""; 
    
       System.out.println(phonebookMenu);
       int phonebookMenuChoice = inputCollector.nextInt();
        switch(phonebookMenuChoice){
        
		    case 1 -> System.out.println("Search") ;
		    case 2 -> System.out.println("Service Nos");
		    case 3 -> System.out.println("Add name");
		    case 4 -> System.out.println("Erase");
		    case 5 -> System.out.println("Edit");
		    case 6 -> System.out.println("Copy");
		    case 7 -> System.out.println("Assign tone");
		    case 8 -> System.out.println("Send b'card");
		    case 9 -> {
		               System.out.println("1.Memory in use");
		               System.out.println("2.Type of view");
		               System.out.println("3.Memory status");
		               
		              int options = inputCollector.nextInt();
		              switch(options){
		              case 1 -> System.out.println("1.Memory in use");
		              case 2 -> System.out.println("2.Type of view");
		              case 3 -> System.out.println("3.Memory status");
		              }
		              }
		    case 10 -> System.out.println("Speed dails");
		    case 11 -> System.out.println("Voice tags");
		    default -> System.out.println("invalid");	
		   }
		   }
		   
		   
		   case 2 -> {System.out.println("Messages");
String messagesMenu = """

Welcome to Message Menu

1.Write messages
2.Inbox
3.Outbox
4.Picture messages 
5.Templates
6.Smileys
7.Messages settings
8.Info service
9.Voice mailbox number
10.Service command editor

""";

     
        System.out.println(messagesMenu);
        int messagesMenuChoice = inputCollector.nextInt();
        switch(messagesMenuChoice){
        
        case 1 -> System.out.println("Writing messages");
        case 2 -> System.out.println("Inbox");
        case 3 -> System.out.println("Outbox");
        case 4 -> System.out.println("Picture message");
        case 5 -> System.out.println("Templates");
        case 6 -> System.out.println("Smileys");
        case 7 -> 
                 {System.out.println("1.Set 1");
                 System.out.println("2.Common");
                
        int messagesSettingsPrompt = inputCollector.nextInt();
        switch(messagesSettingsPrompt){
        
        case 1 -> {
                   System.out.println("1.Message centre number");
                   System.out.println("2.Messege sent as");
                   System.out.println("3.Message validity");
                   }
        case 2 -> {
                   System.out.println("1.Delivery reports");
                   System.out.println("2.Reply via same centre");
                   System.out.println("3.Character support");
                   }
                 }
                 }
                
        case 8 -> System.out.println("Info service");
        case 9 -> System.out.println("Voice mailbox number");
        case 10 -> System.out.println("Sevice command editor");
        default -> System.out.println("invalid");	
              }
              }
        case 3 -> System.out.println("Welcome to Chat");

        case 4 -> {System.out.println("Call register");
String callRegisterMenu = """

Welcome to Call register

1.Missed calls
2.Received calls
3.Dailled numbers
4.Erase recent call lists
5.Show call duration
6.Show call costs
7.Call cost settings
8.Prepaid credit

""";

     System.out.println(callRegisterMenu);
        int callRegisterMenuChoice = inputCollector.nextInt();
        switch(callRegisterMenuChoice){
        
        case 1 -> System.out.println("Missed calls");
        case 2 -> System.out.println("Received calls");
        case 3 -> System.out.println("Dailed numbers");
        case 4 -> System.out.println("Show call duration");
        case 5 -> { 
                   System.out.println("1.Last call duration");
                   System.out.println("2.All calls duration");
                   System.out.println("3.Received calls duration");
                   System.out.println("4.Dialled calls duration");
                   System.out.println("5.Clear timers");
                   }
        case 6 -> {
                   System.out.println("1.Last call cost");
                   System.out.println("2.All calls cost");
                   System.out.println("3.Clear counter");
                   }
        case 7 -> {
                   System.out.println("1.Call cost settings");
                   System.out.println("2.Show costs in");
                   }
        case 8 -> System.out.println("Prepaid credit");
        default -> System.out.println("invalid");	
                  }
                  }
        case 5 -> {System.out.println("Tones");
String tonesMenu = """

Welcome to Tones

1.Ringing tone
2.Ringing volume
3.Incoming call alert
4.Message alert alone
5.Keypad tones
6.Warming tones
7.Vibrating alert
8.Screen saver

""";

       
     System.out.println(tonesMenu);
        int tonesMenuChoice = inputCollector.nextInt();
        switch(tonesMenuChoice){
        
        case 1 -> System.out.println("1.Ringing tone");
        case 2 -> System.out.println("2.Ringing volume");
        case 3 -> System.out.println("3.Incoming call alert");
        case 4 -> System.out.println("4.Message alert tone");
        case 5 -> System.out.println("5.Keypad tones");
        default -> System.out.println("invalid");	
		    }
		    }
        case 6 -> {System.out.println("Settings");

String settingsMenu = """

Welcome to Settings

1.Call settings
2.Phone settings
3.Security settings
4.Restore factory settings

""";

      System.out.println(settingsMenu);
        int settingsMenuChoice = inputCollector.nextInt();
        switch(settingsMenuChoice){
        
        case 1 -> {
                   System.out.println("1.Automatic redical");
                   System.out.println("2.Speed dailling");
                   System.out.println("3.Call waiting options");
                   System.out.println("4.Own number settings");
                   System.out.println("5.Phone line in use");
                   System.out.println("6.Automatic answer");
                   }
        case 2 -> {
                   System.out.println("1.Language");
                   System.out.println("Cell info display");
                   System.out.println("3.Welcome note");
                   System.out.println("4.Network selection");
                   System.out.println("5.Confirm SIM service action");
                   }
        case 3 -> {
                   System.out.println("1.PIN code request");
                   System.out.println("2.Call barring service");
                   System.out.println("3.Fixed dailling");
                   System.out.println("4.Closed user group");
                   System.out.println("5.Security level");
                   System.out.println("6.Change access codes");
                   }
       case 4 -> System.out.println("4.Restore factory settings");
       default -> System.out.println("invalid");	
                 }
                 }
		    case 7 -> System.out.println("Call divert");
		    
		    case 8 -> {System.out.println("Music");
String musicMenu = """

Welcome to Music

1.Music player
2.Radio
3.Recorder
4.Track list
""";
                 
           System.out.println(musicMenu);
        int musicMenuChoice = inputCollector.nextInt();
        switch(musicMenuChoice){     
        
        case 1 -> System.out.println("1.Music player");
        case 2 -> System.out.println("2.Radio");
        case 3 -> System.out.println("Recorder");
        case 4 -> System.out.println("Track list");
        default -> System.out.println("invalid");	
                   }
                   }
		    case 9 -> System.out.println("Games");
		    case 10 -> System.out.println("Calculator");
		    case 11 -> System.out.println("Reminders");
		    case 12 -> {System.out.println("Clock");
String clockMenu = """

1.Alarm clock
2.Clock settings
3.Date settings
4.Stop watch
5.Countdown timer
6.Auto update of date and time
""";
          System.out.println(clockMenu);
        int clockMenuChoice = inputCollector.nextInt();
        switch(clockMenuChoice){     
        
        case 1 -> System.out.println("1.Alarm clock");
        case 2 -> System.out.println("2.Clock settings");
        case 3 -> System.out.println("3.Date settings");
        case 4 -> System.out.println("4.Stop watch");
        case 5 -> System.out.println("5.Countdown timer");
        case 6 -> System.out.println("6.Auto update of date and time");
        default -> System.out.println("invalid");	         
                  }
                  }
        case 13 -> System.out.println("Profiles");         
		    case 14 -> System.out.println("Services");
		    case 15 -> System.out.println("Sim services");
		    default -> System.out.println("invalid");	  
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		  }
		  }
		  }
