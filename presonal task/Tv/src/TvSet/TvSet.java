package TvSet;

public class TvSet {
    private int channel;
    private int volumeLevel;
    private boolean isOn;

    public TvSet(boolean isOn) {
        this.isOn = isOn;
        this.channel = 1;
        this.volumeLevel = 1;
    }
    public boolean isOn() {
        return this.isOn = true;
    }

    public void setChannel(int channel) {
        this.channel += channel >= 1 ? channel : 0;
        if (this.channel >= 120) {
            this.channel = 120;
        }
    }
    public void setVolumeLevel(int volumeLevel) {
        this.volumeLevel += volumeLevel >= 1 ? volumeLevel : 0;
        if (this.volumeLevel >= 7) {
            this.volumeLevel = 7;
        }
    }
    public void channelUp() {
        ++this.channel;
    }
    public void channelDown() {
        setChannel(this.channel - 1);
    }
    public void volumeLevelUp() {
        ++this.volumeLevel;
    }
    public void volumeLevelDown() {
        setVolumeLevel(this.volumeLevel - 1);
    }
    public int getChannel() {
        return this.channel;
    }
    public int getVolumeLevel() {
        return this.volumeLevel;
    }
}
