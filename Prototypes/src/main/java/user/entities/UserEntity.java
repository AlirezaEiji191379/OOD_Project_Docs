package user.entities;

public class UserEntity {
    private int id;
    private String name;
    private String email;
    private String phoneNumber;
    private String profilePicPath;
    private String cardNumber;
    private boolean isDeleted;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getProfilePicPath() {
        return profilePicPath;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public boolean isDeleted() {
        return isDeleted;
    }

    public void setDeleted(boolean deleted) {
        isDeleted = deleted;
    }
}
