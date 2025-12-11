public class DeleteOperation {
    private Node head;

    public DeleteOperation() {
        this.head = null;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    public Node delete(int data) {
        if (head == null) return head;

        if (head.data == data) {
            head = head.next;
            return head;
        }

        Node current = head;
        while (current.next != null && current.next.data != data) {
            current = current.next;
        }

        if (current.next != null) {
            current.next = current.next.next;
        }
        return head;
    }

    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}