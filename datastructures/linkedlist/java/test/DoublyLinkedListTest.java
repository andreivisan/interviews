public class DoublyLinkedListTest {

    public static void main(String[] args) {
        DoublyLinkedList<Integer> dLinkedList = new DoublyLinkedList<Integer>();

        dLinkedList.addAtHead(2);
        dLinkedList.addAtHead(1);
        dLinkedList.addAtHead(0);
        dLinkedList.addAtTail(3);
        dLinkedList.addAtIndex(0, -1);
        dLinkedList.addAtIndex(5, 6);
        dLinkedList.addAtIndex(5, 5);

        dLinkedList.deleteAtIndex(6);

        dLinkedList.print();

        System.out.println("\nValue at index 2 is: " + dLinkedList.get(2));
        System.out.println("List size is: " + dLinkedList.size());
    }

}
