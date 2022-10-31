import java.sql.Date;

public abstract class Document {
    public String fileName;
    public String getFileName() {
        return fileName;
    }
    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public Date createDate;
    public Date getCreateDate() {
        return createDate;
    }
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date lastModifiedDate;
    public Date getLastModifiedDate() {
        return lastModifiedDate;
    }
    public void setLastModifiedDate(Date lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }
    
    public String content;
    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
    }

    abstract void inputContent();
    abstract void save();
    abstract void saveAs(String newName);
    abstract void open();


    public Document(){
        this.fileName = "Document1";
        this.createDate = new Date(System.currentTimeMillis());
        this.lastModifiedDate = null;
        this.content = "";
    }
}
