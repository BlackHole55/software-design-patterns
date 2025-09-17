package AbstractFactory;

interface IAudioFactory {
    public IAudioContent createContent();
    public IMetadata createMetadata();
}
