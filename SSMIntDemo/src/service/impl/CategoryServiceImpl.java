package service.impl;

import mapper.CategoryMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pojo.Category;
import service.CategoryService;

import java.util.List;

/**
 * Created by chuliu on 2017/8/10.
 */

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    CategoryMapper categoryMapper;

    @Override
    public List<Category> list() {
        //Insert code here
        return categoryMapper.list();
    }
}
