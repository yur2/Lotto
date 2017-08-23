import java.util.Scanner;

public class LottoMain {
 
 static Scanner scan = new Scanner(System.in);
 
 public static void main(String[] args) {
  
  LottoSub lotto = new LottoSub(scan);
  
  lotto.input();
  lotto.Winning_number();
  lotto.winning();
  lotto.prize_money();
  
 } 

} 

 
