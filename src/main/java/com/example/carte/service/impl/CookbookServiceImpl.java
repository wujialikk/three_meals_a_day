package com.example.carte.service.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.carte.mapper.CookbookMapper;
import com.example.carte.model.CookbookDO;
import com.example.carte.service.CookbookService;
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
public class CookbookServiceImpl extends ServiceImpl<CookbookMapper, CookbookDO> implements CookbookService {

    @Override
    public boolean save(CookbookDO entity) {
        return super.save(entity);
    }

    @Override
    public boolean saveBatch(Collection<CookbookDO> entityList, int batchSize) {
        return false;
    }

    @Override
    public boolean saveOrUpdateBatch(Collection<CookbookDO> entityList, int batchSize) {
        return false;
    }

    @Override
    public boolean updateBatchById(Collection<CookbookDO> entityList, int batchSize) {
        return false;
    }

    @Override
    public boolean saveOrUpdate(CookbookDO entity) {
        return false;
    }

    @Override
    public CookbookDO getOne(Wrapper<CookbookDO> queryWrapper, boolean throwEx) {
        return null;
    }

    @Override
    public Map<String, Object> getMap(Wrapper<CookbookDO> queryWrapper) {
        return null;
    }

    @Override
    public <V> V getObj(Wrapper<CookbookDO> queryWrapper, Function<? super Object, V> mapper) {
        return null;
    }
}
