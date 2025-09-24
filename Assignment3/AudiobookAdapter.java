public class AudiobookAdapter implements IMediaPlayer{
    private AudiobookPlayer audiobookAdaptee = new AudiobookPlayer();

    public void play(String file) {
        this.audiobookAdaptee.narrate(file);
    }
}
