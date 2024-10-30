import java.beans.PropertyEditorManager;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class ExampleCollection {
    public static void main(String[] args) {
        /**
         * 03
         * Collection default method:
         * 1. size() -> Mengambil banyaknya element yang tersimpan di dalam collection
         * 2. isEmpty() -> Cek apakah terdapat element di dalam collection
         * 3. contains()
         * 4. add()
         * 5. remove()
         * 6. containsAll() -> cek apakah collection lain memiliki data yang sama untuk dibandingkan
         * 7. addAll() -> nembahkan semua element pada collection ke collection lain
         * 8. clear() -> menghapus semua element di dalam collection
         * */
        Collection<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        Collection<Integer> numbers2 = new ArrayList<>(Arrays.asList(6, 7, 8, 9, 10));
        Collection<Integer> numbers3 = new ArrayList<>(Arrays.asList(6, 7, 8));

        numbers.add(11);
        numbers.addAll(numbers2);
        System.out.println(numbers);

        numbers.retainAll(numbers2);
        System.out.println(numbers);

        Collection<String> names = new ArrayList<>(List.of("Name1", "Name2", "Name3")); // immutable -> tidak dapat diubah
        System.out.println(names);

        names.add("Name3");
        names.add("Name4");
        System.out.println(names);
        names.remove("Name2");
        System.out.println("Hapus Name2: " + names);

        System.out.println("size: " + names.size());
        System.out.println("isEmpty: " + names.isEmpty());
        System.out.println("contains: " + names.contains("Name2"));
        System.out.println("containsAll: " + numbers2.containsAll(numbers3));
        System.out.println("Names: " + names);
        names.clear();
        System.out.println("Clear Names: " + names);
    }
}
