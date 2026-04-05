package task3;

public class Main {
    public static void main(String[] args) {
        MyCollection<String> collection = new MyArrayCollection<>();

        collection.add("Apple");
        collection.add("Banana");
        collection.add("Apple");

        System.out.println("Size: " + collection.size());
        System.out.println("Contains Banana: " + collection.contains("Banana"));

        for (String item : collection) {
            System.out.println(item);
        }

        collection.remove("Apple");
        System.out.println("Size after remove: " + collection.size());

        collection.clear();
        System.out.println("Is empty: " + collection.isEmpty());
    }
}
