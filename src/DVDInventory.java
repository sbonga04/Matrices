public class DVDInventory {
    String name;
    int year;
    String description;

    DVDInventory(String name, int year,String description){
        this.name = name;
        this.year = year;
        this.description = description;
    }

    public String toString(){
        return "movie name:" + this.name + ",Year: " + this.year + ", Description: "+this.description;
    }


    public static void main(String[] args) {
        DVDInventory Avangers = new DVDInventory("The Avangers", 2012, "Joss Webson");
        DVDInventory Incredibles = new DVDInventory("The incredibes",2004, "Brad Bird");

        DVDInventory[] Movies = new DVDInventory[15];
        Movies[7] = Avangers;
        Movies[9] = Incredibles;

        System.out.println(Movies[7]);
        System.out.println(Movies[9]);
        System.out.println(Movies[8]);

    }
}
