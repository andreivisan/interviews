public class DoublyLinkedListTest {

    public static void main(String[] args) {
        DoublyLinkedList<Integer> dLinkedList = new DoublyLinkedList<Integer>();

        dLinkedList.addAtHead(2);
        dLinkedList.addAtHead(1);
        dLinkedList.addAtHead(0);

        dLinkedList.print();
    }

}
