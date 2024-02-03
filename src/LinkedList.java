public class LinkedList {

    private static class Node{
        private int value;
        private Node next;

        public Node(int value){
            this.value = value;
        }
    }

    private Node first;
    private Node last;

    public void addLast(int item){
        var node = new Node(item);
        if(first == null){
            first = node;
            last = node;
        }else {
            last.next = node;
            last = node;
        }
    }

    public void addFirst(int item){
        var node = new Node(item);

        if(first == null){
            first = node;
            last = node;
        }else{
            node.next = first;
            first = node;
        }

    }

    public void print(){
        Node current = first;
        while(current != null){
            System.out.println(current.value);
            current = current.next;
        }
    }

    public boolean contains(int value){
        Node current = first;
        boolean result = false;
        while (current != null){
            result = current.value == value;

            current = current.next;
        }
        return result;
    }

    public int size(){
        Node current = first;
        int size = 0;
        while(current != null){
            size++;
            current = current.next;
        }
        return size;
    }

    public int indexOf(int val){
        Node current = first;
        int idx = 0;
        int c = 0;
        while(current != null){
            if(current.value == val){
              idx = c;
            }else{
                idx = -1;
            }
            c ++;
            current = current.next;
        }
        return idx;
    }

    public int[] toArray(){
        int[] arr = new int[this.size()];
        Node current = first;
        int c = 0;
        while(current != null){
            arr[c] = current.value;
            c++;
            current = current.next;
        }

        return arr;
    }

    public boolean deleteFirst() {
        if (first == null) {
            return false; // Indicate that deletion did not occur
        } else {
            first = first.next;
            return true; // Indicate that deletion was successful
        }
    }

    public boolean deleteLast() {
        if(first == null){
            return false;
        } else if (first == last) {
            first = null;
            last = null;
            return true;
        } else {
            Node current = first;
            while(current.next != last){
                current = current.next;
            }

            current.next = null;
            last = current;
            return true;
        }
    }


}
