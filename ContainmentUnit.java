import java.util.*;

public abstract class ContainmentUnit {
  private String name;
  private ArrayList ghosts;
  private boolean poweredOn;
  protected String generation;

  public ContainmentUnit(String name) {
    this.name = name;
    poweredOn = false;
    ghosts = new ArrayList();
    generation = "";
  }

  public String getName() {
    return name + " " + generation;
  }

  public void powerOn() {
    poweredOn = true;
  }

  public void powerOff() {
    poweredOn = false;
    ghosts.clear();
  }

  public void addGhost(Ghost ghost) {
    if (poweredOn && !hasReachedCapacity()) ghosts.add(ghost);
  }

  public int numberOfGhosts() {
    return ghosts.size();
  }

  public abstract boolean hasReachedCapacity();
}