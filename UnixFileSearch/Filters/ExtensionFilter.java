public class ExtensionFilter implements Filter{
    @Override
    public boolean isValid(SearchParam param, File file){
        if(param.extension == null){
            return true;
        }
        return file.getExtension().equals(param.extension);
    }
}
