package uk.co.datadisk.list;

public class EmployeeSingleLinkedList {

  private EmployeeSingleNode head;
  private int size;

  public void addToFront(Employee employee){
    EmployeeSingleNode node = new EmployeeSingleNode(employee);
    node.setNext(head);
    head = node;
    size++;
  }

  public void printList(){
    EmployeeSingleNode current = head;
    System.out.print("HEAD -> ");
    while(current != null){
      System.out.println(current);
      System.out.print("     -> ");
      current = current.getNext();
    }
    System.out.println("null\n");
  }

  public int getSize() {
    return size;
  }

  public boolean isEmpty(){
    return head == null;
  }

  public EmployeeSingleNode removeFromFront() {
    if(isEmpty()){
      return null;
    }

    EmployeeSingleNode removedNode = head;
    head = head.getNext();

    size--;
    removedNode.setNext(null);
    return removedNode;
  }
}
