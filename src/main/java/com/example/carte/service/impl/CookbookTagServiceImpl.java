package com.example.carte.service.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.carte.mapper.CookbookTagMapper;
import com.example.carte.model.CookbookTagDO;
import com.example.carte.service.CookbookTagService;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Map;
import java.util.function.Function;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author hhh
 * @since 2023-02-19
 */
@Service
public class CookbookTagServiceImpl extends ServiceImpl<CookbookTagMapper, CookbookTagDO> implements CookbookTagService {

    @Override
    public boolean saveBatch(Collection<CookbookTagDO> entityList, int batchSize) {
        return false;
    }

    @Override
    public boolean saveOrUpdateBatch(Collection<CookbookTagDO> entityList, int batchSize) {
        return false;
    }

    @Override
    public boolean updateBatchById(Collection<CookbookTagDO> entityList, int batchSize) {
        return false;
    }

    @Override
    public boolean saveOrUpdate(CookbookTagDO entity) {
        return false;
    }

    @Override
    public CookbookTagDO getOne(Wrapper<CookbookTagDO> queryWrapper, boolean throwEx) {
        return null;
    }

    @Override
    public Map<String, Object> getMap(Wrapper<CookbookTagDO> queryWrapper) {
        return null;
    }

    @Override
    public <V> V getObj(Wrapper<CookbookTagDO> queryWrapper, Function<? super Object, V> mapper) {
        return null;
    }
}
