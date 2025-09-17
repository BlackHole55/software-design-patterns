class Main {
    public static void main(String[] args) {
        AudioCreator musicCreator = new MusicCreator();
        musicCreator.whatThisCreator();

        IAudio music = musicCreator.createAudio();
        music.whatThis();

        music.setTitle("Money for Nothing");

        System.out.println(music.getTitle());

        AudioCreator audioCreator = new AudioBookCreator();
        audioCreator.whatThisCreator();

        // music.setAlbum("some");
    }
}
