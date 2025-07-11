import TvSet.TvSet;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class test {
    @Test
    public void test_that_TvSet_is_off() {
        TvSet tvSet = new TvSet(false);
        assertTrue(tvSet.isOn());
    }
    @Test
    public void test_that_TvSet_is_on() {
        TvSet tvSet = new TvSet(true);
        assertTrue(tvSet.isOn());
    }
    @Test
    public void test_that_TvSet_channel_is_1_when_on() {
        TvSet tvSet = new TvSet(true);
        assertEquals(1, tvSet.getChannel());
    }
    @Test
    public void test_that_TvSet_Channel_increments(){
        TvSet tvSet = new TvSet(true);
        tvSet.setChannel(4);
        assertEquals(5, tvSet.getChannel());
    }
    @Test
    public void test_that_TvSet_Channel_increments_when_call_twice(){
        TvSet tvSet = new TvSet(true);
        tvSet.setChannel(4);
        tvSet.setChannel(2);
        assertEquals(7, tvSet.getChannel());
    }
    @Test
    public void test_that_TvSet_Channel_passes_no_negative_number(){
        TvSet tvSet = new TvSet(true);
        tvSet.setChannel(-4);
        assertEquals(1, tvSet.getChannel());
    }
    @Test
    public void test_that_TvSet_Channel_increments_dont_go_pass_120(){
        TvSet tvSet = new TvSet(true);
        tvSet.setChannel(121);
        tvSet.setChannel(2);
        assertEquals(120, tvSet.getChannel());
    }
    @Test
    public void test_that_TvSet_volume_increments(){
        TvSet tvSet = new TvSet(true);
        tvSet.setVolumeLevel(4);
        assertEquals(5, tvSet.getVolumeLevel());
    }
    @Test
    public void test_that_TvSet_volume_increments_when_call_twice(){
        TvSet tvSet = new TvSet(true);
        tvSet.setVolumeLevel(4);
        tvSet.setVolumeLevel(2);
        assertEquals(7, tvSet.getVolumeLevel());
    }
    @Test
    public void test_that_TvSet_volume_passes_no_negative_number(){
        TvSet tvSet = new TvSet(true);
        tvSet.setVolumeLevel(-4);
        assertEquals(1, tvSet.getVolumeLevel());
    }
    @Test
    public void test_that_TvSet_volume_increments_dont_go_pass_7(){
        TvSet tvSet = new TvSet(true);
        tvSet.setVolumeLevel(121);
        tvSet.setVolumeLevel(2);
        assertEquals(7, tvSet.getVolumeLevel());
    }
    @Test
    public void test_that_TvSet_ChannelUp_increments_by_1(){
        TvSet tvSet = new TvSet(true);
        tvSet.channelUp();
        assertEquals(2, tvSet.getChannel());
    }
    @Test
    public void test_that_TvSet_ChannelUp_increments_when_call_twice(){
        TvSet tvSet = new TvSet(true);
        tvSet.channelUp();
        tvSet.channelUp();
        assertEquals(3, tvSet.getChannel());
    }

    @Test
    public void test_that_TvSet_ChannelDown_decrements_by_1(){
        TvSet tvSet = new TvSet(true);
        tvSet.channelDown();
        assertEquals(1, tvSet.getChannel());
    }
    @Test
    public void test_that_TvSet_ChannelDown_decrements_when_call_twice(){
        TvSet tvSet = new TvSet(true);
        tvSet.channelDown();
        tvSet.channelDown();
        assertEquals(1, tvSet.getChannel());
    }

    @Test
    public void test_that_TvSet_volumeUp_increments_by_1(){
        TvSet tvSet = new TvSet(true);
        tvSet.volumeLevelUp();
        assertEquals(2, tvSet.getVolumeLevel());
    }
    @Test
    public void test_that_TvSet_volumeUp_increments_when_call_twice(){
        TvSet tvSet = new TvSet(true);
        tvSet.volumeLevelUp();
        tvSet.volumeLevelUp();
        assertEquals(3, tvSet.getVolumeLevel());
    }
    @Test
    public void test_that_TvSet_volumeDown_decrements_by_1(){
        TvSet tvSet = new TvSet(true);
        tvSet.volumeLevelDown();
        assertEquals(1, tvSet.getVolumeLevel());
    }
    @Test
    public void test_that_TvSet_volumeDown_decrements_when_call_twice(){
        TvSet tvSet = new TvSet(true);
        tvSet.volumeLevelDown();
        tvSet.volumeLevelDown();
        assertEquals(1, tvSet.getVolumeLevel());
    }

}
