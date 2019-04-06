import org.junit.Test;
import static org.junit.Assert.*;

public class CaesarTest {
  @Test
  public void Caeser_testEncryption(){
    Caesar caesar = new Caesar();
    assertEquals("car", caesar.encrypt("dbs", 1));
  }
}
