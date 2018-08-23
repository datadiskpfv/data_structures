package uk.co.datadisk.stack;

import uk.co.datadisk.linkedlist.Employee;

public class Main_Stack_JDK {

  public static void main(String[] args) {

    // you can also use a deque which is backed by an array

    Employee paul = new Employee("Paul", "Valle", 1000);
    Employee lorraine = new Employee("Lorraine", "Valle", 1001);
    Employee dominic = new Employee("Dominic", "Valle", 1002);
    Employee jessica = new Employee("Jessica", "Valle", 1003);
    Employee will = new Employee("Will", "Hay", 1004);

    Employee graham = new Employee("Graham", "Moffett", 1005);

    ArrayStack_JDK stack= new ArrayStack_JDK();

    stack.push(paul);
    stack.push(lorraine);
    stack.push(dominic);
    stack.push(jessica);

    stack.printStack();

    System.out.println(stack.peek());

    System.out.println("Popped: " + stack.pop());
    System.out.println(stack.peek());

    stack.push(graham);
    System.out.println(stack.peek());

  }


}
