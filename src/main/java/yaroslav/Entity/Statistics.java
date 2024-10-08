package yaroslav.Entity;

import yaroslav.EntityInterface.StatisticsInterface;

public class Statistics implements StatisticsInterface {

    //расчет текущей серии выполнения привычки
    public int calculateStreak(Habit habit) {
        return 1;
    }

    //процент выполнения привычек за указанный период
    public double calculateCompletionRate(User user, String period) {
        return 0;
    }

    //генерация отчета по прогрессу пользователя
    public String generateReport(User user) {
        return "";
    }
}
