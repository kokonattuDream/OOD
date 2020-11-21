public class File extends Entry{
    private byte[] content;
    public File(String name, byte[] content){
        super(name);
        this.content = content;
    }
    public void setContent(byte[] content){
        this.content = content;
    }

    public byte[] getContent(){
        return content;
    }

    public String getExtension(){
        return name.substring(name.indexOf(".") + 1);
    }
    
    @Override
    public int getSize(){
        return content.length;
    }
    
    @Override
    public boolean isDirectory(){
        return false;
    };
}
