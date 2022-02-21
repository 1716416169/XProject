package com.wjf.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wjf.common.utils.PageUtils;
import com.wjf.coupon.entity.SkuFullReductionEntity;

import java.util.Map;

/**
 * 商品满减信息
 *
 * @author weijianfeng
 * @email weijianfeng@gmail.com
 * @date 2022-02-20 16:11:06
 */
public interface SkuFullReductionService extends IService<SkuFullReductionEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

