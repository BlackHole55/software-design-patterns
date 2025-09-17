abstract class AudioCreator {
    public abstract IAudio createAudio();

    public void whatThisCreator() {
        IAudio audio = createAudio();
        audio.whatThis();
    }
}
