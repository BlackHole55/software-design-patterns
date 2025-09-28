public class Main {
    public static void main(String[] args) {
        MediaAdapter musicAdapter = new MediaAdapter(new MusicPlayer());
        
        musicAdapter.play("Tom's Diner - DNA");

        MediaAdapter audiobookAdapter = new MediaAdapter(new AudiobookPlayer());

        audiobookAdapter.play("Brave New World - Aldous Huxley");


        MusicAdapter musicAdapter2 = new MusicAdapter();
        musicAdapter2.play("Bird's Lament - Moondog");

        AudiobookAdapter audiobookAdapter2 = new AudiobookAdapter();
        audiobookAdapter2.play("To Kill a Mockingbird - Harper Lee");
    }
}
