import org.junit.jupiter.api.Test;

public class DiaryTest {
    @Test
    public void testThatDiaryIsLock(){
        Diary diary = new Diary("okafor", "joePassword");
        diary.unlockDiary("joePassword");
        AssertTrue(false, diary.isLocked());
    }
}
