package kr.ac.skuniv.for_impairment_project.data;

import com.google.gson.annotations.SerializedName;

public class LoginResponse {
    @SerializedName("code")
    private int code;

    @SerializedName("message")
    private String message;

    @SerializedName("userNum")
    private int userNum;

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public int getUserNum() {
        return userNum;
    }
}
