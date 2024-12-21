package tech.biuldrun.spotify.client;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

import java.util.List;
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)

public class AlbumWrapper {

    private List<Album> Items;

    public AlbumWrapper(List<Album> items) {
        Items = items;
    }

    public AlbumWrapper() {
    }

    public List<Album> getItems() {
        return Items;
    }

    public void setItems(List<Album> items) {
        Items = items;
    }
}
