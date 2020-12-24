import java.util.LinkedList;
import java.util.List;

class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");

    List<Integer> list = new LinkedList();
    //list.add(new Integer(1));// deprecated
    list.add(Integer.valueOf(2)); // nowadays way

    OrderedPair<String, Integer> op = new OrderedPair<>("Item1", 2);
    System.out.println("op--> " + op.getKey());
    System.out.println("op--> " + op.getValue());



  }
}
