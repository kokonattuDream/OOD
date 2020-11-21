public class MaxSizeFilter extends Filter{
    @Override
    public boolean isValid(SearchParam param, File file){
        if(param.maxSize == null){
            return true;
        }
        return file.getSize() <= param.maxSize;
    }
}
