public class Director {

    public void buildCause(MusicBuilder builder) {
        builder.newProduct();
        builder.setTitle("Cause")
                .setAuthor("Rodriguez")
                .setAlbum("Coming From Reality")
                .setDurationSec(206)
                .setPubDate("1970");
    }
}
