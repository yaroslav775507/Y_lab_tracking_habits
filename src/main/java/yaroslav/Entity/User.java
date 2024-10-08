package yaroslav.Entity;

import lombok.*;
import yaroslav.EntityInterface.UserInterface;

import java.util.ArrayList;
import java.util.List;

@Builder
@Getter
@Setter
@AllArgsConstructor
public class User implements UserInterface {
    private static Long idCounter = 0L;
    private Long id;
    private String username;
    private String password;
    private String email_inf;
    List<Habit> habits = new ArrayList<>();

    public User(String username, String password, String email_inf, List<Habit> habits) {
        this.id = ++idCounter;
        this.username = username;
        this.password = password;
        this.email_inf = email_inf;
        this.habits = habits;
    }


    public void updateProfile(String name, String pass, String email) {
        username = name;
        password = pass;
        email_inf = email;
        System.out.println("Данные пользователя обновлены");
    }

    public void deleteAccount() {
        username = null;
        password = null;
        email_inf = null;
        System.out.println("Пользователь удален");
    }

    public void resetPassword(String newPassword) {
        this.password = newPassword;
        System.out.println("Пароль успешно изменен");
    }

    @Override
    public String toString() {
        return "Пользователь: " +
                "email_inf='" + email_inf + '\'' +
                ", password='" + password + '\'' +
                ", username='" + username + '\'' +
                ", id=" + id;
    }
}
