public class Caesar {
  public static String encrypt(){
    if(move>26){
      move = move%26;
    }
    else if(move<0){
      move =(move%26)+26;
    }
  }

}
