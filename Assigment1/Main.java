public class Main {
    public static void main(String[] args) {
        MusicBuilder builder = new MusicBuilder();

        Music music =  builder.setAlbum("some").setAuthor("someone").getProduct();
        
        System.out.println(music);

        Director director = new Director();
        director.buildCause(builder); // Resets previous build
        
        System.out.println(builder.getProduct());
    }
}
