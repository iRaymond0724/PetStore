package common;


public class ApiResponseEntity {
    private String apiStatusCode = "200";
    private String apiStatusMsg = "調用接口成功";
    private String resultCode;
    private String resultMsg;
    private Object object;

    public ApiResponseEntity() {
    }

    public ApiResponseEntity(String resultCode, String resultMsg) {
        this.resultCode = resultCode;
        this.resultMsg = resultMsg;
    }

    public ApiResponseEntity(String resultCode, String resultMsg, Object object) {
        this.resultCode = resultCode;
        this.resultMsg = resultMsg;
        this.object = object;
    }

    public void setApiStatusCode(String apiStatusCode) {
        this.apiStatusCode = apiStatusCode;
    }

    public void setApiStatusMsg(String apiStatusMsg) {
        this.apiStatusMsg = apiStatusMsg;
    }

    public void setResultCode(String resultCode) {
        this.resultCode = resultCode;
    }

    public void setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
    }

    public void setObject(Object object) {
        this.object = object;
    }

    public String getApiStatusCode() {
        return apiStatusCode;
    }

    public String getApiStatusMsg() {
        return apiStatusMsg;
    }

    public String getResultCode() {
        return resultCode;
    }

    public String getResultMsg() {
        return resultMsg;
    }

    public Object getObject() {
        return object;
    }
}
