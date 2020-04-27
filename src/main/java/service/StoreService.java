package service;

import common.ApiResponseEntity;
import dto.PlaceOneOrderForPetRequest;

public interface StoreService {

    ApiResponseEntity findInventoryByStatus();

    ApiResponseEntity placeAnOrderForPet(PlaceOneOrderForPetRequest request);

    ApiResponseEntity findPurchaseOrderById(String orderId);

    ApiResponseEntity deletePurchaseOrderById(String orderId);
}
