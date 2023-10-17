package Chaptter5;

import java.util.Scanner;

public class GlobalWorming {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



       int correct = 0;

            for (int j = 1; j <= 1; j++) {

                System.out.println("""
                        Source: (www.aroundTheWorld.org)
                                    
                        1. *What is a major greenhouse gas contributing to global warming?*
                        
                           1) Carbon dioxide
                           2) Methane
                           3) Nitrous oxide
                           4) Oxygen
                        select you choice:""");
                int firstInput = scanner.nextInt();
                if (firstInput == 1 || firstInput == 2 || firstInput == 3) {correct+=1;}

                System.out.println("""
                                    
                        2. *Which activity is a significant source of carbon dioxide emissions?*
                        
                           1) Deforestation
                           2) Transportation
                           3) Solar energy production
                           4) Recycling
                        select you choice:""");
                int secondInput = scanner.nextInt();
                if (secondInput == 1 || secondInput == 2) {correct+=1;}
                System.out.println("""
                        3. *Which phenomenon is linked to global warming and causes rising sea levels?*
                        
                           1) Thermal expansion of seawater
                           2) Melting glaciers and ice caps
                           3) Ocean acidification
                           4) Volcanic eruptions
                           
                    select you choice:""");
                int thirdInput = scanner.nextInt();
                if (thirdInput == 1 || thirdInput == 2 ) correct+=1;

                System.out.println("""
                        4. *Which region is experiencing more frequent and intense heatwaves due to global warming?*
                        
                           1) North Pole
                           2) Amazon Rainforest
                           3) Europe
                           4) Sahara Desert
                           select you choice:""");
                int fourthInput = scanner.nextInt();
                if (fourthInput == 3) correct+=1;

                System.out.println("""
                        5. *What is a potential consequence of global warming on ecosystems?*
                         
                           1) Loss of biodiversity
                           2) Increase in species adaptation
                           3) Expansion of wildlife habitats
                           4) Improved ecosystem stability
                       select you choice:""");
                int fifthInput = scanner.nextInt();
                if (fifthInput == 1 ) correct+=1;
            }


           if (correct == 5){
               System.out.println("Excellent");
           } else if (correct == 4) {
               System.out.println("Very Good");

           } else if (correct <=3) {
               System.out.println("Time to brush up on your knowledge of global warming");

           }

    }
    }

