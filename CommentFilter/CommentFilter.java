import javax.imageio.spi.ServiceRegistry.Filter;

public class CommentFilter {
    private List<Filter> filters;
    public CommentFilter(){
        filters = new ArraList<>();
    }
    public void addFilter(Filter filter){
        filters.add(filter);
    }
    public boolean filterComment(Comment comment){
        for(Filter filter: filters){
            if(!filter.pass(comment)){
                return false;
            }
        }
        return true;
    }
}
