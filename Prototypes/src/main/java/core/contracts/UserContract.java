package core.contracts;

public class UserContract {
    private int userId;
    private String name;
    private String picturePath;
    private String cardNumber;

    public int getUserId() {
        return userId;
    }

    public String getName() {
        return name;
    }

    public String getPicturePath() {
        return picturePath;
    }

    public String getCardNumber() {
        return cardNumber;
    }
}
