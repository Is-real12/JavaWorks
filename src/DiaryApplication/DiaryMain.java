package DiaryApplication;

import java.util.Scanner;

public class DiaryMain {

        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Create a userName and Password");
        String userName = scanner.next() +" ";
        String passwords = scanner.next();
        Diary diary = new Diary(userName,passwords);
//        System.out.println(diary.toString());
            menuDis(diary);


    }





    public static void menuDis(Diary diary){
        Scanner scanner = new Scanner(System.in);
        System.out.println(diary.toString());

        String menuDisplay= """
                ==================================================================||
                  Welcome to OlePeju Diary <|=========|> May your parent read it  ||
                ==================================================================||
                1. Unlock Diary                                                   ||
                2. Lock Diary                                                     ||
                3. Create Entry                                                   ||
                4. Delete Entry                                                   ||
                5. Find Entry                                                     ||
                6. View Entry                                                     ||
                7. Exit                                                           ||
                ====================================================================""";
        System.out.println(menuDisplay);
        System.out.print("Enter a Choice: ");
       int choice=  scanner.nextInt();


        switch (choice) {
            case 1:
                System.out.println("Enter Password");
                try {
                    String password = scanner.next();
                    diary.unlockDiary(password);
                } catch (IllegalArgumentException il) {
                    System.out.println("Password does not match\n");
                }
                break;
            case 2:
                diary.lockDiary();
                System.out.println("Diary Locked");
                break;

            case 3:
                try {
                    System.out.print("Enter tile: ");
                    String title = scanner.nextLine();
                    title = scanner.nextLine();
                    System.out.println("Enter Body: ");
                    String body = scanner.nextLine();

                    diary.createEntry(title, body);
                    System.out.println("Entry Created");
                }catch (IllegalArgumentException il) {
                    System.out.println("Account is Locked!!!");
                }


                break;

            case 4:
                System.out.println("Enter Id");
                try {
                    int id = scanner.nextInt();
                diary.deleteEntry(id);
                } catch (IndexOutOfBoundsException in) {
                    System.out.println("Entry ID is not Available");
                }
                System.out.println("Entry Deleted");
                break;

            case 5:
                System.out.println("Enter Id");
                try {
                    int  id = scanner.nextInt();
                    diary.findEntry(id);

                } catch (IndexOutOfBoundsException in){
                    System.out.println("Entry ID is not Available");
                }
                System.out.println("Entry Found");
                break;
            case 6:
                try {
                System.out.println("Enter Id");
                int  id = scanner.nextInt();
                System.out.println(diary.getEntryStr(id));
                break;
                }catch (IllegalArgumentException il) {
                    System.out.println("Account is Locked!!!");
                }
                break;
            case 7:
                System.exit(0);
                break;

            default:
                System.out.println("Invalid Input!!!");
        }

        menuDis(diary);



    }
}
