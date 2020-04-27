package common;


public enum ApiResultEnum {

    OK("OK","請求成功"),
    ERROR("ERROR" , "請求失敗，請聯繫RD部門");

    private String code;
    private String result;

    ApiResultEnum(String code, String result) {
        this.code = code;
        this.result = result;
    }

    public String getCode() {
        return code;
    }

    public String getResult() {
        return result;
    }
}
