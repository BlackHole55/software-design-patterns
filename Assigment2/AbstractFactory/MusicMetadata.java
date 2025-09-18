package AbstractFactory;

public class MusicMetadata implements IMetadata {
    private String album;
    private int durationSec;
    private String pubDate;

    public MusicMetadata(String album, int durationSec, String pubDate) {
        this.album = album;
        this.durationSec = durationSec;
        this.pubDate = pubDate;
    }

    public String getAlbum() {
        return this.album;
    }

    public void setAlbum(String album) {
        this.album = album;
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
        return "Album: " + this.album +
                "\nDuration(Seconds): " + this.durationSec +
                "\nPublication Date: " + this.pubDate;
    }
}
