public class Person {
    private int birthDate;
    String name;
    String homeAdress;
    int postcode;
    String postort;


    public Person(int birthDate){
        this.birthDate = birthDate;
    }

    public String getName(){
        return this.name;
    }
    public String changeAdress(String homeAdress){
        this.homeAdress = homeAdress;
        return this.homeAdress;
    }


}
