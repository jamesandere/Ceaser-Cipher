public class Caesar {
  public static String alphabet = "abcdefghijklmnopqrstuvwxyz";
  public static String encrypt(String text, int move){
    text = text.toLowerCase();
    String encrypText = "";
    for(int i=0; i<text.length(); i++){
      int position = alphabet.indexOf(text.charAt(i));
      int value = (move + position)%26;
      char replaceValue = alphabet.charAt(value);
      encrypText+=replaceValue;
    }
    return encrypText;
  }
}
