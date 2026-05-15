public class DVD_Collection {

    public static void main(String[] args) {

        DVDInventory[] Movies = new DVDInventory[15];

        DVDInventory Avangers = new DVDInventory("The Avangers", 2012, "Joss Webson");
        DVDInventory Incredibles = new DVDInventory("The incredibes",2004, "Brad Bird");

        Movies[7] = Avangers;
        Movies[10] = Incredibles;

        System.out.println(Movies[10]);
        //System.out.println(Movies[7]);





    }
}
