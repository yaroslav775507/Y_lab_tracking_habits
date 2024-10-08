package yaroslav;

import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private String username;
    private String password;
    private String email;
    List<Habit> habits = new ArrayList<>();

    public void updateProfile(String name, String email, String password) {

    }

    public void deleteAccount() {


    }

    public void resetPassword() {

    }
}
