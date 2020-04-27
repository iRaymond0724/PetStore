package service;

import common.ApiResponseEntity;
import dto.*;

public interface PetService {

    ApiResponseEntity addNewPet(CreatePetRequest request);

    ApiResponseEntity updateExistingPet(UpdatePetInfoRequest request);

    ApiResponseEntity findPetsByStatus(FindPetsByStatusRequest request);

    ApiResponseEntity findPetById(Integer petId, FindOnePetByIdRequest request);

    ApiResponseEntity updatePetStatusInStore(Integer petId, UpdateOnePetStatusInStoreRequest request);

    ApiResponseEntity deleteOnePet(String api_key,Integer petId, DeleteOnePetByIdRequest request);

    ApiResponseEntity uploadPetImg(Integer petId, UploadOneImageRequest request);
}
