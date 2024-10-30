import com.enigma.gosling.list.Person;

import java.util.HashSet;
import java.util.Set;

public class Exampleset {
    public static void main(String[] args) {
        /**
         * 06
         * SET : Bisa menyimpan data tapi harus unique
         * Kita tidak tau urutan datanya, karena tidak ada index
         * */

        Set<String> animals = new HashSet<>();

        animals.add("Sapi");
        animals.add("Kambing");
        animals.add("Kucing");
        animals.add("Harimau");
        animals.add("Kuda");
        System.out.println(animals);
        System.out.println("-".repeat(40));

        Set<Integer> numbers = new HashSet<>(Set.of(1, 2, 3, 4, 5, 6));
        Set<Integer> numbers2 = Set.of(5, 6, 7, 8, 9); // tidak berurut

        System.out.println(numbers);
        System.out.println(numbers2);

        // set dengan menyimpan object bisa unique dengan melakukan override hashcode
        System.out.println("-".repeat(40));
        Set<Person> peoples = new HashSet<>();
        peoples.add(new Person("Rafi", 25));
        peoples.add(new Person("Rahma", 20));
        System.out.println(peoples);

        for (Person people : peoples) {
            System.out.println(people.getName() + ", Usia: " + people.getAge());
        }
    }
}
