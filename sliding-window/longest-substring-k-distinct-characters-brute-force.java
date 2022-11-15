import java.util.*;

public class Main {
    public static void main(String[] args) {
      String s = "aabacbebebe";
        int k = 3;
 
        // Function Call
        longestK(s, k);
  }
  public static void longestK(String word, int k){
    int answer = -1;
    int n = word.length();
    
    //generate all substrings in o(n*n) Runtime
    for(int i=0;i<n;i++){
      for(int j=i+1;j<=n;j++){
        HashSet<Character> distinct = new HashSet<>();
        for(int x=i;x<j;x++){
          distinct.add(word.charAt(x));
        }
        if(distinct.size()==k){
          answer = Math.max(answer, j-i);
        }
        
      }
    }
    System.out.println(answer);
  }
  }
