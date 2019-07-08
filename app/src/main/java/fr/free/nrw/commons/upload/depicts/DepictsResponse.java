package fr.free.nrw.commons.upload.depicts;

import com.google.gson.annotations.SerializedName;

public class DepictsResponse {

    @SerializedName("searchinfo")
    private String searchinfo;

    @SerializedName("search")
    private String search;

    @SerializedName("success")
    private String success;

    public String getSearchinfo() {
        return searchinfo;
    }

    public void setSearchinfo(String searchinfo) {
        this.searchinfo = searchinfo;
    }

    public String getSearch() {
        return search;
    }

    public void setSearch(String search) {
        this.search = search;
    }

    public String getSuccess() {
        return success;
    }

    public void setSuccess(String success) {
        this.success = success;
    }
}
