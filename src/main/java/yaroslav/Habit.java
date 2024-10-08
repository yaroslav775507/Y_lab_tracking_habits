package yaroslav;

import java.time.LocalDate;
import java.util.List;

public class Habit {
    private String tittle;
    private String description;
    private String frequency;
    List<LocalDate> completionHistory;
    boolean isCompleted;


    //отметить привычку как выполненную
    public void markAsCompleted(LocalDate date) {

    }

    //редактирование привычки
    public void editHabit(String title, String description, String frequency) {

    }

    //удаление привычки
    public void deleteHabit() {

    }
}
