public class Directory {
    private List<Entry> entries;

    public Directory(String name){
        this.name = name;
        this.size = 0;
    }

    public void addEntry(Entry entry){
        entries.add(entry);
    }

    public List<Entry> getEntry(){
        return entries;
    }
    @Override
    public boolean isDirectory(){
        return true;
    }

    @Override
    public int getSize(){
        int size = 0;
        for(Entry e: entries){
            size += e.getSize();
        }
        return size;
    }



}
