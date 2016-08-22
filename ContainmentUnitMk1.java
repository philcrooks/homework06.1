public class ContainmentUnitMk1 extends ContainmentUnit {

  public ContainmentUnitMk1(String name) {
    super(name);
    generation = "Mark I";
  }

  public boolean hasReachedCapacity() {
    // No-one knows what the capaciity of the Mk1 unit i.
    return false;
  }
}