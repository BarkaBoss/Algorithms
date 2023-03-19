public class LinkedList {
    Node head;

    static class Node{
        int data;
        Node next;

        Node(int d){
            this.data = d;
            next = null;
        }
    }

    void printItems(){
        Node node = head;
        while (node != null){
            if (node.data%2 == 1){
                System.out.println("Strange");
            }
            System.out.println(node.data+" ");
            node = node.next;
        }
    }

    public static void main(String[] args) {
        LinkedList lList = new LinkedList();
        lList.head = new Node(4);
        Node second = new Node(6);
        Node third = new Node(7);
        Node fourth = new Node(10);

        lList.head.next = second;
        second.next = third;
        third.next = fourth;

        lList.printItems();
    }
}
