class AdvancedPlayer extends BasicPlayer{
    public AdvancedPlayer(IAudioMedia audioMedia) {
        super(audioMedia);
    }

    public void changeAudio(IAudioMedia audioMedia) {
        super.setAudioMedia(audioMedia);
    }
}
