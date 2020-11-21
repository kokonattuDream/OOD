import java.nio.file.DirectoryStream.Filter;

public class MinSizeFilter implements Filter{
    @Override
    public boolean isValid(SearchParam param, File file){
        if(param.minSize == null){
            return true;
        }
        return file.getSize() >= param.minSize;
    }
}
