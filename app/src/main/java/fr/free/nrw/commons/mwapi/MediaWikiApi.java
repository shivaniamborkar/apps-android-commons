package fr.free.nrw.commons.mwapi;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Map;

import io.reactivex.Single;

public interface MediaWikiApi {

    Single<String> parseWikicode(String source);

    @NonNull
    Single<MediaResult> fetchMediaByFilename(String filename);

    @Nullable
    String revisionsByFilename(String filename) throws IOException;

    @NonNull
    LogEventResult logEvents(String user, String lastModified, String queryContinue, int limit) throws IOException;

    boolean isUserBlockedFromCommons();

    void logout();

//    Single<CampaignResponseDTO> getCampaigns();

    interface ProgressListener {
        void onProgress(long transferred, long total);
    }
}
