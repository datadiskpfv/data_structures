package uk.co.datadisk.stack;

import uk.co.datadisk.linkedlist.Employee;

import java.util.LinkedList;
import java.util.ListIterator;

public class ArrayStack_JDK {

  private LinkedList<Employee> stack;

  public ArrayStack_JDK() {
    this.stack = new LinkedList<>();
  }

  // We are going only expose pop, push, peek and isEmpty

  public void push(Employee employee){
    stack.push(employee);
  }

  public Employee pop(){
    return stack.pop();
  }

  public Employee peek(){
    return stack.peek();
  }

  public boolean isEmpty(){
    return stack.isEmpty();
  }

  public void printStack() {
    ListIterator<Employee> iterator = stack.listIterator();

    while(iterator.hasNext()){
      System.out.println(iterator.next());
    }
  }
}
