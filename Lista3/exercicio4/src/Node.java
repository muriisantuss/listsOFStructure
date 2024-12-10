public class Node {
  private String id;
  private Object value;
  private Node next;
  private Node prev;

  // Construtor padrão
  public Node() {
      this.id = "";
      this.next = null;
      this.prev = null;
      this.value = null;
  }

  // Construtor com parâmetros
  public Node(String id, Object value) {
      this.id = id;
      this.value = value;
      this.next = null;
      this.prev = null;
  }

  // Getters e setters
  public String getId() {
      return id;
  }

  public void setId(String id) {
      this.id = id;
  }

  public Node getPrev() {
      return prev;
  }

  public void setPrev(Node prev) {
      this.prev = prev;
  }

  public Object getValue() {
      return value;
  }

  public void setValue(Object value) {
      this.value = value;
  }

  public Node getNext() {
      return next;
  }

  public void setNext(Node next) {
      this.next = next;
  }
}
