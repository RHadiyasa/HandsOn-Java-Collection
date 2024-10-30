import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ExampleMap {
    public static void main(String[] args) {
        /**
         * 05
         * HashMap
         * Key dari hashmap bersifat unique
         * Method:
         * 1. put(K key, V value) -> menyimpan data berdasarkan key dan value
         * K : key      -> identifier / key dari datanya
         * V : value    -> datanya
         *
         * 2. get(K key) -> mendapatkan data berdasarkan key
         * 3. replace(K key, V value) -> mengubah data berdasarkan key dan value baru
         * 4. size() -> mengambil banyaknya data yang disimpan di Map
         * 5. values() -> mengambil semua data yang ada di dalam Map, dan ditampilkan dalam bentuk collection Set<V>
         * 6. entrySet() -> membuat map menjadi collection, untuk mengambil data key dan value. Cocok untuk looping
         * */

        Map<String, String> countries = new HashMap<>();

        countries.put("ID", "DKI Jakarta");
        // countries.put("ID","East Java");
        countries.put("MY", "Kuala Lumpur");
        countries.put("US", "Washington DC");
        countries.put("SG", "Singapore");
        System.out.println(countries);

        for (Map.Entry<String, String> entry : countries.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        System.out.println("-".repeat(40));

        Map<String, List<String>> provinces = new HashMap<>();
        provinces.put("Indonesia", List.of("Jakarta", "Jawa Timur", "Jawa Barat", "Jawa Tengah"));
        System.out.println(provinces);
        for (Map.Entry<String, List<String>> province : provinces.entrySet()) {
            System.out.println(province.getKey() + ": " + province.getValue());
        }
    }
}
