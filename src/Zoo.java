import java.util.List;

public class Zoo {

  public static void feed(List<? extends Zoo> list) {
    for (Object value : list) {
      System.out.println("Feeding birds");
    }
  }

  public static void acceptBird(List<? super FlyingBird> list, FlyingBird bird) {
    System.out.println("Accepting a bird to a section");
    list.add(new Eagle());
    list.add(new Swallow());
  }

  public static void registerBird(List <? super Bird> list, Bird newBird) {
    System.out.println("Adding a bird to the birds list");
    list.add(new Eagle());
    list.add(new Swallow());
    list.add(new Penguin());
    list.add(new Kiwi());
  }
}