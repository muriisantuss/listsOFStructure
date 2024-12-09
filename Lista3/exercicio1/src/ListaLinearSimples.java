public class ListaLinearSimples {
  private Node top;
  private Node bottom;
  private long size;

  public ListaLinearSimples() {
      this.top = null;
      this.bottom = null;
      this.size = 0;
  }

  public boolean empty() {
      return (this.top == null && this.bottom == null);
  }

  private Node searchPos(long position) {
      if (this.empty() || position > this.length()) {
          return null;
      }
      Node temp = this.top;
      for (int a = 1; position != a && temp != null; a++) {
          temp = temp.getNext();
      }
      return temp;
  }

  public void add(Node node) {
      if (this.empty()) {
          this.top = this.bottom = node;
      } else {
          Node temp = this.top;
          this.top = node;
          this.top.setNext(temp);
      }
      this.addSize();
  }

  public void append(Node node) {
      if (this.empty()) {
          this.top = this.bottom = node;
      } else {
          Node temp = this.bottom;
          this.bottom = node;
          temp.setNext(node);
      }
      this.addSize();
  }

  public Node remove() {
      Node returnNode = null;
      Node temp = null;
      if (this.empty()) {
          return null;
      }
      if (this.length() <= 1) {
          returnNode = this.top;
          this.top = this.bottom = null;
      } else {
          returnNode = this.top;
          temp = returnNode.getNext();
          returnNode.setNext(null);
          this.top = temp;
      }
      this.decSize();
      return returnNode;
  }

  public Node pop() {
      Node resultNode = null;
      Node temp = null;
      if (this.empty()) {
          return null;
      }
      if (this.length() <= 1) {
          resultNode = this.top;
          this.top = this.bottom = null;
      } else {
          resultNode = this.bottom;
          temp = this.searchPos(this.length() - 1);
          temp.setNext(null);
          this.bottom = temp;
      }
      this.decSize();
      return resultNode;
  }

  public void clear() {
      while (!this.empty()) {
          this.pop();
      }
  }

  private void addSize() {
      this.size++;
  }

  private void decSize() {
      this.size--;
  }

  public long length() {
      return this.size;
  }

  public void show() {
      Node temp = this.top;
      while (temp != null) {
          System.out.print(temp.getValue() + " ");
          temp = temp.getNext();
      }
      System.out.println(this.length() + " ");
  }
}
