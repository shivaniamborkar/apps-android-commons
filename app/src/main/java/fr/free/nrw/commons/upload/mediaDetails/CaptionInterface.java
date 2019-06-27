package fr.free.nrw.commons.upload.mediaDetails;

import org.wikipedia.dataclient.mwapi.MwQueryResponse;

import java.util.Map;
import java.util.Observable;

import fr.free.nrw.commons.mwapi.CustomApiResult;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface CaptionInterface {

    @FormUrlEncoded
    @POST("/w/api.php")
    Call<MwQueryResponse> addLabelstoWikidata(@FieldMap Map<String, String> fields);
}
