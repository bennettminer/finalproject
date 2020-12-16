import java.util.Random;

public class Character{
    Random rand = new Random();
    int upperbound = 10;
    int lowerbound = 7;
    int upperbound2 = 6;
    String name = "";
    String type = "";
    int strength = 0;
    int toughness = 0;
    int intelligence = 0;
    int magic = 0;
    int influence = 0;
    int statTotal = 0;

    public Character(String name){
        this.name = name;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setType(String type){
        this.type = type;
    }

    public void setStat(int stat){
        this.statTotal = stat;
    }

    public String getType(){
        return this.type;
    }

    public int getStats(){
        if (this.type.equals("Knight")){
            this.strength = rand.nextInt(upperbound - lowerbound) + lowerbound;
        }
        else{
            this.strength = rand.nextInt(upperbound2);
        }
        this.statTotal = this.strength + this.statTotal;


        if (this.type.equals("Peasant")){
            this.toughness = rand.nextInt(upperbound - lowerbound) + lowerbound;
        }
        else{
            this.toughness = rand.nextInt(upperbound2);
        }
        this.statTotal = this.toughness + this.statTotal;
        

        if (type.equals("Cleric")){
            this.intelligence = rand.nextInt(upperbound - lowerbound) + lowerbound;
        }
        else{
            this.intelligence = rand.nextInt(upperbound2);
        }
        this.statTotal = this.intelligence + this.statTotal;
        

        if (type.equals("Mage")){
            this.magic = rand.nextInt(upperbound - lowerbound) + lowerbound;
        }
        else{
            this.magic = rand.nextInt(upperbound2);
        }
        this.statTotal = this.magic + this.statTotal;

        if (type.equals("Courtier")){
            this.influence= rand.nextInt(upperbound - lowerbound) + lowerbound;
        }
        else{
            this.influence = rand.nextInt(upperbound2);
        }
        this.statTotal = this.influence + this.statTotal;

        return statTotal;
    }

    public int getStrength(){
        return this.strength;
    }

    public int getToughness(){
        return this.toughness;
    }

    public int getIntelligence(){
        return this.intelligence;
    }

    public int getMagic(){
        return this.magic;
    }

    public int getInfluence(){
        return this.influence;
    }

    public String getName(){
        return this.name;
    }
}