package yaroslav.EntityInterface;

public interface UserInterface {
    void updateProfile(String name, String pass, String email);
    void deleteAccount();
    void resetPassword(String newPassword);
}
