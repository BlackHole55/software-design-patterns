class BasicPlayer implements IPlayer {
    private IAudioMedia audioMedia;

    public BasicPlayer(IAudioMedia audioMedia) {
        this.audioMedia = audioMedia;
    }

    public String getInfo() {
        return audioMedia.getInfo();
    }

    public void play() {
        audioMedia.play();
    }
}
