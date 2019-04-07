public class Cipher {
  public static String alphabet = "abcdefghijklmnopqrstuvwxyz";
  public static String decrypt(String text, int move){
    text = text.toLowerCase();
    String decrypText = "";
    for(int i=0; i<text.length(); i++){
      int position = alphabet.indexOf(text.charAt(i));
      int value = (position - move)%26;
      char replaceValue = alphabet.charAt(value);
      decrypText += replaceValue;
    }
    return decrypText;
  }
}
