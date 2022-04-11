import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    int wybor;
    Scanner s = new Scanner(System.in);
    while (true){
    System.out.println("1. Choinka ");
    System.out.println("2. Zamiana tekstu");
    wybor = s.nextInt();
    switch (wybor) {
      case 1:
        choinka();
        break;
      case 2:
        tekst();
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
  Scanner st = new Scanner(System.in);
  System.out.print("Podaj tekst: ");
  String txt= st.nextLine(), gotowy=""; 
  char tmp;
  int asc, p=0;
  for (int i=0 ; i<txt.length(); i++){
      tmp=txt.charAt(i);
      asc=(int)tmp;
        if (asc>=97 && asc<=122){
          asc=asc-32;
          tmp=(char)asc;
          p++;
        }
        else
        if(asc>=65 && asc<=90){
          asc = asc + 32;
          tmp = (char)asc;
          p++;
          }
        gotowy=gotowy+tmp;
  }
  System.out.println("Po zamianie: "+gotowy);
  System.out.println("Zamian: "+p);
  }
}