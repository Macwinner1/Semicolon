
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DiaryTest {
    @Test
    public void testThatDiaryIsLockedOnceCreated(){
        Diary diary = new Diary("okafor", "joePassword");
        assertTrue(diary.isLocked());
    }
    @Test
    public void testThatDiaryIsUnLocked(){
        Diary diary = new Diary("okafor", "joePassword");
        diary.unlockDiary("joePassword");
        assertFalse(diary.isLocked());
    }
    @Test
    public void testThatDiaryIsLocked(){
        Diary diary = new Diary("okafor", "joePassword");
        diary.lockDiary();
        assertTrue(diary.isLocked());
    }
    @Test
    public void testThatCreateEntry(){
        Entry entry = new Entry(4544, "okafor", "joePassword");
        assertFalse(entry.findEntryById(4322));
    }

}
