class TouristLinkedList
{
  class Node
  {
    String tourist;
    int passport;
    String city;
    Node next;

    public Node(String trst, int psprt, String cty)
    {
      super();
      tourist = trst;
      passport = psprt;
      city = cty;
      next = null;
    }

    @Override
    public String toString()
    {
      return "Node [Name: " + tourist + ", Passport: " + passport + ", Destination: " + city + "]";
    } 
  }

  Node head;
  int size;
  
  public void addFirst(String touristName, int passportNumber, String destinationCity)
  {
    Node node = new Node(touristName, passportNumber, destinationCity);
    node.next = head;
    head = node;
    size++;
  }

  public int size()
  {
    return size;
  }

  public String findNode(String tourist) 
  {
    Node current = head;

    while (current != null) 
    {
      if (current.tourist.equals(tourist)) 
      {
        return current.city;
      } 
      else 
      {
        current = current.next;
      }
    }
    return "";
  }
}