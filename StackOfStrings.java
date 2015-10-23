public class StackOfStrings {
  private final int SIZE_LIMIT = 10;
  private String[] names = new String[this.SIZE_LIMIT];
  private int counter = 0;
  public StackOfStrings() {
    System.out.println("Created a Stack Data Structure.");
  }
  public void push(String name) {
    if (this.isFull()) {
      System.out.println("This stack is already full.");
    } else {
      this.names[this.counter] = name;
      this.counter++;
    }
  }
  public String pop() {
    if (this.isEmpty()) {
      System.out.println("Empty Stack.");
      return "EMPTY";
    } else {
      String name = this.names[this.counter-1];
      this.names[this.counter-1] = null;
      this.counter--;
      return name;      
    }
  }
  private boolean isEmpty() {
    if (this.counter == 0) {
      return true;
    } else {
      return false;
    }
  }
  private boolean isFull() {
    if (this.SIZE_LIMIT == this.counter) {
      return true;
    } else {
      return false;
    }
  }
  public void displayStack() {
    for (int i = 0; i < this.SIZE_LIMIT; i++) {
      System.out.println(this.names[i]);
    }
  }
  public int size() {
    return this.counter;
  }
}