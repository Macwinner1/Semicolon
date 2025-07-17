import java.util.List;

public class Diary {
    private String username;
    private String password;
    private boolean isLocked = true;
    private List<Entry> entries;

    public Diary(String username, String password){
        this.username = username;
        this.password = password;
        this.entries = entries;
    }

    public void unlockDiary(String password){
        if(this.password.equals(password)) {
            this.isLocked = false;
        }
    }
    public void createEntry(String title, String body){
        entries.add(new Entry(title, body));
    }
    public boolean isLocked() {
        return isLocked;
    }
    public void lockDiary() {
        this.isLocked = true;
    }

    public Entry findEntryById(int id) {
        for(Entry entry : entries){
            if(entry.getId() == id){
                return entry;
            }
        }
        return null;
    }
}
