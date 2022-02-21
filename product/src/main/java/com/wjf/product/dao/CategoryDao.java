package com.wjf.product.dao;

import com.wjf.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author weijianfeng
 * @email weijianfeng@gmail.com
 * @date 2022-02-19 22:12:13
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
