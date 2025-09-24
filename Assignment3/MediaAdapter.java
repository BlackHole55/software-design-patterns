public class MediaAdapter implements IMediaPlayer {
    private Object adaptee;

    public MediaAdapter(MusicPlayer musicPlayer) {
        this.adaptee = musicPlayer;
    }

    public MediaAdapter(AudiobookPlayer audiobookPlayer) {
        this.adaptee = audiobookPlayer;
    }

    @Override
    public void play(String file) {
        if (adaptee instanceof MusicPlayer) {
            ((MusicPlayer) adaptee).playSong(file);
        } else if (adaptee instanceof AudiobookPlayer) {
            ((AudiobookPlayer) adaptee).narrate(file);
        }
    }
}
