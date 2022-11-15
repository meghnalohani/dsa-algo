import java.util.*;

public class Main {
    public static void main(String[] args) {
      int[] stocks = {7,1,5,6,4,3};
      maxProfit(stocks);
  }
  public static void maxProfit(int[] stocks){
   int left=0;//buy
   int right=1;//sell
   int maxP = 0;
   int size = stocks.length;
   while(right<size){
     if(stocks[left]<stocks[right]){
       int profit = stocks[right]-stocks[left];
       maxP = Math.max(profit,maxP);
     }
     else
     left=right;
     right+=1;
   }
   System.out.println(maxP);
  }
  }
