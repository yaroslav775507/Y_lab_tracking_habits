package yaroslav;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HabitManager {
    Map<String, User> users = new HashMap<>();

    // регистрация
    void createUser(String email, String password, String name) {

    }

    //авторизация
    public User login(String email, String password) {
        return null;
    }

    //создание привычки
    public void createHabit(User user, String title, String description, String frequency) {

    }

    //просмотр привычки
    public List<Habit> viewHabits(User user) {
        return null;
    }

    //редактирование привычки
    public void editHabit(User user, Habit habit, String title, String description, String frequency) {

    }

    //удаление привычки
    public void deleteHabit(User user, Habit habit) {

    }

    //отслеживание
    public void trackHabit(User user, Habit habit, LocalDate date) {

    }
}
