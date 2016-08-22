import static org.junit.Assert.assertEquals;
import org.junit.*;

public class ContainmentTestMk2 {
  public ContainmentUnitMk2 ges;
  public Ghost ghost = new Ghost();

  @Before
  public void before() {
    ges = new ContainmentUnitMk2("Ghostbuster's Ecto-containment System");
  }

  @Test
  public void hasName() {
    assertEquals("Ghostbuster's Ecto-containment System Mark II", ges.getName());
  }

  @Test
  public void noGhosts() {
    assertEquals(0, ges.numberOfGhosts());
  }

  @Test
  public void addOneGhostNoPower() {
    ges.addGhost(ghost);
    assertEquals(0, ges.numberOfGhosts());  
  }

  @Test
  public void addOneGhostWithPower() {
    ges.powerOn();
    ges.addGhost(ghost);
    assertEquals(1, ges.numberOfGhosts());  
  }

  @Test
  public void addTenGhostsWithPower() {
    ges.powerOn();
    for (int i = 0; i < 10; i++) ges.addGhost(ghost);
    assertEquals(5, ges.numberOfGhosts());  
  }

  @Test
  public void removePower() {
    ges.powerOn();
    ges.addGhost(ghost);
    assertEquals(1, ges.numberOfGhosts()); 
    ges.powerOff();
    assertEquals(0, ges.numberOfGhosts()); 
  }
}