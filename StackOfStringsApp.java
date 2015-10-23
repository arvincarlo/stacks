public class StackOfStringsApp {
  public static void main(String[] args) {
    StackOfStrings stack = new StackOfStrings();
    System.out.println("Initial Size = " + stack.size());
    System.out.println();
    System.out.println("Stacks Created:");
    System.out.println("************************");
      int i=1;
      stack.push(i++ + " One");
      stack.push(i++ + " Two");
      stack.push(i++ + " Three");
      stack.push(i++ + " Four");
      stack.push(i++ + " Five");
      stack.push(i++ + " Six");
      stack.push(i++ + " Seven");
      stack.push(i++ + " Eight");
      stack.push(i++ + " Nine");
      stack.push(i++ + " Ten");
      stack.displayStack();
    System.out.println();
    System.out.println("Stacks Removed:");
    System.out.println("************************");
    System.out.println(stack.pop());
    System.out.println(stack.pop());
    System.out.println(stack.pop());
    System.out.println(stack.pop());
    System.out.println();
    System.out.println("Stacks Remaining:");
    System.out.println("************************");
      stack.displayStack();
    System.out.println();
    System.out.println("New Size = " + stack.size());
  }  
}