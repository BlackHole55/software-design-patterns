package AbstractFactory;

class MusicFactory implements IAudioFactory {
    public IAudioContent createContent() {
        return new MusicTrack();
    }

    public IMetadata createMetadata() {
        return new MusicMetadata();
    } 
}
