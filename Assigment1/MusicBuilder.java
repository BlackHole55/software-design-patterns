class MusicBuilder implements Builder {
    private Music music;

    public MusicBuilder() {
        this.newProduct();
    }

    public void newProduct() {
        this.music = new Music();
    }

    public MusicBuilder setTitle(String title) {
        this.music.setTitle(title);
        return this;
    }

    public MusicBuilder setAuthor(String author) {
        this.music.setAuthor(author);
        return this;
    }

    public MusicBuilder setAlbum(String album) {
        this.music.setAlbum(album);
        return this;
    }

    public MusicBuilder setDurationSec(int duration) {
        this.music.setDurationSec(duration);
        return this;
    }

    public MusicBuilder setPubDate(String pubDate) {
        this.music.setPubDate(pubDate);
        return this;
    }

    public Music getProduct() {
        Music product = this.music;
        this.newProduct();
        return product;
    }
}