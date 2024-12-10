public class EDStack {
  private ListaLinearDupla stack;

  public EDStack() {
      this.stack = new ListaLinearDupla();
  }

  public void push(Node node) {
      stack.append(node);
  }

  public Node pop() {
      return stack.pop();
  }

  public void show() {
      stack.show();
  }

  public boolean empty() {
      return this.stack.length() <= 0;
  }

  @Override
  public String toString() {
      return stack.toString();
  }

  public Node peek() {
      return stack.peek();
  }
}
