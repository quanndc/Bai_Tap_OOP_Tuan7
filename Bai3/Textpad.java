import java.sql.Date;
import java.util.Scanner;

public class Textpad extends Document {
    private Scanner input = new Scanner(System.in);
    public int words;
    public int getWord() {
        this.words = this.getContent().trim().split("\\s+").length;
        return words;
    }

    public int size;
    public int getSize() {
        String clone = this.getContent().replaceAll(" ","");
        this.size = clone.length();
        return size;
    }

    public Textpad(){
        super();
        this.fileName = "NoName.txt";
        this.words = 0;
        this.size = 0;
        this.content = "";
    }


    @Override
    void inputContent() {
        System.out.println("Hay nhap content");
        String content = input.nextLine();
        this.content = content;
    }

    @Override
    void save() {
        this.words = this.getWord();
        this.size = this.getSize();
        this.lastModifiedDate = new Date(System.currentTimeMillis());
    }

    @Override
    void saveAs(String newName) {
        //System.out.println("Hay nhap noi dung moi");
        //newName = input.nextLine();
        this.fileName = newName;
        this.words = this.getWord();
        this.size = this.getSize();
        this.lastModifiedDate = new Date(System.currentTimeMillis());
    }

    @Override
    void open() {
        System.out.println("File name: " + this.getFileName());
        System.out.println("Content: " + this.getContent());
        System.out.println("Ngay tao: " + this.getCreateDate());
        System.out.println("Ngay cap nhat cuoi: " + this.getLastModifiedDate());
        System.out.println("So tu: " + this.getWord());
        System.out.println("So ky tu: " + this.getSize());
    }

    
}
