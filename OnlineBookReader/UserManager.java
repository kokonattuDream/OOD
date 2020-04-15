package OnlineBookReader;

import java.util.Map;
import java.util.HashMap;

public class UserManager {
    Map<Integer, User> users;

    public UserManager(){
        users = new HashMap<>();
    }

    public User addUser(int id, String name, int accountType){
        if(users.containsKey(id)){
            return null;
        }
        User user = new User(id, name, accountType);
        users.put(id, user);

        return user;
    }

    public User findUser(int id){
        return users.get(id);
    }

    public boolean removeUser(int id){
        return users.remove(id) != null;
    }
}