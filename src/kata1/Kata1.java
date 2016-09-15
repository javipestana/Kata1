package kata1;

import java.util.Date;

public class Kata1 {

    public static void main(String[] args) {
        Person person = new Person("Javier", new Date(88,1,21));
        System.out.println(person.getName() + " tiene " + person.getAge() + " años ");
    }
    
}
