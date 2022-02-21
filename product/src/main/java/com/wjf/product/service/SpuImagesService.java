package com.wjf.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wjf.common.utils.PageUtils;
import com.wjf.product.entity.SpuImagesEntity;

import java.util.Map;

/**
 * spu图片
 *
 * @author weijianfeng
 * @email weijianfeng@gmail.com
 * @date 2022-02-19 22:12:13
 */
public interface SpuImagesService extends IService<SpuImagesEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

