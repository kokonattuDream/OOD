public class BasicFilter extends Filter{
    private Set<String> banned;
    public BasicFilter(){
        banned = new HashSet<>();
        banned.add("XXXX");
        banned.add("****");
    }
    @Override
    public boolean pass(Comment comment){
        String desc = comment.desc.toLowerCase();
        String[] words = desc.split(" ");
    
        for(String word: words){
            if(banned.contains(word)){
                return false;
            }
        }
        return true;
    }
}
