import java.util.Scanner;

public class Program {
    public static void main(String[] args){
            System.out.println("1. New Textpad");
            System.out.println("2. Input Textpad");
            System.out.println("3. Save Textpad");
            System.out.println("4. Save as Textpad");
            System.out.println("5. Open Textpad");
            System.out.println("6. Exit");
            System.out.println();
            Scanner input = new Scanner(System.in);
            int choice;
            Textpad txt = new Textpad();
            do{
                System.out.println("Vui long chon chu nang so");
                choice = Integer.parseInt(input.nextLine());
             
                switch(choice){
                    case 1: 
                        txt = new Textpad();
                        break;
                    case 2:
                        txt.inputContent();
                        break;
                    case 3:
                        txt.save();
                        break;
                    case 4:
                        System.out.println("Hay nhap file name");
                        txt.saveAs(input.nextLine());
                        break;
                    case 5:
                        txt.open();
                        break;
                    case 6:
                        System.out.println("Exited...");
                        break;
                    default:
                        System.out.println("Chuc nang khong phu hop");
                        break;
                }
            }while(choice != 6);
        } 
}
