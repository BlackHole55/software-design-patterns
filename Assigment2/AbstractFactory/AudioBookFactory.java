package AbstractFactory;

class AudioBookFactory implements IAudioFactory {
    public IAudioContent createContent() {
        return new AudioBook();
    }

    public IMetadata createMetadata() {
        return new AudioBookMetadata();
    }
}
