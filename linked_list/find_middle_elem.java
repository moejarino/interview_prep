class Program {
    // This is an input class. Do not edit.
    public static class LinkedList {
        int value;
        LinkedList next;

        LinkedList(int value) {
          this.value = value;
          this.next = null;
        }
    }

    public static LinkedList findMiddle(LinkedList headOne) {
