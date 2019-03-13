package fr.free.nrw.commons.upload;

import com.drew.imaging.ImageMetadataReader;
import com.drew.imaging.ImageProcessingException;
import com.drew.metadata.Directory;
import com.drew.metadata.Metadata;

import java.io.File;
import java.io.IOException;

import javax.inject.Inject;
import javax.inject.Singleton;

import fr.free.nrw.commons.utils.ImageUtils;
import io.reactivex.Single;
import timber.log.Timber;

@Singleton
public class ReadEXIF {
    @Inject
    public ReadEXIF() {

    }

    public Single<Integer> processMetadata(String path) throws IOException {
        Metadata readMetadata = null;
        try {
            readMetadata = ImageMetadataReader.readMetadata(new File(path));
        } catch (ImageProcessingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (readMetadata != null) {
            for (Directory directory : readMetadata.getDirectories()) {
                if (directory.getName().equals("Exif IFD0") || directory.getName().equals("Exif SubIFD") || directory.getName().equals("Exif Thumbnail")) {
                    Timber.d(directory.getName() + " Contains metadata");
                    return Single.just(ImageUtils.IMAGE_OK);
                }
            }
        }
        return Single.just(ImageUtils.FILE_NO_EXIF);
    }

}

