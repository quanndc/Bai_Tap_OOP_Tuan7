import java.sql.Date;

public abstract class Document {
    protected String fileName;
    protected String getFileName() {
        return fileName;
    }
    protected void setFileName(String fileName) {
        this.fileName = fileName;
    }

    protected Date createDate;
    protected Date getCreateDate() {
        return createDate;
    }
    protected void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    protected Date lastModifiedDate;
    protected Date getLastModifiedDate() {
        return lastModifiedDate;
    }
    protected void setLastModifiedDate(Date lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }
    
    protected String content;
    protected String getContent() {
        return content;
    }
    protected void setContent(String content) {
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
