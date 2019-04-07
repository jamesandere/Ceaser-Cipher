import org.junit.Test;
import static org.junit.Assert.*;

public class CaesarTest {
  @Test
  public void Caesar_testEncryption(){
    Caesar caesar = new Caesar();
    assertEquals("dbs", caesar.encrypt("car", 1)); 
  }
}
