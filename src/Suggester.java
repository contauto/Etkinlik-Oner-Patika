import java.util.Scanner;

public class Suggester {
    public static void main(String[] args) {

        double heat;

        Scanner scanner=new Scanner(System.in);

        System.out.println("Sıcaklığı giriniz.");
        heat=scanner.nextDouble();

        if (heat>=25){
            System.out.println("Yüzmeye gidebilirsiniz.");
        }
        else if(heat>=5){
            if (heat<15){
                System.out.println("Sinemaya gidebilirsiniz.");
            }
            else if (heat<25){
                System.out.println("Pikniğe gidebilirsiniz.");
            }
        }
        else{
            System.out.println("Kayak yapmaya gidebilirsiniz.");
        }
    }
}
