package service.impl;

import common.ApiResponseEntity;
import dto.*;
import service.PetService;


public class PerServiceImpl implements PetService {

    public ApiResponseEntity addNewPet(CreatePetRequest request) {
        return null;
    }

    public ApiResponseEntity updateExistingPet(UpdatePetInfoRequest request) {
        return null;
    }

    public ApiResponseEntity findPetsByStatus(FindPetsByStatusRequest request) {
        return null;
    }

    public ApiResponseEntity findPetById(Integer petId, FindOnePetByIdRequest request) {
        return null;
    }

    public ApiResponseEntity updatePetStatusInStore(Integer petId, UpdateOnePetStatusInStoreRequest request) {
        return null;
    }

    public ApiResponseEntity deleteOnePet(String api_key, Integer petId, DeleteOnePetByIdRequest request) {
        return null;
    }

    public ApiResponseEntity uploadPetImg(Integer petId, UploadOneImageRequest request) {
        return null;
    }
}
