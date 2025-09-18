package AbstractFactory;

class MusicFactory implements IAudioFactory {
    private String title;
    private String author;
    private String album;
    private int durationSec;
    private String pubDate;

    public MusicFactory(String title, String author, String album, int durationSec, String pubDate) {
        this.title = title;
        this.author = author;
        this.album = album;
        this.durationSec = durationSec;
        this.pubDate = pubDate;
    }

    public IAudioContent createContent() {
        return new MusicTrack(title, author);
    }

    public IMetadata createMetadata() {
        return new MusicMetadata(album, durationSec, pubDate);
    } 
}
