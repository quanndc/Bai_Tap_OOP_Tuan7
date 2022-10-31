import java.util.Scanner;

public class Menu extends Textpad{
    private Scanner input = new Scanner(System.in);

    public void generateMenu(){
        System.out.println("1. New Textpad");
        System.out.println("2. Input Textpad");
        System.out.println("3. Save Textpad");
        System.out.println("4. Save as Textpad");
        System.out.println("5. Open Textpad");
        System.out.println("6. Exit");
        System.out.println();
        
        int choice;
        do{
            System.out.println("Vui long chon chu nang so");
            choice = Integer.parseInt(input.nextLine());
            switch(choice){
                case 1: 
                    new Textpad();
                    //setContent("");
                    //setFileName("NoName.txt");
                    break;
                case 2:
                    inputContent();
                    break;
                case 3:
                    save();
                    break;
                case 4:
                    System.out.println("Hay nhap file name");
                    this.saveAs(input.nextLine());
                    break;
                case 5:
                    this.open();
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
