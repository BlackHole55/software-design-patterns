class Audiobook implements IAudioMedia {
    private String title;
    private String author;
    private String narrator;
    private String pubDate;

    public Audiobook(String title, String author, String narrator, String pubDate) {
        this.title = title;
        this.author = author;
        this.narrator = narrator;
        this.pubDate = pubDate;
    }

    public String getInfo() {
        return "Title: " + title + ", Author: " + author + ", Narrator: " + narrator + ", Published date: " + pubDate; 
    }

    public void play() {
        System.out.println("Playing: " + title + " by " + author);
    }
}
