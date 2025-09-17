package AbstractFactory;

class AudioBook implements IAudioContent {
    private String title;
    private String author;
    private String narrator;

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
    

    public String getNarrator() {
        return this.narrator;
    }

    public void setNarrator(String narrator) {
        this.narrator = narrator;
    }

    public String play() {
        return "Playing: " + this.title + " by " + this.author + ", narrated by " + this.narrator;
    }
}
