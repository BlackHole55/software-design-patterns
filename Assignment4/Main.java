class Main {
    public static void main(String[] args) {
        Music wheresYourHeadAt = new Music(
            "Where's Your Head At", 
            "Basement Jaxx", 
            "Rooty", 
            "2001"
        );

        Audiobook littlePrince = new Audiobook(
            "The Little Prince", 
            "Antoine de Saint-Exupery", 
            "Morgan Freeman", 
            "1943"
        );

        BasicPlayer basicMusicPlayer = new BasicPlayer(wheresYourHeadAt);
        basicMusicPlayer.play();
        System.out.println(basicMusicPlayer.getInfo());

        BasicPlayer basicAudiobookPlayer = new BasicPlayer(littlePrince);
        basicAudiobookPlayer.play();
        System.out.println(basicAudiobookPlayer.getInfo());

        AdvancedPlayer advancedPlayer = new AdvancedPlayer(wheresYourHeadAt);
        advancedPlayer.play();
        advancedPlayer.changeAudio(littlePrince);
        advancedPlayer.play();
    }    
}
