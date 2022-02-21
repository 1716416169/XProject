package com.wjf.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wjf.common.utils.PageUtils;
import com.wjf.coupon.entity.SeckillPromotionEntity;

import java.util.Map;

/**
 * 秒杀活动
 *
 * @author weijianfeng
 * @email weijianfeng@gmail.com
 * @date 2022-02-20 16:11:06
 */
public interface SeckillPromotionService extends IService<SeckillPromotionEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

