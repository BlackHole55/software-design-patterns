package AbstractFactory;

public class AudioBookMetadata implements IMetadata {
    private int durationSec;
    private String pubDate;

    public AudioBookMetadata(int durationSec, String pubDate) {
        this.durationSec = durationSec;
        this.pubDate = pubDate;
    }

    public int getDurationSec() {
        return this.durationSec;
    }

    public void setDurationSec(int durationSec) {
        this.durationSec = durationSec;
    }

    public String getPubDate() {
        return this.pubDate;
    }

    public void setPubDate(String pubDate) {
        this.pubDate = pubDate;
    }

    public String info() {
        return "Duration(Seconds): " + this.durationSec +
                "\nPublication Date: " + this.pubDate;
    }
}