import java.util.List;

public class Diary {
    private String username;
    private String password;
    private boolean isLocked;
    private List<Entry> entries;

    public Diary(String username, String password){
        this.username = username;
        this.password = password;
    }
    public void unlockDiary(String password){
        if(this.password == password) {
            this.isLocked = false;
        }
    }
    public void

}
