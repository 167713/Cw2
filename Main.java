import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    int wybor;
    Scanner s = new Scanner(System.in);
    while (true){
    System.out.println("1. Choinka ");
    System.out.println("2. Zamiana tekstu");
    System.out.println("3.  ");
    System.out.println("4.  ");
    System.out.println("5.  ");
    System.out.println("6.  ");
    System.out.println("7.  ");
    System.out.println("8.  ");
    wybor = s.nextInt();
    switch (wybor) {
      case 1:
        choinka();
        break;
      case 2:
        tekst();
        break;
      case 3:
        
        break;
      case 4:
        
        break;
      case 5:
        
        break;
      case 6:
        
        break;
      case 7:
        
        break;
      default: 
        System.out.println("Brak opcji");
        break;
      }
    }
  }
  public static void choinka() {
    Scanner sb = new Scanner(System.in);
    int wys, pwt;
    do{
    System.out.println("Podaj wysokosc wieksza niz 0");
    wys = sb.nextInt();
      }while(wys<=0);
    System.out.println("Ile razy powtorzyc: ");
    pwt = sb.nextInt();
    while(pwt>0){
    for(int i=0;i<=wys;i++){
      for(int j=0;j<i;j++)
        System.out.print("X");
      if(i!=wys)
        System.out.println("");
    }
      pwt--;
    }
    System.out.println("");
  }

  public static void tekst() {
  Scanner in = new Scanner(System.in);
  System.out.println("Podaj tekst: "); 
  String txt = in.nextLine();
  int dl = txt.length();
  char[] tekst = txt.toCharArray();
  int zmiany=0;
  for(int i=0;i<dl;i++){
    if(Character.isUpperCase(tekst[i])){
      tekst[i]=Character.ToLowerCase();
      zmiany++;
      }
    else if(Character.isLowerCase(tekst[i])){
      tekst[i]=Character.ToUpperCase();
      zmiany++;
      }
  }
  for(int j=0;j<dl;j++){
   System.out.print(tekst[j]);          
  }
  System.out.println("Zmiany: "+zmiany);
 }
}