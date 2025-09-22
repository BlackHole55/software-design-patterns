package AbstractFactory;

class Main {
    public static void main(String[] args) {
        IAudioFactory musicFactory = new MusicFactory(
            "Money for Nothing", 
            "Dire Straits", 
            "Brothers in Arms", 
            506, 
            "1985"
        );

        Application musicApp = new Application(musicFactory);
        musicApp.play();
        musicApp.info();

        IAudioFactory audiobookFactory = new AudioBookFactory(
            "Hitchhiker's Guide to the Galaxy", 
            "Douglas Adams", 
            "Morgan Freeman", 
            28800, 
            "12-10-1979"
        );

        Application audiobookApp2 = new Application(audiobookFactory);
        audiobookApp2.play();
        audiobookApp2.info();
    }
}
