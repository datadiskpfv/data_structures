package uk.co.datadisk.list;

public class EmployeeDoubleLinkedList {

  private EmployeeDoubleNode head;
  private EmployeeDoubleNode tail;
  private int size;

  public void addToFront(Employee employee){
    EmployeeDoubleNode node = new EmployeeDoubleNode(employee);
    node.setNext(head);

    if(head == null){
      tail = node;
    } else {
      head.setPrevious(node);
    }

    head = node;
    size++;
  }

  public void addToEnd(Employee employee){
    EmployeeDoubleNode node = new EmployeeDoubleNode(employee);

    if(tail == null){
      head = node;
    } else {
      tail.setNext(node);
      node.setPrevious(tail);
    }

    tail = node;
    size++;
  }

  public void printList(){
    EmployeeDoubleNode current = head;
    System.out.print("HEAD -> ");
    while(current != null){
      System.out.println(current);
      System.out.print("     <=> ");
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

  public EmployeeDoubleNode removeFromFront() {
    if(isEmpty()){
      return null;
    }

    EmployeeDoubleNode removedNode = head;
    head = head.getNext();

    size--;
    removedNode.setNext(null);
    return removedNode;
  }
}
