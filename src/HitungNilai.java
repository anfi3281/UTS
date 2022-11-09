import java.util.Scanner;
public class HitungNilai {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nilai : ");
        int nilai = input.nextInt();
        if(nilai > 90){
            System.out.println("Grade = A");
        }else if(nilai >=81 && nilai <= 90){
            System.out.println("Grade = B");
        }else{
            System.out.println("Grade = E");
        }
    }
}
