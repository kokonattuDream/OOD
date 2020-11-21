public abstract class Entry {
    protected String name;
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public abstract int getSize();

    public abstract boolean isDirectory();
}