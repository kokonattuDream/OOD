import java.util.ArrayList;

public class FileFilter {
    private List<Filter> filters;
    public FileFilter(){
        filters = new ArrayList<>();
        filters.add(new ExtensionFilter());
        filters.add(new MaxSizeFilter());
        filters.add(new MinSizeFilter());
        filters.add(new NameFilter());
    }

    public boolean isValid(FileParam param, File file){
        for(Filter filter: filters){
            if(!filter.isValid(param, file)){
                return false;
            }
        }
        return true;
    }
}
