public class User{
    private String name;
    private Set<User> friends;
    public User(String name){
        this.name = name;
        friends = new HashSet<>();
    }

    public boolean addFriend(User user){
        return friends.add(user);
    }

    public Set<User> getFriends(){
        return friends;
    }
}