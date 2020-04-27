package controller;

import common.ApiResponseEntity;
import common.ApiResultEnum;
import dto.PlaceOneOrderForPetRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import service.StoreService;

@Controller
@RequestMapping("/store")
public class StoreController {

    @Autowired
    StoreService storeService;

    @RequestMapping(value = "/inventory" , method = RequestMethod.GET)
    public ApiResponseEntity findInventoryByStatus() {
        try {
            ApiResponseEntity response = storeService.findInventoryByStatus();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new ApiResponseEntity(ApiResultEnum.ERROR.getCode(),ApiResultEnum.ERROR.getResult());
    }

    @RequestMapping(value = "/order" , method = RequestMethod.POST)
    public ApiResponseEntity placeAnOrderForPet(PlaceOneOrderForPetRequest request) {
        try {
            ApiResponseEntity response = storeService.placeAnOrderForPet(request);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new ApiResponseEntity(ApiResultEnum.ERROR.getCode(),ApiResultEnum.ERROR.getResult());
    }

    @RequestMapping(value = "/order/{orderId}" , method = RequestMethod.GET)
    public ApiResponseEntity findPurchaseOrderById(@PathVariable("orderId") String orderId) {
        try {
            ApiResponseEntity response = storeService.findPurchaseOrderById(orderId);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new ApiResponseEntity(ApiResultEnum.ERROR.getCode(),ApiResultEnum.ERROR.getResult());
    }

    @RequestMapping(value = "/order/{orderId}" , method = RequestMethod.DELETE)
    public ApiResponseEntity deletePurchaseOrderById(@PathVariable("orderId") String orderId) {
        try {
            ApiResponseEntity response = storeService.deletePurchaseOrderById(orderId);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new ApiResponseEntity(ApiResultEnum.ERROR.getCode(),ApiResultEnum.ERROR.getResult());
    }
}
