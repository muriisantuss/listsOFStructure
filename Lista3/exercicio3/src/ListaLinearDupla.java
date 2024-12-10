public class ListaLinearDupla {
  private Node top;
  private Node bottom;
  private long size;

  public ListaLinearDupla() {
      this.top = null;
      this.bottom = null;
      this.size = 0;
  }

  public long length() {
      return this.size;
  }

  private void addSize() {
      this.size++;
  }

  private void decSize() {
      this.size--;
  }

  public boolean empty() {
      return (this.top == null && this.bottom == null);
  }

  public void insert(Node node) {
      if (this.empty()) {
          this.top = node;
          this.bottom = node;
      } else {
          Node aux2 = this.top;
          node.setNext(aux2);
          this.top = node;
          aux2.setPrev(this.top);
          this.addSize();
      }
  }

  public Node search(String id) {
      Node retNode = this.top;
      while (retNode != null && !retNode.getId().equals(id)) {
          retNode = retNode.getNext();
      }
      return retNode;
  }

  public void append(Node node) {
      if (this.empty()) {
          this.top = node;
          this.bottom = node;
      } else {
          Node aux2 = this.bottom;
          node.setPrev(aux2);
          this.bottom = node;
          aux2.setNext(this.bottom);
          this.addSize();
      }
  }

  public Node remove() {
      if (this.empty()) {
          return null;
      }
      Node aux = this.top;
      this.top = aux.getNext();
      if (this.top != null) {
          this.top.setPrev(null);
      } else {
          this.bottom = null;
      }
      aux.setNext(null);
      this.decSize();
      return aux;
  }

  public void insertPosN(long pos, Node node) {
      if (this.empty() && pos != 1) {
          return; // Exceção ou erro
      }
      if (pos > this.size + 1) {
          return;
      }
      if (pos == 1) {
          this.insert(node);
          return;
      }
      Node nodePrev = this.searchPos(pos - 1);
      Node nodePos = nodePrev.getNext();
      node.setNext(nodePos);
      if (nodePos != null) {
          nodePos.setPrev(node);
      }
      nodePrev.setNext(node);
      node.setPrev(nodePrev);
      this.addSize();
  }

  private void insertInOrd(Node node) {
      if (empty()) {
          this.insert(node);
          return;
      }
      Node aux = this.top;
      while (aux != null && aux.getId().compareTo(node.getId()) < 0) {
          aux = aux.getNext();
      }
      if (aux == null) {
          this.append(node);
      } else {
          node.setNext(aux);
          node.setPrev(aux.getPrev());
          if (aux.getPrev() != null) {
              aux.getPrev().setNext(node);
          } else {
              this.top = node;
          }
          aux.setPrev(node);
          this.addSize();
      }
  }

  public Node pop() {
      if (this.empty()) {
          return null;
      }
      Node aux = this.bottom;
      this.bottom = aux.getPrev();
      if (this.bottom != null) {
          this.bottom.setNext(null);
      } else {
          this.top = null;
      }
      aux.setPrev(null);
      this.decSize();
      return aux;
  }

  public Node peek() {
      if (this.empty()) {
          return null;
      }
      return this.bottom;
  }

  private Node searchPos(long position) {
      if (this.empty() || position > this.size) {
          return null;
      }
      Node aux = this.top;
      for (int indx = 1; position != indx && aux != null; indx++) {
          aux = aux.getNext();
      }
      return aux;
  }

  public Object[] invArray() {
      Object[] array = new Object[(int) this.size];
      Node aux = this.bottom;
      for (int i = 0; aux != null; i++) {
          array[i] = aux.getValue();
          aux = aux.getPrev();
      }
      return array;
  }

  public ListaLinearDupla sort(boolean criteria) {
      if (empty()) {
          return null;
      }
      ListaLinearDupla lld = new ListaLinearDupla();
      Node aux = this.top;
      while (aux != null) {
          Node node = new Node();
          node.setValue(aux.getValue());
          lld.insertInOrd(node);
      }
      if (criteria) {
          return lld;
      } else {
          ListaLinearDupla lld2 = new ListaLinearDupla();
          while (!lld.empty()) {
              lld2.insert(lld.pop());
          }
          return lld2;
      }
  }

  public void show() {
      Node aux = this.top;
      while (aux != null) {
          System.out.print(aux.getValue().toString() + " ");
          aux = aux.getNext();
      }
      System.out.println();
  }

  public String toString() {
      Node aux = this.top;
      StringBuilder sb = new StringBuilder();
      while (aux != null) {
          int i = (int) aux.getValue();
          sb.append((char) i);
          aux = aux.getNext();
      }
      return sb.toString();
  }
}
