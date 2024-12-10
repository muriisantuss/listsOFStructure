public class EDQueueMerged {
  public EDQueue merge(EDQueue queue1, EDQueue queue2) {
      EDQueue mergedQueue = new EDQueue();

      while (!queue1.empty() || !queue2.empty()) {
          if (!queue1.empty()) {
              mergedQueue.enqueue(queue1.dequeue());
          }
          if (!queue2.empty()) {
              mergedQueue.enqueue(queue2.dequeue());
          }
      }

      return mergedQueue;
  }
}
