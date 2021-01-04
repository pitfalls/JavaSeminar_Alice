public class Person {
    String forename;
    String surname;
    int age;
    int postcode;
    public Person(String theForename, String theSurname, int theAge, int thePostcode)
    {   forename = theForename;
        surname  = theSurname;
        age      = theAge;
        postcode = thePostcode;
    }

    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Person myself  = new Person("Elisabeth", "Schallerl", 27, 8010);
        Person Richard = new Person("Richi", "Schallerl", 27, 8530);
        Person Alex    = new Person("Alexander", "Frewein", 27, 8010);
        
        System.out.println(myself.forename); //wollte alles in einer Klammer schreiben, ging nicht. warum? zb so: System.out.println(myself.surname, myself.age, myself.postcode)
        System.out.println(Richard.forename);
        System.out.println(Alex.forename);
        System.out.println(myself.surname);
        System.out.println(Richard.surname);
        System.out.println(Alex.surname);
        System.out.println(myself.age);
        System.out.println(Richard.age);
        System.out.println(Alex.age);
        System.out.println(myself.postcode);
        System.out.println(Richard.postcode);
        System.out.println(Alex.postcode);

    }


}