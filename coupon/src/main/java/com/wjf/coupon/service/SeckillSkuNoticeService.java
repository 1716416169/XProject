package com.wjf.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wjf.common.utils.PageUtils;
import com.wjf.coupon.entity.SeckillSkuNoticeEntity;

import java.util.Map;

/**
 * 秒杀商品通知订阅
 *
 * @author weijianfeng
 * @email weijianfeng@gmail.com
 * @date 2022-02-20 16:11:06
 */
public interface SeckillSkuNoticeService extends IService<SeckillSkuNoticeEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

