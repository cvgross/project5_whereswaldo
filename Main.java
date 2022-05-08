class Main {
  public static void main(String[] args) {
    TouristLinkedList t = new TouristLinkedList();
    t.addFirst("Waldo", 12345, "Prague");
    System.out.println(t.head);
    t.addFirst("David", 613, "Jerusalem");
    System.out.println(t.head);
    t.addFirst("Luigi", 5555, "Rome");
    System.out.println(t.head);

    System.out.println(t.findNode("Waldo"));
    System.out.println(t.findNode("David"));
    System.out.println(t.findNode("Luigi"));
    System.out.println(t.findNode("Chaya"));
  }
}