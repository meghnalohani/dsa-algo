import java.util.*;

public class Main {
    public static Set<String> wordDict = new HashSet<>();
    public static void main(String[] args) {
      String temp_dictionary[] = {"cats","and","dogs"};
      for(String s: temp_dictionary){
        wordDict.add(s);
      }
      System.out.println(wordBreak("catsandogs"));
  }
  public static boolean wordBreak(String word){
    int wordlen = word.length();
    if(wordlen == 0)
     return true;
    for(int i=1;i<=wordlen;i++){
      if(wordDict.contains(word.substring(0,i)) && wordBreak(word.substring(i)))
      return true;
    }
    return false;
  }
}
