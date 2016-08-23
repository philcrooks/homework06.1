import static org.junit.Assert.assertEquals;
import org.junit.*;

public class ContainmentTestMk1 {
  public ContainmentUnitMk1 ges;
  public Ghost ghost = new Class7("Gozer");

  @Before
  public void before() {
    ges = new ContainmentUnitMk1("Ghostbuster's Ecto-containment System");
  }

  @Test
  public void hasName() {
    assertEquals("Ghostbuster's Ecto-containment System Mark I", ges.getName());
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
    assertEquals(10, ges.numberOfGhosts());  
  }

  @Test
  public void removePower() {
    ges.powerOn();
    ges.addGhost(ghost);
    assertEquals(1, ges.numberOfGhosts()); 
    ges.powerOff();
    assertEquals(0, ges.numberOfGhosts()); 
  }

  @Test
  public void addDifferentTypesOfGhost() {
    Ghost zuul = new Class6("Zuul");
    Ghost stayPuft = new Class7("Stay Puft Marshmallow Man");
    ges.powerOn();
    ges.addGhost(ghost);
    ges.addGhost(zuul);
    ges.addGhost(stayPuft);
    assertEquals(3, ges.numberOfGhosts());
  }

  @Test
  public void exportGhosts1() {
    Class6 zuul = new Class6("Zuul");
    Class7 stayPuft = new Class7("Stay Puft Marshmallow Man");
    ges.powerOn();
    ges.addGhost(ghost);
    ges.addGhost(zuul);
    ges.addGhost(stayPuft);
    Ghost[] ghosts = ges.export();
    assertEquals(3, ghosts.length);
  }

  @Test
  public void exportGhosts2() {
    Class6 zuul = new Class6("Zuul");
    Class7 stayPuft = new Class7("Stay Puft Marshmallow Man");
    ges.powerOn();
    ges.addGhost(ghost);
    ges.addGhost(zuul);
    ges.addGhost(stayPuft);
    Ghost[] ghosts = ges.export();
    assertEquals(ghosts[1].name, "Zuul");
  }
}