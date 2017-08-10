package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import pojo.Category;
import service.CategoryService;

import java.util.List;

/**
 * Created by chuliu on 2017/8/10.
 */

@Controller
@RequestMapping("")
public class CategoryController {
    @Autowired
    CategoryService categoryService;

    @RequestMapping("listCategory")
    public ModelAndView listCategory(){
        ModelAndView mav = new ModelAndView();
        List<Category> categoryList= categoryService.list();

        // 放入转发参数
        mav.addObject("categoryList", categoryList);
        // 放入jsp路径
        mav.setViewName("listCategory");
        return mav;
    }

}