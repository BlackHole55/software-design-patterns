interface Builder {
    void reset();
    MusicBuilder setTitle(String title);
    MusicBuilder setAuthor(String author);
    MusicBuilder setAlbum(String album);
    MusicBuilder setDurationSec(int duration);
    MusicBuilder setPubDate(String pubDate);
}
