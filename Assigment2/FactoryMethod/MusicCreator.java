class MusicCreator extends AudioCreator {
    public IAudio createAudio() {
        return new Music();
    }
}
