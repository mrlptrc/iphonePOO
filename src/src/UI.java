import java.util.Scanner;
public class UI {

    public Scanner sc = new Scanner(System.in);

    public String pedeInfo(String msg){
        System.out.println(msg);
        String ler = sc.nextLine();
        return ler;
    }

    public String escrever(String msg){
        System.out.println(msg);
        return msg;
    }

}
