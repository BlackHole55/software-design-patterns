package AbstractFactory;

class AudioBook implements IAudioContent {
    private String title;
    private String author;
    private String narrator;

    public AudioBook(String title, String author, String narrator) {
        this.title = title;
        this.author = author;
        this.narrator = narrator;
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
    

    public String getNarrator() {
        return this.narrator;
    }

    public void setNarrator(String narrator) {
        this.narrator = narrator;
    }

    public void play() {
        System.out.println("Playing: " + this.title + " by " + this.author + ", narrated by " + this.narrator);
    }
}
