import java.util.Scanner;
import java.io.*;

public class createSave{
    public void createGame(){
        
        Scanner scanner = new Scanner(System.in);
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
        firstCharacter.setStat(0);
        secondCharacter.setStat(0);
        thirdCharacter.setStat(0);
        fourthCharacter.setStat(0);
        
        System.out.println("What is the name of your game?");
        game = scanner.nextLine();
        scanner.nextLine();
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
        System.out.println(firstCharacter.getType());

        System.out.println(firstCharacter.getStats());
        System.out.println(secondCharacter.getStats());
        System.out.println(thirdCharacter.getStats());
        System.out.println(fourthCharacter.getStats());

        int strength1 = firstCharacter.getStrength();
        int toughness1 = firstCharacter.getToughness();
        int intelligence1 = firstCharacter.getIntelligence();
        int magic1 = firstCharacter.getMagic();
        int influence1 = firstCharacter.getInfluence();
        int strength2 = firstCharacter.getStrength();
        int toughness2 = firstCharacter.getToughness();
        int intelligence2 = firstCharacter.getIntelligence();
        int magic2 = firstCharacter.getMagic();
        int influence2 = firstCharacter.getInfluence();
        int strength3 = firstCharacter.getStrength();
        int toughness3 = firstCharacter.getToughness();
        int intelligence3 = firstCharacter.getIntelligence();
        int magic3 = firstCharacter.getMagic();
        int influence3 = firstCharacter.getInfluence();
        int strength4 = firstCharacter.getStrength();
        int toughness4 = firstCharacter.getToughness();
        int intelligence4 = firstCharacter.getIntelligence();
        int magic4 = firstCharacter.getMagic();
        int influence4 = firstCharacter.getInfluence();

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
    }

