package fr.free.nrw.commons.upload.mediaDetails;

import com.google.gson.annotations.SerializedName;

public class CaptionRequestDTO {

    @SerializedName("action")
    private String action;

    @SerializedName("format")
    private String format;

    @SerializedName("id")
    private String id;

    @SerializedName("language")
    private String language;

    @SerializedName("token")
    private String token;

    @SerializedName("value")
    private String value;

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "CaptionRequestDTO{" +
                "action='" + action + '\'' +
                ", format='" + format + '\'' +
                ", id='" + id + '\'' +
                ", language='" + language + '\'' +
                ", token='" + token + '\'' +
                ", value='" + value + '\'' +
                '}';
    }
}
