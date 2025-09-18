package AbstractFactory;

class MusicTrack implements IAudioContent { 
    private String title;
    private String author;

    public MusicTrack(String title, String author) {
        this.title = title;
        this.author = author;
    }

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
    

    public void play() {
        System.out.println("Playing: " + this.title + " by " + this.author);
    }
}
