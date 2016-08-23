public class ContainmentUnitMk2 extends ContainmentUnit {
  private static final int CAPACITY = 5;

  public ContainmentUnitMk2(String name) {
    super(name);
    generation = "Mark II";
  }

  public Ghost[] export(Ghost[] ghosts) {
    // return ghosts.toArray(ghosts);
  }

  public boolean hasReachedCapacity() {
    // No-one knows what the capaciity of the Mk1 unit i.
    return numberOfGhosts() >= CAPACITY;
  }
}