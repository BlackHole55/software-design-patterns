class Music implements IAudioMedia {
    private String title;
    private String author;
    private String album;
    private String pubDate;

    public Music(String title, String author, String album, String pubDate) {
        this.title = title;
        this.author = author;
        this.album = album;
        this.pubDate = pubDate;
    }

    public String getInfo() {
        return "Title: " + title + ", Author: " + author + ", Album: " + album + ", Published date: " + pubDate; 
    }

    public void play() {
        System.out.println("Playing: " + title + " by " + author);
    }
}
