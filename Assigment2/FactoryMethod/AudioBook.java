class AudioBook implements IAudio {
    private String title;
    private String author;
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

    public void whatThis() {
        System.out.println("It's instance of AudioBook");
    }

    @Override
    public String toString() {
        return "Title: " + this.title + 
                " Author: " + this.author + 
                " Duration(seconds): " + this.durationSec + 
                " Published Date: " + this.pubDate;
    }
}
