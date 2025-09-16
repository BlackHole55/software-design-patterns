class AudioBookCreator extends AudioCreator {
    public IAudio createAudio() {
        return new AudioBook();
    }
}
