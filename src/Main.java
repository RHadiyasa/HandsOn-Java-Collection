import java.util.*;

public class Main {
    public static void main(String[] args) {
        /**
         * 01
         * Iterable adalah super class dari Collection Framework yang ada di Java
         * Iterable membuat object yang dapat di iterasi
         * */
        Iterable<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5)); // Arrays.asList -> array diubah menjadi List -> mutable (dapat dimanipulasi / diubah)
        Iterable<Integer> numbers2 = new ArrayList<>(List.of(6, 7, 8, 9, 10)); // List.of -> immutable (tidak dapat dimanipulasi)

        // Iterator adalah interface yang digunakan untuk melakukan iterasi
        Iterator<Integer> iteratorNumber = numbers.iterator();
        Iterator<Integer> iteratorNumber2 = numbers2.iterator();
        System.out.println(iteratorNumber); // mencetak hashcode dari object iterator
        System.out.println(iteratorNumber2); // mencetak hashcode dari object iterator

        /**
         * Iterator memiliki method bawaan:
         * 1. next()- > method untuk mengambil element selanjutnya
         * 2. hasNext() -> cek apakah terdapat data pada next();
         * 3. remove() -> method untuk menghapus element pada iterasi tertentu
         * */


        // menggunakan iterator mutable untuk memanipulasi data
        while (iteratorNumber.hasNext()) {
            Integer next = iteratorNumber.next();
            if (next == 4) {
                iteratorNumber.remove();
            }
        }

        while (iteratorNumber2.hasNext()) {
            Integer next = iteratorNumber2.next();
            if (next == 6) {
                iteratorNumber2.remove();
            }
        }

        // menggunakan foreach yang bersifat immutable
        System.out.print("Numbers   : ");
        for (Integer number : numbers) {
            System.out.print(number + " ");
        }

        System.out.println();

        System.out.print("Numbers2  : ");
        for (Integer number : numbers2) {
            System.out.print(number + " ");
        }
    }
}
