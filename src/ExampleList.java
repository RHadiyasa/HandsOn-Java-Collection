import java.util.ArrayList;
import java.util.List;

public class ExampleList {
    /**
     * 02
     * List -> Interface
     * Method yang disediakan:
     * 1. get(int index) -> mengambil data pada list berdasarkan index collection
     * 2. set(int index, E element) -> mengubah data pada list, berdasarkan index tertentu
     * 'index' = urutan element pada list
     * 'E element' = data/element baru
     */
    public static void main(String[] args) {
        List<String> animals = new ArrayList<>();
        animals.add("Sapi");
        animals.add("Kambing");
        animals.add("Kucing");
        System.out.println(animals);

        // set untuk mengubah data berdasarkan index
        animals.set(0, "Ayam");
        System.out.println(animals);

        // get untuk mendapatkan data
        System.out.println("get Ayam: " + animals.get(0));
        System.out.println("get index Ayam: " + animals.indexOf("Ayam"));

        // get data
        System.out.println("get Kucing: " + animals.get(animals.indexOf("Kucing")));
    }
}
