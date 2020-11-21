public class NameFilter extends Filter {
    @Override
    public boolean isValid(SearchParam param, File file){
        if(param.name == null){
            return true;
        }
        return file.getName().equals(param.name);
    }
}
