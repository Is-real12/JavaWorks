package MrChiWeekEndSnack;

import java.util.Scanner;

public class Nokia {
    public static void main(String[] args) {



        Scanner scanner = new Scanner(System.in);
        boolean isTrue;
        System.out.println("""
                
     
     
                1. PhoneBook     2. Message      3. Chat         4. Call Register
                                               
                5. Tone          6. Settings     7. Call Divert  8. Game
                                               
                9. Calculator    10. Reminders   11. Clock       12. Profile
                                               
                                     13. SIM service""");
        System.out.println("""
                Select your choice:
                """);
        String phoneBookMenu = scanner.nextLine();


        switch(phoneBookMenu) {

            case "1":
                System.out.println("""
                                   PhoneBook Menu
        press 0 to go back
             
                        1. Search       
                        2. Service Nos      
                        3. Add Name        
                        4. Erase
                        5. Edit         
                        6. Assign Tone 
                        7. Send 'B' Card
                        8. Options
                        9. Speed Dials
                        10. Voice Tags
                        """);

                System.out.print("Select a menu: ");
                String searchMenu = scanner.nextLine();
                switch (searchMenu) {
                    case "1":
                        System.out.println("""
                                                                
                                Search....""");
                        break;
                    case "2":
                        System.out.println("""
                                Service Nos
                                                                        
                                """);
                        break;
                    case "3":
                        System.out.println("""
                                Add Name""");
                        break;
                    case "4":
                        System.out.println("""
                                Erase
                                 
                                 """);
                        break;
                    case "5":
                        System.out.println("""
                                Edit
                                                                        
                                """);
                        break;
                    case "6":
                        System.out.println("""
                                Assign Tone....
                                                                        
                                """);
                        break;
                    case "7":
                        System.out.println("""
                                Send 'B' Card
                                                                        
                                """);
                        break;
                    case "8":
                        System.out.println("""
                                                                            
                                Type of View
                                Memory Status
                                """);
                        ;
                        break;
                    case "9":
                        System.out.println("""
                                Erase
                                 """);
                        break;
                    case "10":
                        System.out.println("""
                                Edit

                                """);
                        break;
                    case "0":
                        return;

                    default:

                        System.out.println("""
                                Invalid
                                                                            
                                """);


                }

            case "2":
                System.out.println("""
                                                   Message Menu
                                   1. Write Message
                                   2. Inbox
                                   3. Outbox
                                   4. Picture Message
                                   5. Template
                                   6. Smileys
                                   7. Message Settings
                                   8. Info Service
                                   9. Voice Mailbox Number
                                   10. Service Command editor
                                                
                                   """);
                System.out.println("Select a Menu");
                String messageMenu = scanner.nextLine();
                switch (messageMenu){
                    case "1":
                        System.out.println("""
                                            1. Message Center Number
                                            2. Message sent as
                                            3. Message Validity
                                            """);
                        break;

                    case "2":
                        System.out.println("""
                                
                                            Deliver report
                                            Reply via same Center
                                            Character support
                                            
                                            """);

                }

            case "3":
                System.out.println("""
                                                Chat Menu
                                    Nothing to see here        
                                    
                                    """);

            case "4":
                System.out.println("""
                                                Call Register Menu
                                    1. Missed call
                                    2. Recieved calls
                                    3. Dialled number
                                    4. Erase recent call lists
                                    5. Show call duration
                                    6. Show call cost
                                    7. Call cost Settings
                                    8. Prepaid Credit
                                              
                                    """);
                System.out.println("Enter your Choice: ");
                String callReg = scanner.nextLine();
                switch (callReg){
                    case "5":
                        System.out.println("""
                                            1. Last call duration
                                            2. All call's Duration
                                            3. Receive call duration
                                            4. Dialled call's Duration
                                            5. Clear Timers
                                            
                                            """);

                    case "6":
                        System.out.println("""
                                            1. Last call cost
                                            2. All call's cost
                                            3. Clear Counters
                                            
                                            """);
break;
                    case "7":
                        System.out.println("""
                                            1. Call cost limit
                                            2. Show cost in
                                            
                                            """);

                }

            case "5":
                System.out.println("""
                                    Tone Menu
                        1. Ringing tone
                        2. Ringing volume
                        3. Incoming call alert
                        4. Composer
                        5. Message alert tone
                        6. Keypad tones
                        7. Warning and game tones
                        8. Vibrating alert
                        9. Screen saver
                                            
                                            """);


            case "6":
                System.out.println("""
                                                Settings Menu
                        1. Call settings
                        1. Pone Settings
                        3. Security Settings
                        4. Restore Factory settings          
                                            """);



                System.out.println("Enter your Choice: ");
                String settingsMenu = scanner.nextLine();

                switch (settingsMenu){
                    case "1":
                        System.out.println("""
                                               Call Settings Menu
                                1. Automatic redial
                                2. Speed dialling
                                3. Call waiting options
                                4. Own number sending
                                5. Phone line in use
                                6. Automatic answer
                                            
                                            """);
                        break;

                    case "2":
                        System.out.println("""
                                               Phone Settings Menu
                                1. Language
                                2. Cell info display
                                3. Welcome note
                                4. Network selection
                                5. Lights2
                                6. Confirm SIM service actions
                                            
                                            """);
                        break;

                    case "3":
                        System.out.println("""
                                               Security Settings Menu
                                1. PIN code request
                                2. Call barring service
                                3. Fixed dialing
                                4. Closed user group
                                5. Phone Security
                                6. Change access code
                                            
                                            """);
                        break;

                    case "4":
                        System.out.println("Nothing");


                }
            case "7":
                System.out.println("""
                                            Call Divert menu
                                    
                                           
                                    """);


            case "8":
                System.out.println("""
                                            Games menu
                                    
                                           
                                    """);

            case "9":
                System.out.println("""
                                            Calculator menu
                                    
                                           
                                    """);


            case "10":
                System.out.println("""
                                            Reminders menu
                                    
                                           
                                    """);


            case "11":
                System.out.println("""
                                            Clock Menu
                                   1. Alarm clock
                                   2. Date Settings
                                   3. Stop Watch
                                   5. Countdown time
                                   6. Auto update of date and time
                                    """);


            case "12":
                System.out.println("""
                                            Profile menu
                                    
                                           
                                    """);


            case "13":
                System.out.println("""
                                            Sim service
                                    
                                           
                                    """);
        }





    }

}
