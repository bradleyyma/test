import edu.colorado.caterpillars.Ship;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ShipTest{
    @Test
    public void testName(){
        assertEquals(1, 1);
    }

    @Test
    public void testShipName(){
        Ship ship1 = new Ship();
        ship1.setName("Battleship");
        assertEquals("Minesweeper", ship1.getName());
    }
}
