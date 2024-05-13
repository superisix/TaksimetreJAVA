import java.util.Scanner;
public static void main(String[] args) {
    int km;
    int acilisucret = 10;

    Scanner scan = new Scanner(System.in);
    System.out.print("Kaç km yol gidildi?");
    km =scan.nextInt();
    if (km<0){
        System.out.println("Km 0'dan büyük olmalıdr");
    }else{
       double odenecektutar=(km*2.20)+acilisucret;
       if(odenecektutar<20 || odenecektutar==20){
        System.out.println("Taksimetre tutarı " + 20);
       } else{
        System.out.println("Taksimetre tutarı " + odenecektutar);
       }
        
       

    }
}
}
