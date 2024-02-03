import java.util.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        var list = new LinkedList();
        list.addLast(20);
        list.addLast(30);
        list.addLast(40);
        list.addFirst(10);

        list.print();
        System.out.println(list.contains(3333));
        System.out.println(list.size());
        System.out.println(list.indexOf(20));

        System.out.println(Arrays.toString(list.toArray()));

        list.deleteLast();
        list.print();
    }
}