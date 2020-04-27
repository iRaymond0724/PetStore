package controller;

import common.ApiResponseEntity;
import common.ApiResultEnum;
import dto.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import service.PetService;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/pet")
public class PetController {

    @Autowired
    PetService petService;

    @RequestMapping(value = "" , method = RequestMethod.POST)
    public ApiResponseEntity addNewPet(CreatePetRequest request) {
        try {
            ApiResponseEntity response = petService.addNewPet(request);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new ApiResponseEntity(ApiResultEnum.ERROR.getCode(),ApiResultEnum.ERROR.getResult());
    }

    @RequestMapping(value = "" , method = RequestMethod.PUT)
    public ApiResponseEntity updateExistingPet(UpdatePetInfoRequest request) {
        try {
            ApiResponseEntity response = petService.updateExistingPet(request);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new ApiResponseEntity(ApiResultEnum.ERROR.getCode(),ApiResultEnum.ERROR.getResult());
    }

    @RequestMapping(value = "/findByStatus" , method = RequestMethod.GET)
    public ApiResponseEntity findPetsByStatus(FindPetsByStatusRequest request) {
        try {
            ApiResponseEntity response = petService.findPetsByStatus(request);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new ApiResponseEntity(ApiResultEnum.ERROR.getCode(),ApiResultEnum.ERROR.getResult());
    }

    @RequestMapping(value = "/{petId}" , method = RequestMethod.GET)
    public ApiResponseEntity findPetById(@PathVariable("petId") Integer petId , FindOnePetByIdRequest request) {
        try {
            ApiResponseEntity response = petService.findPetById(petId,request);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new ApiResponseEntity(ApiResultEnum.ERROR.getCode(),ApiResultEnum.ERROR.getResult());
    }

    @RequestMapping(value = "/{petId}}" , method = RequestMethod.POST)
    public ApiResponseEntity updatePetStatusInStore(@PathVariable("petId") Integer petId, UpdateOnePetStatusInStoreRequest request) {
        try {
            ApiResponseEntity response = petService.updatePetStatusInStore(petId,request);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new ApiResponseEntity(ApiResultEnum.ERROR.getCode(),ApiResultEnum.ERROR.getResult());
    }

    @RequestMapping(value = "/{petId}}" , method = RequestMethod.DELETE)
    public ApiResponseEntity deleteOnePet(HttpServletRequest reqHeader, @PathVariable("petId") Integer petId , DeleteOnePetByIdRequest request) {
        try {
            String api_key = reqHeader.getHeader("api_key");
            ApiResponseEntity response = petService.deleteOnePet(api_key,petId,request);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new ApiResponseEntity(ApiResultEnum.ERROR.getCode(),ApiResultEnum.ERROR.getResult());
    }

    @RequestMapping(value = "/{petId}/uploadImage" , method = RequestMethod.POST)
    public ApiResponseEntity uploadPetImg(@PathVariable("petId") Integer petId ,UploadOneImageRequest request) {
        try {
            ApiResponseEntity response = petService.uploadPetImg(petId,request);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new ApiResponseEntity(ApiResultEnum.ERROR.getCode(),ApiResultEnum.ERROR.getResult());
    }


}
