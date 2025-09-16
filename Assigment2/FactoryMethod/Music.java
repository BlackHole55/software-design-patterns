class Music implements IAudio {
    private String title;
    private String author;
    private String album;
    private int durationSec;
    private String pubDate;

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    
    public String getAuthor() {
        return this.author;
    }

    public void setAuthor(String author) {
        this.author = author;
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

    public void setDurationSec(int duration) {
        this.durationSec = duration;
    }


    public String getPubDate() {
        return this.pubDate;
    }

    public void setPubDate(String pubDate) {
        this.pubDate = pubDate;
    }

    public String play() {
        return "Playing: " + this.title;
    }

    @Override
    public String toString() {
        return "Title: " + this.title + 
                " Author: " + this.author + 
                " Album: " + this.album + 
                " Duration(seconds): " + this.durationSec + 
                " Published Date: " + this.pubDate;
    }
}
