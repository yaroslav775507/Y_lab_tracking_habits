package yaroslav.EntityInterface;

import yaroslav.Entity.Habit;
import yaroslav.Entity.User;

public interface StatisticsInterface {

    public int calculateStreak(Habit habit);

    public double calculateCompletionRate(User user, String period);

    public String generateReport(User user);
}
