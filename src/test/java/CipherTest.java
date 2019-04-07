import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CipherTest {
@Test
  public void Cipher_testDecryption(){
  Cipher cipher = new Cipher();
  assertEquals("car", cipher.decrypt("dbs",1));
  }
}
