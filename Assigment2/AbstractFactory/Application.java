package AbstractFactory;

class Application {
    private IAudioContent content;
    private IMetadata metadata;

    public Application(IAudioFactory audioFactory) {
        content = audioFactory.createContent();
        metadata = audioFactory.createMetadata();
    }

    public void play() {
        content.play();
    }

    public void info() {
        metadata.info();
    }
}
