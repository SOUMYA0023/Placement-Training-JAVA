public class LinkedListCRUDDemo {
    public static void main(String[] args) {
        // Create operation
        CreateOperation createOp = new CreateOperation();
        createOp.insertAtEnd(10);
        createOp.insertAtEnd(20);
        createOp.insertAtEnd(30);
        System.out.println("List after inserting 10, 20, 30 at end:");
        createOp.display();

        createOp.insertAtBeginning(5);
        System.out.println("List after inserting 5 at beginning:");
        createOp.display();

        // For other operations, we need to access the head
        // In a real implementation, you might want to add a getter method
        // For now, we'll demonstrate each operation separately
        
        // Read operation
        ReadOperation readOp = new ReadOperation(createOp.getHead());
        System.out.println("Size of list: " + readOp.size());
        System.out.println("Searching for 20: " + readOp.search(20));
        System.out.println("Searching for 40: " + readOp.search(40));

        // Update operation
        UpdateOperation updateOp = new UpdateOperation(createOp.getHead());
        boolean updated = updateOp.update(20, 25);
        System.out.println("Updated 20 to 25: " + updated);
        System.out.println("List after update:");
        updateOp.display();

        // Delete operation
        DeleteOperation deleteOp = new DeleteOperation();
        deleteOp.setHead(createOp.getHead());
        deleteOp.delete(25);
        System.out.println("List after deleting 25:");
        deleteOp.display();

        deleteOp.delete(5);
        System.out.println("List after deleting 5:");
        deleteOp.display();
    }
}