public class EDStackMerged {
  private EDStack tempStack;
  private EDStack resultStack;

  public EDStack merge(EDStack stkl, EDStack stk2) {
      this.tempStack = new EDStack();
      this.resultStack = new EDStack();

      // Mesclando as duas pilhas em uma pilha temporária
      while (!stkl.empty() || !stk2.empty()) {
          if (!stk2.empty()) {
              tempStack.push(stk2.pop());
          }
          if (!stkl.empty()) {
              tempStack.push(stkl.pop());
          }
      }

      // Transferindo da pilha temporária para a pilha de resultados
      while (!tempStack.empty()) {
          resultStack.push(tempStack.pop());
      }

      return resultStack;
  }
}
