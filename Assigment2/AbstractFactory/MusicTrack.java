package AbstractFactory;

class MusicTrack implements IAudioContent { 
    private String title;
    private String author;

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
    

    public String play() {
        return "Playing: " + this.title + " by " + this.author;
    }
}
