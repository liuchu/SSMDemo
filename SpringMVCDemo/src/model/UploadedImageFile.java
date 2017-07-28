package model;

import org.springframework.web.multipart.MultipartFile;

/**
 * Created by chuliu on 2017/7/27.
 */
public class UploadedImageFile {

    private MultipartFile image;

    public UploadedImageFile() {
    }

    public UploadedImageFile(MultipartFile image) {
        this.image = image;
    }

    public MultipartFile getImage() {
        return image;
    }

    public void setImage(MultipartFile image) {
        this.image = image;
    }
}
