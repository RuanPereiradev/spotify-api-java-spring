package tech.biuldrun.spotify.client;


import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class AlbumResponse {

    private AlbumWrapper albums;

    public AlbumResponse(AlbumWrapper albums) {
        this.albums = albums;
    }

    public AlbumResponse() {
    }

    public AlbumWrapper getAlbums() {
        return albums;
    }

    public void setAlbums(AlbumWrapper albums) {
        this.albums = albums;
    }
}
