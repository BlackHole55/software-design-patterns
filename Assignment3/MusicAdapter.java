public class MusicAdapter implements IMediaPlayer {
    private MusicPlayer musicAdaptee = new MusicPlayer();

    public void play(String file) {
        String delimiter = "-";
        String[] songInfo = file.split(delimiter);
        this.musicAdaptee.playSong(songInfo[0].trim(), songInfo[1].trim());
    }
}
