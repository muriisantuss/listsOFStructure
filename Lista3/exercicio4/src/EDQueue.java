public class EDQueue {
  private ListaLinearDupla queue;

  public EDQueue() {
      this.queue = new ListaLinearDupla();
  }

  /**
   * Adicionar elementos ao final da lista
   * @param node o nó a ser adicionado
   */
  public void add(Node node) {
      queue.append(node);
  }

  /**
   * Remover elementos do início da lista
   * @return o nó removido
   */
  public Node remove() {
      return queue.remove();
  }

  /**
   * Enfileira um elemento (igual a add)
   * @param node o nó a ser enfileirado
   */
  public void enqueue(Node node) {
      this.add(node);
  }

  /**
   * Desenfileira um elemento (igual a remove)
   * @return o nó desenfileirado
   */
  public Node dequeue() {
      return this.remove();
  }

  /**
   * Consulta o primeiro elemento da fila
   * @return o nó no início da fila
   */
  public Node peek() {
      return queue.peekTop(); // Método peekTop deve ser implementado em ListaLinearDupla
  }

  /**
   * Exibe os elementos da fila
   */
  public void show() {
      queue.show();
  }

  /**
   * Verifica se a fila está vazia
   * @return true se a fila estiver vazia, caso contrário, false
   */
  public boolean empty() {
      return queue.empty();
  }

  @Override
  public String toString() {
      return queue.toString();
  }
}
