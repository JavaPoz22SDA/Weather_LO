package pl.sda.weather;
//
//"success": false,
//        "error": {
//        "code": 615,
//        "type": "request_failed",
//        "info": "Your API request failed. Please try again or contact support."
//        }

public class ApiError {

    private boolean success;
    private Error error;

    public ApiError() {}

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public Error getError() {
        return error;
    }

    public void setError(Error error) {
        this.error = error;
    }
}
