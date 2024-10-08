package yaroslav.Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;
@Getter
@Setter
@AllArgsConstructor
public class Habit {
    private String tittle;
    private String description;
    private String frequency;
    List<LocalDate> completionHistory;
    boolean isCompleted;


    //отметить привычку как выполненную
    public void markAsCompleted(LocalDate date, int range) {
        switch (range) {
            case 1: {
                this.isCompleted = true;
                System.out.println("Выполнена");
            }
            case 2: {
                this.isCompleted = false;
                System.out.println("Не выполнена");
            }
        }
    }

    //редактирование привычки
    public void editHabit(String new_title, String new_description, String new_frequency) {
        this.tittle = new_title;
        this.description = new_description;
        this.frequency = new_frequency;

    }

    //удаление привычки
    public void deleteHabit() {
        this.tittle = null;
        this.description = null;
        this.frequency = null;

    }
}
