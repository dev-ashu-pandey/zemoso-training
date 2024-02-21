package SinglyLinked;


public class SList<T> {
        private Node<T> head = new Node<T>(null);

        public SListIterator<T> iterator() {
            return new SListIterator<T>(head);
        }

        private static class Node<T> {
            T data;
            Node<T> next;

            Node(T data) {
                this.data = data;
            }

            Node(T data, Node<T> next) {
                this.data = data;
                this.next = next;
            }
        }

        public static class SListIterator<T> {
            private Node<T> current;

            SListIterator(Node<T> head) {
                current = head;
            }

            public boolean hasNext() {
                return current.next != null;
            }

            public T next() {
                current = current.next;
                return current.data;
            }

            public void insert(T data) {
                current.next = new Node<T>(data, current.next);
                current = current.next;
            }

            public void remove() {
                current.next = current.next.next;
            }
        }

    public static void main(String[] args) {
        SList<String> strList=new SList<>();
        SListIterator<String> itr=strList.iterator();
        itr.insert("Welcome");
        itr.insert("To");
        itr.insert("Generic");
        itr.insert("List");
        itr = strList.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
        SList<Integer> integerSList=new SList<>();
        SListIterator<Integer> integerSListIterator=integerSList.iterator();
        integerSListIterator.insert(2);
        integerSListIterator.insert(4);
        integerSListIterator.insert(5);
        integerSListIterator=integerSList.iterator();
        while (integerSListIterator.hasNext()){
            System.out.println(integerSListIterator.next());
        }

        itr.insert("new");
        itr = strList.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
