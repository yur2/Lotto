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

  System.out.println("\n\n\n\n      <<<<�ζ� ��÷ ��ȣ�� �����ϰڼ��ϴ�>>>>\n");
  System.out.println("          �α��α��α��α�~~~~~~~~\n");
  System.out.print("   1��° �� " + number[0] + "  ");
  System.out.print("2��° �� " + number[1] + "    ");
  System.out.print("3��° �� " + number[2] + "    ");
  System.out.print("4��° �� " + number[3] + "    ");
  System.out.print("5��° �� " + number[4] + "    ");
  System.out.print("6��° �� " + number[5] + "");

 }

 public void input() {

  System.out.println("\n***************������ �ζǽ���****************\n");

  for (int j = 0; j < 6; j++) {
   System.out.println("1 ~ 45������ ���� �� " + (j + 1) + "��° ����� ���ڸ� ������");
   number1[j] = scan.nextInt();

  }

  System.out.println("\n\n\n     ����� �� ���ڴ� " + number1[0] + ", " + number1[1] + ", " + number1[2] + ", "
    + number1[3] + ", " + number1[4] + ", " + number1[5] + "�Դϴ�.");
 }

 public void winning() {

  if (number[0] == number1[0]) {
   System.out.println("\n\n\n\n\n\n\n\n(" + number[0] + " = " + number1[0] + ")  ù��° �� ����\n");
  } else if (number[0] != number1[0]) {
   System.out.println("\n\n\n\n\n\n\n\nù��° �� Ʋ��\n");
  }

  if (number[1] == number1[1]) {
   System.out.println("(" + number[1] + " = " + number1[1] + ") �ι�° �� ����\n");
  } else if (number[0] != number1[0]) {
   System.out.println("�ι�° �� Ʋ��\n");
  }

  if (number[2] == number1[2]) {
   System.out.println("(" + number[2] + " = " + number1[2] + ") ����° �� ����\n");
  } else if (number[0] != number1[0]) {
   System.out.println("����° �� Ʋ��\n");
  }

  if (number[3] == number1[3]) {
   System.out.println("(" + number[3] + " = " + number1[3] + ") �׹�° �� ����\n");
  } else if (number[0] != number1[0]) {
   System.out.println("�׹�° �� Ʋ��\n");
  }

  if (number[4] == number1[4]) {
   System.out.println("(" + number[4] + " = " + number1[4] + ") �ټ���° �� ����\n");
  } else if (number[0] != number1[0]) {
   System.out.println("�ټ���° �� Ʋ��\n");
  }

  if (number[5] == number1[5]) {
   System.out.println("(" + number[5] + " = " + number1[5] + ") ������° �� ����\n");
  } else if (number[0] != number1[0]) {
   System.out.println("������° �� Ʋ��\n");
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
   System.out.println("\n\n    ���� ������ "+correct+"�� �ϳ� �� �췡?");
   break;
  
  case 1:
   System.out.println("\n\n    ���� ������ "+correct+"�� ------->>���̾���");
   break;
   
  case 2:
   System.out.println("\n\n    ���� ������ "+correct+"�� ------->>5000�� �ٱ� ����");
   break;
   
  case 3:
   System.out.println("\n\n    ���� ������ "+correct+"��------->> 50000�� ��÷");
   break;
   
  case 4:
   System.out.println("\n\n    ���� ������ "+correct+"�� ------->>200,000�� ��÷ ��");
   break;
   
  case 5:
   System.out.println("\n\n    ���� ������ "+correct+"�� ------->>100���� ��÷����");
   break;
   
  case 6:
   System.out.println("\n\n    ���� ������ "+correct+"�� ------->>20�� ��÷..�� ��ٳ�~!");
   break;
   
 
  }
  
 }

}
 
