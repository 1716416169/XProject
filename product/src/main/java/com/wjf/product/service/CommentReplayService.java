package com.wjf.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wjf.common.utils.PageUtils;
import com.wjf.product.entity.CommentReplayEntity;

import java.util.Map;

/**
 * 商品评价回复关系
 *
 * @author weijianfeng
 * @email weijianfeng@gmail.com
 * @date 2022-02-19 22:12:13
 */
public interface CommentReplayService extends IService<CommentReplayEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

