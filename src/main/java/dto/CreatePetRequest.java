package dto;

import po.Category;
import po.PhotoUrls;
import po.Tags;

public class CreatePetRequest {
    private String id;
    private Category category;
    private String name;
    private PhotoUrls photoUrls;
    private Tags tags;
    private String status;

    public String getId() {
        return id;
    }

    public Category getCategory() {
        return category;
    }

    public String getName() {
        return name;
    }

    public PhotoUrls getPhotoUrls() {
        return photoUrls;
    }

    public Tags getTags() {
        return tags;
    }

    public String getStatus() {
        return status;
    }
}
