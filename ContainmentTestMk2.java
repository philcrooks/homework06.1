import static org.junit.Assert.assertEquals;
import org.junit.*;

public class ContainmentTestMk2 {
  public ContainmentUnitMk2 ges;
  public Ghost ghost = new Class7("Gozer");

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

  // @Test
  // public void addOneGhostNoPower() {
  //   ges.addGhost(ghost);
  //   assertEquals(0, ges.numberOfGhosts());  
  // }

  // @Test
  // public void addOneGhostWithPower() {
  //   ges.powerOn();
  //   ges.addGhost(ghost);
  //   assertEquals(1, ges.numberOfGhosts());  
  // }

  @Test
  public void addTenGhostsWithPower() {
    ges.powerOn();
    for (int i = 0; i < 10; i++) ges.addGhost(ghost);
    assertEquals(5, ges.numberOfGhosts());  
  }

  // @Test
  // public void removePower() {
  //   ges.powerOn();
  //   ges.addGhost(ghost);
  //   assertEquals(1, ges.numberOfGhosts()); 
  //   ges.powerOff();
  //   assertEquals(0, ges.numberOfGhosts()); 
  // }

  @Test
  public void exportGhosts1() {
    Class6 zuul = new Class6("Zuul");
    Class7 stayPuft = new Class7("Stay Puft Marshmallow Man");
    ges.powerOn();
    ges.addGhost(ghost);
    ges.addGhost(zuul);
    ges.addGhost(stayPuft);
    Ghost[] ghosts = new Ghost[ges.numberOfGhosts()];
    ghosts = ges.export(ghosts);
    assertEquals(3, ghosts.length);
  }

  @Test
  public void exportGhosts2() {
    Class6 zuul = new Class6("Zuul");
    Class7 stayPuft = new Class7("Stay Puft Marshmallow Man");
    ges.powerOn();
    ges.addGhost(ghost);
    ges.addGhost(zuul);
    Ghost[] ghosts = new Ghost[ges.numberOfGhosts()];
    ghosts = ges.export(ghosts);
    assertEquals(ghosts[0].name, "Zuul");
  }
}