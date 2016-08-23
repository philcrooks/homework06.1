public class ContainmentUnitMk1 extends ContainmentUnit {

  public ContainmentUnitMk1(String name) {
    super(name);
    generation = "Mark I";
  }

  public Ghost[] export() {
    Ghost[] ghostsArray = new Ghost[numberOfGhosts()];
    for (int i = 0; i < ghostsArray.length; i++) ghostsArray[i] = ghosts.get(i);
    return ghostsArray;
  }

  public boolean hasReachedCapacity() {
    // No-one knows what the capaciity of the Mk1 unit i.
    return false;
  }
}