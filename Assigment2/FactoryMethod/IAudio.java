interface IAudio {
    public String getTitle();
    public void setTitle(String title);

    public String getAuthor();
    public void setAuthor(String author);

    public int getDurationSec();
    public void setDurationSec(int durationSec);

    public String getPubDate();
    public void setPubDate(String pubDate);

    public String play();
}