public class Main{
    public static void main(String[] args) {
        // Skapa en klass, Person. Vi ska hålla reda på personens
        // Födelsedatum
        // Namn
        // GatuAdress
        // PostNummer
        // Postort
        
        // Skapa en constructor! En person har alltid ett födelsedatum eller hur!
        // Allt det andra behöver den inte ha...kan sättas senare "i livet"
        
        // Gör properties - get??
        // Vilka funktioner:
        // - Namnge
        // - BytAdress
        
        // I main skapar du upp två personer. Du och en kompis. Sätt addresser för er två.
        // Skriv kod så att den ena flyttar in hos den andra!
         
        //----KÖR KOD------//

        Person person1 = new Person(19991013);

        person1.name = "Nicholas";
        person1.homeAdress = "Alphyddevägen 12";
        person1.postcode = 13135;
        person1.postort = "Nacka";


        Person person2 = new Person(20000229);

        person2.name = "Simone";
        person2.homeAdress = "Laduvägen 12";
        person2.postcode = 12345;
        person2.postort = "Stockholm";

        //Flytt//

        System.out.println("Innan flytt " + person2.homeAdress);
        
        person2.changeAdress("Alphyddevägen 12");

        System.out.println("Efter flytt " + person2.homeAdress);
    }


}