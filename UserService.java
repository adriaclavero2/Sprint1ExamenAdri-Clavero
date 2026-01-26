import java.util.ArrayList;
import java.util.List;

public class UserService {

    List<User> users = new ArrayList<>();

    public void register(String username, String password) {

        if (username.isEmpty()) {
            throw new InvalidNameException("Name is empty.");
        }

        if (password.length() < 8) {
            throw new InvalidNameException("Invalid length");
        }

        for (User u : users) {
            if (u.getUserName().equals(username)) {
                throw new InvalidNameException("Name already exists.");
            }
        }

        User newUser = new User(username, password);
        users.add(newUser);


        System.out.println("Successfully registered user: " + username);
    }
}



