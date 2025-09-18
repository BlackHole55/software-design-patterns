package AbstractFactory;

class AudioBookFactory implements IAudioFactory {
    private String title;
    private String author;
    private String narrator;
    private int durationSec;
    private String pubDate;

    public AudioBookFactory(String title, String author, String narrator, int durationSec, String pubDate) {
        this.title = title;
        this.author = author;
        this.narrator = narrator;
        this.durationSec = durationSec;
        this.pubDate = pubDate;
    }

    public IAudioContent createContent() {
        return new AudioBook(title, author, narrator);
    }

    public IMetadata createMetadata() {
        return new AudioBookMetadata(durationSec, pubDate);
    }
}
