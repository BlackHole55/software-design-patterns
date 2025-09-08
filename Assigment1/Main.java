public class Main {
    public static void main(String[] args) {
        MusicBuilder builder = new MusicBuilder();
        builder.setAlbum("some").setAuthor("someone");

        Music music = builder.getProduct();

        System.out.println(music.getAlbum());

        Director director = new Director();
        director.buildCause(builder); // Resets previous build
        
        System.out.println(builder.getProduct());
    }
}
