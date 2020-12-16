import java.util.Scanner;

import java.io.*;

import java.util.Random;


public class Menu{
    public static void main(String[] args) throws FileNotFoundException {

        createSave newGame = new createSave();
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        int i = 0;
        int a = 0;
        String name1 = "";
        String name2 = "";
        String name3 = "";
        String name4 = "";
        String class1 = "";
        String class2 = "";
        String class3 = "";
        String class4 = "";
        String game = "";
        int strength1 = 0;
        int toughness1 = 0;
        int intelligence1 = 0;
        int magic1 = 0;
        int influence1 = 0;
        int strength2 = 0;
        int toughness2 = 0;
        int intelligence2 = 0;
        int magic2 = 0;
        int influence2 = 0;
        int strength3 = 0;
        int toughness3 = 0;
        int intelligence3 = 0;
        int magic3 = 0;
        int influence3 = 0;
        int strength4 = 0;
        int toughness4 = 0;
        int intelligence4 = 0;
        int magic4 = 0;
        int influence4 = 0;
        String rerollName = "";
        int upperbound = 10;
        int lowerbound = 7;
        int upperbound2 = 6;

        while (i==0){
            System.out.println("1. Create a new game");
            System.out.println("2. Validate a save file ");
            System.out.println("3. Reroll an existing character");
            System.out.println("4. Quit");
    
            System.out.println("What is your decision? (Use numbers to decide)");
            int decision = scanner.nextInt();
            System.out.println(decision);

            if (decision == 1){
                Character firstCharacter = new Character(name1);
                Character secondCharacter = new Character(name2);
                Character thirdCharacter = new Character(name3);
                Character fourthCharacter = new Character(name4);
                firstCharacter.setType(class1);
                secondCharacter.setType(class2);
                thirdCharacter.setType(class3);
                fourthCharacter.setType(class4);
                System.out.println(firstCharacter.getStats());
                System.out.println(secondCharacter.getStats());
                System.out.println(thirdCharacter.getStats());
                System.out.println(fourthCharacter.getStats());
                
                System.out.println("What is the name of your game?");
                game = scanner.nextLine();
                game = scanner.nextLine();
                System.out.println("What is the name of your first character?");
                name1 = scanner.nextLine();
                System.out.println("What is the name of your next character?");
                name2 = scanner.nextLine();
                System.out.println("What is the name of your next character?");
                name3 = scanner.nextLine();
                System.out.println("What is the name of your last character?");
                name4 = scanner.nextLine();
        
                firstCharacter.setName(name1);
                secondCharacter.setName(name2);
                thirdCharacter.setName(name3);
                fourthCharacter.setName(name4);
           
                System.out.println("What type of character is your first character?");
                class1 = scanner.nextLine();
                while (a==0){
                    if (class1.equals("Peasant") || class1.equals("Knight") || class1.equals("Cleric") || class1.equals("Mage") || class1.equals("Courtier")){
                        a = a + 1;
                    }
                    else {
                        System.out.println("Try again!");
                        System.out.println("What type of character is your first character?");
                        class1 = scanner.nextLine();
                    }
                }
        
                a = 0;
                System.out.println("What type of character is your next character?");
                class2 = scanner.nextLine();
                while (a==0){
                    if (class2.equals("Peasant") || class2.equals("Knight") || class2.equals("Cleric") || class2.equals("Mage") || class2.equals("Courtier")){
                        if(class2.equals(class1)){
                            System.out.println("Try again!");
                            System.out.println("What type of character is your next character?");
                            class2 = scanner.nextLine();
                        }
                        else {
                            a = a +1;
                        }
                    }
                    else {
                        System.out.println("Try again!");
                        System.out.println("What type of character is your next character?");
                        class2 = scanner.nextLine();
                    }
                }
        
        
                a = 0;
                System.out.println("What type of character is your next character?");
                class3 = scanner.nextLine();
                while (a==0){
                    if (class3.equals("Peasant") || class3.equals("Knight") || class3.equals("Cleric") || class3.equals("Mage") || class3.equals("Courtier")){
                        if(class3.equals(class1) || class3.equals(class2)){
                            System.out.println("Try again!");
                            System.out.println("What type of character is your next character?");
                            class3 = scanner.nextLine();
                        }
                        else {
                            a = a +1;
                        }
                    }
                    else {
                        System.out.println("Try again!");
                        System.out.println("What type of character is your next character?");
                        class3 = scanner.nextLine();
                    }
                }
        
                a = 0;
                System.out.println("What type of character is your last character?");
                class4 = scanner.nextLine();
                while (a==0){
                    if (class4.equals("Peasant") || class4.equals("Knight") || class4.equals("Cleric") || class4.equals("Mage") || class4.equals("Courtier")){
                        if(class4.equals(class1) || class4.equals(class2) || class4.equals(class3)){
                            System.out.println("Try again!");
                            System.out.println("What type of character is your next character?");
                            class4 = scanner.nextLine();
                        }
                        else {
                            a = a +1;
                        }
                    }
                    else {
                        System.out.println("Try again!");
                        System.out.println("What type of character is your last character?");
                        class4 = scanner.nextLine();
                    }
                }
                firstCharacter.setType(class1);
                secondCharacter.setType(class2);
                thirdCharacter.setType(class3);
                fourthCharacter.setType(class4);
        
                System.out.println(firstCharacter.getStats());
                System.out.println(secondCharacter.getStats());
                System.out.println(thirdCharacter.getStats());
                System.out.println(fourthCharacter.getStats());
        
                strength1 = firstCharacter.getStrength();
                toughness1 = firstCharacter.getToughness();
                intelligence1 = firstCharacter.getIntelligence();
                magic1 = firstCharacter.getMagic();
                influence1 = firstCharacter.getInfluence();
                strength2 = firstCharacter.getStrength();
                toughness2 = firstCharacter.getToughness();
                intelligence2 = firstCharacter.getIntelligence();
                magic2 = firstCharacter.getMagic();
                influence2 = firstCharacter.getInfluence();
                strength3 = firstCharacter.getStrength();
                toughness3 = firstCharacter.getToughness();
                intelligence3 = firstCharacter.getIntelligence();
                magic3 = firstCharacter.getMagic();
                influence3 = firstCharacter.getInfluence();
                strength4 = firstCharacter.getStrength();
                toughness4 = firstCharacter.getToughness();
                intelligence4 = firstCharacter.getIntelligence();
                magic4 = firstCharacter.getMagic();
                influence4 = firstCharacter.getInfluence();
                class1 = firstCharacter.type;
                class2 = secondCharacter.type;
                class3 = thirdCharacter.type;
                class4 = fourthCharacter.type;
        
                try {
                    PrintWriter myWriter = new PrintWriter("savefile.csv");
                    myWriter.println(game);
                    myWriter.println(name1 + "," + class1 + "," + firstCharacter.strength + "," + firstCharacter.toughness + "," + firstCharacter.intelligence + "," + firstCharacter.magic + "," + firstCharacter.influence);
                    myWriter.println(name2 + "," + class2 + "," + secondCharacter.strength + "," + secondCharacter.toughness + "," + secondCharacter.intelligence + "," + secondCharacter.magic + "," + secondCharacter.influence);
                    myWriter.println(name3 + "," + class3 + "," + thirdCharacter.strength + "," + thirdCharacter.toughness + "," + thirdCharacter.intelligence + "," + thirdCharacter.magic + "," + thirdCharacter.influence);
                    myWriter.println(name4 + "," + class4 + "," + fourthCharacter.strength + "," + fourthCharacter.toughness + "," + fourthCharacter.intelligence + "," + fourthCharacter.magic + "," + fourthCharacter.influence);
                    myWriter.close();
                }
                catch (IOException e){
                    System.out.println("An error occurred.");
                    e.printStackTrace();
                }
                finally{
                    System.out.println("Done");
                }
            }
            if (decision == 2){
                if (!class1.equals(class2) || (!class1.equals(class3)) || (!class1.equals(class4)) || (!class2.equals(class3)) || (!class2.equals(class4)) || (!class3.equals(class4))){
                    if (class1.equals("Knight") && (strength1 >= 7) && (strength1 <= 10)){
                        if (toughness1 <= 6 && intelligence1 <=6 && magic1 <= 6 && influence1 <=6 ){
                            if (strength1 + toughness1 + intelligence1 + magic1 + influence1 >= 8 && strength1 + toughness1 + intelligence1 + magic1 + influence1 <= 28 ){
                            }
                        }
                    }
                    else if (class1.equals("Peasant") && (toughness1 >= 7) && (toughness1 <= 10)){
                        if (strength1 <= 6 && intelligence1 <=6 && magic1 <= 6 && influence1 <=6 ){
                            if (strength1 + toughness1 + intelligence1 + magic1 + influence1 >= 8 && strength1 + toughness1 + intelligence1 + magic1 + influence1 <= 28 ){
                            }
                        }
                    }

                    else if (class1.equals("Cleric") && (intelligence1 >= 7) && (intelligence1 <= 10)){
                        if (toughness1 <= 6 && strength1 <=6 && magic1 <= 6 && influence1 <=6 ){
                            if (strength1 + toughness1 + intelligence1 + magic1 + influence1 >= 8 && strength1 + toughness1 + intelligence1 + magic1 + influence1 <= 28 ){
                            }
                        }
                    }
                    else if (class1.equals("Mage") && (magic1 >= 7) && (magic1 <= 10)){
                        if (toughness1 <= 6 && intelligence1 <=6 && strength1 <= 6 && influence1 <=6 ){
                            if (strength1 + toughness1 + intelligence1 + magic1 + influence1 >= 8 && strength1 + toughness1 + intelligence1 + magic1 + influence1 <= 28 ){
                            }
                        }
                    }
                    else if (class1.equals("Courtier") && (influence1 >= 7) && (influence1 <= 10)){
                        if (toughness1 <= 6 && intelligence1 <=6 && magic1 <= 6 && strength1 <=6 ){
                            if (strength1 + toughness1 + intelligence1 + magic1 + influence1 >= 8 && strength1 + toughness1 + intelligence1 + magic1 + influence1 <= 28 ){
                            }
                        }
                    }
                    //------------------------------------------------------------------
                    if (class2.equals("Knight") && (strength2 >= 7) && (strength2 <= 10)){
                        if (toughness2 <= 6 && intelligence2 <=6 && magic2 <= 6 && influence2 <=6 ){
                            if (strength2 + toughness2 + intelligence2 + magic2 + influence2 >= 8 && strength2 + toughness2 + intelligence2 + magic2 + influence2 <= 28 ){
                            }
                        }
                    }
                    else if (class2.equals("Peasant") && (toughness2 >= 7) && (toughness2 <= 10)){
                        if (strength2 <= 6 && intelligence2 <=6 && magic2 <= 6 && influence2 <=6 ){
                            if (strength2 + toughness2 + intelligence2 + magic2 + influence2 >= 8 && strength2 + toughness2 + intelligence2 + magic2 + influence2 <= 28 ){
                            }
                        }
                    }

                    else if (class2.equals("Cleric") && (intelligence2 >= 7) && (intelligence2 <= 10)){
                        if (toughness2 <= 6 && strength2 <=6 && magic2 <= 6 && influence2 <=6 ){
                            if (strength2 + toughness2 + intelligence2 + magic2 + influence2 >= 8 && strength2 + toughness2 + intelligence2 + magic2 + influence2 <= 28 ){

                            }
                        }
                    }
                    else if (class2.equals("Mage") && (magic2 >= 7) && (magic2 <= 10)){
                        if (toughness2 <= 6 && intelligence2 <=6 && strength2 <= 6 && influence2 <=6 ){
                            if (strength2 + toughness2 + intelligence2 + magic2 + influence2 >= 8 && strength2 + toughness2 + intelligence2 + magic2 + influence2 <= 28 ){
                            }
                        }
                    }
                    else if (class2.equals("Courtier") && (influence2 >= 7) && (influence2 <= 10)){
                        if (toughness2 <= 6 && intelligence2 <=6 && magic2 <= 6 && strength2 <=6 ){
                            if (strength2 + toughness2 + intelligence2 + magic2 + influence2 >= 8 && strength2 + toughness2 + intelligence2 + magic2 + influence2 <= 28 ){
                            }
                        }
                    }
                    //---------------------------------------------------------------------------
                    if (class3.equals("Knight") && (strength3 >= 7) && (strength3 <= 10)){
                        if (toughness3 <= 6 && intelligence3 <=6 && magic3 <= 6 && influence3 <=6 ){
                            if (strength3 + toughness3 + intelligence3 + magic3 + influence3 >= 8 && strength3 + toughness3 + intelligence3 + magic3 + influence3 <= 28 ){
                            }
                        }
                    }
                    else if (class3.equals("Peasant") && (toughness3 >= 7) && (toughness3 <= 10)){
                        if (strength3 <= 6 && intelligence3 <=6 && magic3 <= 6 && influence3 <=6 ){
                            if (strength3 + toughness3 + intelligence3 + magic3 + influence3 >= 8 && strength3 + toughness3 + intelligence3 + magic3 + influence3 <= 28 ){
                            }
                        }
                    }

                    else if (class3.equals("Cleric") && (intelligence3 >= 7) && (intelligence3 <= 10)){
                        if (toughness3 <= 6 && strength3 <=6 && magic3 <= 6 && influence3 <=6 ){
                            if (strength3 + toughness3 + intelligence3 + magic3 + influence3 >= 8 && strength3 + toughness3 + intelligence3 + magic3 + influence3 <= 28 ){
                            }
                        }
                    }
                    else if (class3.equals("Mage") && (magic3 >= 7) && (magic3 <= 10)){
                        if (toughness3 <= 6 && intelligence3 <=6 && strength3 <= 6 && influence3 <=6 ){
                            if (strength3 + toughness3 + intelligence3 + magic3 + influence3 >= 8 && strength3 + toughness3 + intelligence3 + magic3 + influence3 <= 28 ){
                            }
                        }
                    }
                    else if (class3.equals("Courtier") && (influence3 >= 7) && (influence3 <= 10)){
                        if (toughness3 <= 6 && intelligence3 <=6 && magic3 <= 6 && strength3 <=6 ){
                            if (strength3 + toughness3 + intelligence3 + magic3 + influence3 >= 8 && strength3 + toughness3 + intelligence3 + magic3 + influence3 <= 28 ){
                            }
                        }
                    }
                    //---------------------------------------------------------------------------
                    if (class4.equals("Knight") && (strength4 >= 7) && (strength4 <= 10)){
                        if (toughness4 <= 6 && intelligence4 <=6 && magic4 <= 6 && influence4 <=6 ){
                            if (strength4 + toughness4 + intelligence4 + magic4 + influence4 >= 8 && strength4 + toughness4 + intelligence4 + magic4 + influence4 <= 28 ){
                            }
                        }
                    }
                    else if (class4.equals("Peasant") && (toughness4 >= 7) && (toughness4 <= 10)){
                        if (strength4 <= 6 && intelligence4 <=6 && magic4 <= 6 && influence4 <=6 ){
                            if (strength4 + toughness4 + intelligence4 + magic4 + influence4 >= 8 && strength4 + toughness4 + intelligence4 + magic4 + influence4 <= 28 ){
                            }
                        }
                    }

                    else if (class4.equals("Cleric") && (intelligence4 >= 7) && (intelligence4 <= 10)){
                        if (toughness4 <= 6 && strength4 <=6 && magic4 <= 6 && influence4 <=6 ){
                            if (strength4 + toughness4 + intelligence4 + magic4 + influence4 >= 8 && strength4 + toughness4 + intelligence4 + magic4 + influence4 <= 28 ){
                            }
                        }
                    }
                    else if (class4.equals("Mage") && (magic4 >= 7) && (magic4 <= 10)){
                        if (toughness4 <= 6 && intelligence4 <=6 && strength4 <= 6 && influence4 <=6 ){
                            if (strength4 + toughness4 + intelligence4 + magic4 + influence4 >= 8 && strength4 + toughness4 + intelligence4 + magic4 + influence4 <= 28 ){
                            }
                        }
                    }
                    else if (class4.equals("Courtier") && (influence4 >= 7) && (influence4 <= 10)){
                        if (toughness4 <= 6 && intelligence4 <=6 && magic4 <= 6 && strength4 <=6 ){
                            if (strength4 + toughness4 + intelligence4 + magic4 + influence4 >= 8 && strength4 + toughness4 + intelligence4 + magic4 + influence4 <= 28 ){
                            }
                        }
                    }
                }
            }
            if (decision == 3 ){
                System.out.println("What is the name of the character you what to randomize?");
                scanner.nextLine();
                rerollName = scanner.nextLine();

                if (rerollName == name1){
                    strength1 = rand.nextInt(upperbound);
                    if (strength1 >= 7 && strength1 <= 10){
                        class1 = "Knight";
                        toughness1 = rand.nextInt(upperbound2);
                        intelligence1 = rand.nextInt(upperbound2);
                        magic1 = rand.nextInt(upperbound2);
                        influence1 = rand.nextInt(upperbound2);
                    }
                    else if (strength1 <= 6){
                        toughness1 = rand.nextInt(upperbound);
                        if (toughness1 >= 7 && toughness1 <= 10){
                            class1 = "Peasant";
                            intelligence1 = rand.nextInt(upperbound2);
                            magic1 = rand.nextInt(upperbound2);
                            influence1 = rand.nextInt(upperbound2);
                        }
                        else if (toughness1 <= 6){
                            intelligence1 = rand.nextInt(upperbound);
                            if (intelligence1 >= 7 && intelligence1 <= 10){
                                class1 = "Cleric";
                                magic1 = rand.nextInt(upperbound2);
                                influence1 = rand.nextInt(upperbound2);
                            }
                            else if (intelligence1 <= 6){
                                magic1 = rand.nextInt(upperbound);
                                if (magic1 >= 7 && magic1 <= 10){
                                    class1 = "Mage";
                                    influence1 = rand.nextInt(upperbound2);
                                }
                                else if (magic1 <= 6){
                                    class1 = "Courtier";
                                    influence1 = rand.nextInt(upperbound-lowerbound) + lowerbound;
                                }
                            }
                        }
                    }
                    else if (rerollName == name2){
                        strength2 = rand.nextInt(upperbound);
                        if (strength2 >= 7 && strength2 <= 10){
                            class2 = "Knight";
                            toughness2 = rand.nextInt(upperbound2);
                            intelligence2 = rand.nextInt(upperbound2);
                            magic2 = rand.nextInt(upperbound2);
                            influence2 = rand.nextInt(upperbound2);
                        }
                        else if (strength2 <= 6){
                            toughness2 = rand.nextInt(upperbound);
                            if (toughness2 >= 7 && toughness2 <= 10){
                                class2 = "Peasant";
                                intelligence2 = rand.nextInt(upperbound2);
                                magic2 = rand.nextInt(upperbound2);
                                influence2 = rand.nextInt(upperbound2);
                            }
                            else if (toughness2 <= 6){
                                intelligence2 = rand.nextInt(upperbound);
                                if (intelligence2 >= 7 && intelligence2 <= 10){
                                    class2 = "Cleric";
                                    magic2 = rand.nextInt(upperbound2);
                                    influence2 = rand.nextInt(upperbound2);
                                }
                                else if (intelligence2 <= 6){
                                    magic2 = rand.nextInt(upperbound);
                                    if (magic2 >= 7 && magic1 <= 10){
                                        class2 = "Mage";
                                        influence2 = rand.nextInt(upperbound2);
                                    }
                                    else if (magic2 <= 6){
                                        class2 = "Courtier";
                                        influence2 = rand.nextInt(upperbound-lowerbound) + lowerbound;
                                    }
                                }
                            }
                        }
                        if (rerollName == name3){
                            strength3 = rand.nextInt(upperbound);
                            if (strength3 >= 7 && strength3 <= 10){
                                class3 = "Knight";
                                toughness3 = rand.nextInt(upperbound2);
                                intelligence3 = rand.nextInt(upperbound2);
                                magic3 = rand.nextInt(upperbound2);
                                influence3 = rand.nextInt(upperbound2);
                            }
                            else if (strength3 <= 6){
                                toughness3 = rand.nextInt(upperbound);
                                if (toughness3 >= 7 && toughness3 <= 10){
                                    class3 = "Peasant";
                                    intelligence3 = rand.nextInt(upperbound2);
                                    magic3 = rand.nextInt(upperbound2);
                                    influence3 = rand.nextInt(upperbound2);
                                }
                                else if (toughness3 <= 6){
                                    intelligence3 = rand.nextInt(upperbound);
                                    if (intelligence3 >= 7 && intelligence3 <= 10){
                                        class3 = "Cleric";
                                        magic3 = rand.nextInt(upperbound2);
                                        influence3 = rand.nextInt(upperbound2);
                                    }
                                    else if (intelligence3 <= 6){
                                        magic3 = rand.nextInt(upperbound);
                                        if (magic3 >= 7 && magic3 <= 10){
                                            class3 = "Mage";
                                            influence3 = rand.nextInt(upperbound2);
                                        }
                                        else if (magic3 <= 6){
                                            class3 = "Courtier";
                                            influence3 = rand.nextInt(upperbound-lowerbound)+lowerbound;
                                        }
                                    }
                                }
                            }
                        }
                        if (rerollName == name4){
                            strength4 = rand.nextInt(upperbound);
                            if (strength4 >= 7 && strength4 <= 10){
                                class4 = "Knight";
                                toughness4 = rand.nextInt(upperbound2);
                                intelligence4 = rand.nextInt(upperbound2);
                                magic4 = rand.nextInt(upperbound2);
                                influence4 = rand.nextInt(upperbound2);
                            }
                            else if (strength4 <= 6){
                                toughness4 = rand.nextInt(upperbound);
                                if (toughness4 >= 7 && toughness4 <= 10){
                                    class4 = "Peasant";
                                    intelligence4 = rand.nextInt(upperbound2);
                                    magic4 = rand.nextInt(upperbound2);
                                    influence4 = rand.nextInt(upperbound2);
                                }
                                else if (toughness4 <= 6){
                                    intelligence4 = rand.nextInt(upperbound);
                                    if (intelligence4 >= 7 && intelligence4 <= 10){
                                        class4 = "Cleric";
                                        magic4 = rand.nextInt(upperbound2);
                                        influence4 = rand.nextInt(upperbound2);
                                    }
                                    else if (intelligence4 <= 6){
                                        magic4 = rand.nextInt(upperbound);
                                        if (magic4 >= 7 && magic4 <= 10){
                                            class4 = "Mage";
                                            influence4 = rand.nextInt(upperbound2);
                                        }
                                        else if (magic4 <= 6){
                                            class4 = "Courtier";
                                            influence4 = rand.nextInt(upperbound-lowerbound)+lowerbound;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        

            if (decision == 4){
                i = i +1;
                decision = 0;
            }
        }
    }    
}