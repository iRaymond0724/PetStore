package dto;

import java.util.Date;

public class PlaceOneOrderForPetRequest {
    private Integer id;
    private Integer petId;
    private Integer quantity;
    private Date shipDate;
    private String status;
    private boolean complete;

    public Integer getId() {
        return id;
    }

    public Integer getPetId() {
        return petId;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public Date getShipDate() {
        return shipDate;
    }

    public String getStatus() {
        return status;
    }

    public boolean isComplete() {
        return complete;
    }
}
