public class FilteSearcher {
    private FileFilter fileFilter;
    public FilteSearcher(){
        fileFilter = new fileFileter();
    }
    public List<File> search(Director directory, SearchParam param){
        List<File> res = new ArrayList<>();
        Queue<Directory> queue = new LinkedList<>();
        queue.offer(directory);

        while(!queue.isEmpty()){
            Directory currentDirectory = queue.poll();
            for(Entry e: currentDirectory.getEntry()){
                if(e.isDirectory()){
                    queue.add(e);
                } else {
                    File file = (File) e;
                    if(fileFilter.isValid(param, file)){
                        res.add(file);
                    }
                }
            }
        }
        return res;
    }
}
