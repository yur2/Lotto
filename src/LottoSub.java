import java.util.Scanner;

public class LottoSub {

 Scanner scan;
 static int[] number = new int[6];
 static int[] number1 = new int[6];

 public LottoSub(Scanner scan) {
  this.scan = scan;
 }

 public void Winning_number() {

  for (int i = 0; i < 6; i++) {
   int num = (int) (Math.random() * 2) + 1;
   number[i] = num;

  }
  System.out.println("\n\n\n\n\n               :");

  for (int i = 0; i < 6; i++) {
   System.out.println("               :");
   System.out.println("               :");
  }

  System.out.println("\n\n\n\n      <<<<로또 당첨 번호를 공개하겠숩니당>>>>\n");
  System.out.println("          두구두구두구두구~~~~~~~~\n");
  System.out.print("   1번째 수 " + number[0] + "  ");
  System.out.print("2번째 수 " + number[1] + "    ");
  System.out.print("3번째 수 " + number[2] + "    ");
  System.out.print("4번째 수 " + number[3] + "    ");
  System.out.print("5번째 수 " + number[4] + "    ");
  System.out.print("6번째 수 " + number[5] + "");

 }

 public void input() {

  System.out.println("\n***************유띠의 로또시장****************\n");

  for (int j = 0; j < 6; j++) {
   System.out.println("1 ~ 45까지의 숫자 중 " + (j + 1) + "번째 행운의 숫자를 고르세욤");
   number1[j] = scan.nextInt();

  }

  System.out.println("\n\n\n     당신이 고른 숫자는 " + number1[0] + ", " + number1[1] + ", " + number1[2] + ", "
    + number1[3] + ", " + number1[4] + ", " + number1[5] + "입니다.");
 }

 public void winning() {

  if (number[0] == number1[0]) {
   System.out.println("\n\n\n\n\n\n\n\n(" + number[0] + " = " + number1[0] + ")  첫번째 수 맞음\n");
  } else if (number[0] != number1[0]) {
   System.out.println("\n\n\n\n\n\n\n\n첫번째 수 틀림\n");
  }

  if (number[1] == number1[1]) {
   System.out.println("(" + number[1] + " = " + number1[1] + ") 두번째 수 맞음\n");
  } else if (number[0] != number1[0]) {
   System.out.println("두번째 수 틀림\n");
  }

  if (number[2] == number1[2]) {
   System.out.println("(" + number[2] + " = " + number1[2] + ") 세번째 수 맞음\n");
  } else if (number[0] != number1[0]) {
   System.out.println("세번째 수 틀림\n");
  }

  if (number[3] == number1[3]) {
   System.out.println("(" + number[3] + " = " + number1[3] + ") 네번째 수 맞음\n");
  } else if (number[0] != number1[0]) {
   System.out.println("네번째 수 틀림\n");
  }

  if (number[4] == number1[4]) {
   System.out.println("(" + number[4] + " = " + number1[4] + ") 다섯번째 수 맞음\n");
  } else if (number[0] != number1[0]) {
   System.out.println("다섯번째 수 틀림\n");
  }

  if (number[5] == number1[5]) {
   System.out.println("(" + number[5] + " = " + number1[5] + ") 여섯번째 수 맞음\n");
  } else if (number[0] != number1[0]) {
   System.out.println("여섯번째 수 틀림\n");
  }

 }

 public void prize_money() {
  
  int correct =0;
  for(int i=0; i<6; i++) {
   
    if(number[i]==number1[i]) {
     correct++;
     
    }
    
   
   
  }
  
  switch(correct) {
  
  case 0:
   System.out.println("\n\n    맞춘 개수는 "+correct+"개 하나 더 살래?");
   break;
  
  case 1:
   System.out.println("\n\n    맞춘 개수는 "+correct+"개 ------->>꽝이어유");
   break;
   
  case 2:
   System.out.println("\n\n    맞춘 개수는 "+correct+"개 ------->>5000원 줄까 말까");
   break;
   
  case 3:
   System.out.println("\n\n    맞춘 개수는 "+correct+"개------->> 50000원 당첨");
   break;
   
  case 4:
   System.out.println("\n\n    맞춘 개수는 "+correct+"개 ------->>200,000원 당첨 예");
   break;
   
  case 5:
   System.out.println("\n\n    맞춘 개수는 "+correct+"개 ------->>100만원 당첨예예");
   break;
   
  case 6:
   System.out.println("\n\n    맞춘 개수는 "+correct+"개 ------->>20억 당첨..헐 대다내~!");
   break;
   
 
  }
  
 }

}
 
