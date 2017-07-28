package controller;

import model.UploadedImageFile;
import org.apache.commons.lang.xwork.RandomStringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;

/**
 * Created by chuliu on 2017/7/27.
 */

@Controller
public class FileController {

    @RequestMapping("/upload")
    public ModelAndView showUploadPage() throws IOException {

        ModelAndView mav = new ModelAndView("upload_image");
        return mav;
    }

    @RequestMapping("/uploadImage")
    public ModelAndView uploadFile(HttpServletRequest request, UploadedImageFile file)
            throws IllegalStateException, IOException {

        System.out.println("In uploadFile method!!!");

        String name = RandomStringUtils.randomAlphanumeric(10);
        String fileName = name + ".png";

        System.out.println("Context path:"+request.getServletContext().getContextPath());

        File newFile = new File(request.getServletContext().getRealPath("/image"), fileName);

        //System.out.println("File:"+newFile.getPath());

        newFile.getParentFile().mkdirs();

        file.getImage().transferTo(newFile);

        //System.out.println("File:"+newFile.getPath());

        ModelAndView mav = new ModelAndView("show_uploaded_image");
        mav.addObject("imageName", fileName);
        return mav;
    }
}
