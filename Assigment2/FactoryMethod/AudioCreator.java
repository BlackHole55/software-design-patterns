abstract class AudioCreator {
    public abstract IAudio createAudio();

    public void playAudio() {
        IAudio audio = createAudio();
        audio.play();
    }
}
