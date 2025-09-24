public class MusicAdapter implements IMediaPlayer {
    private MusicPlayer musicAdaptee = new MusicPlayer();

    public void play(String file) {
        this.musicAdaptee.playSong(file);
    }
}
