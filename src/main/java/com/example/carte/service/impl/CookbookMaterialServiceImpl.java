package com.example.carte.service.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.carte.mapper.CookbookMaterialMapper;
import com.example.carte.model.CookbookMaterialDO;
import com.example.carte.service.CookbookMaterialService;
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
public class CookbookMaterialServiceImpl extends ServiceImpl<CookbookMaterialMapper, CookbookMaterialDO> implements CookbookMaterialService {

    @Override
    public boolean saveBatch(Collection<CookbookMaterialDO> entityList, int batchSize) {
        return false;
    }

    @Override
    public boolean saveOrUpdateBatch(Collection<CookbookMaterialDO> entityList, int batchSize) {
        return false;
    }

    @Override
    public boolean updateBatchById(Collection<CookbookMaterialDO> entityList, int batchSize) {
        return false;
    }

    @Override
    public boolean saveOrUpdate(CookbookMaterialDO entity) {
        return false;
    }

    @Override
    public CookbookMaterialDO getOne(Wrapper<CookbookMaterialDO> queryWrapper, boolean throwEx) {
        return null;
    }

    @Override
    public Map<String, Object> getMap(Wrapper<CookbookMaterialDO> queryWrapper) {
        return null;
    }

    @Override
    public <V> V getObj(Wrapper<CookbookMaterialDO> queryWrapper, Function<? super Object, V> mapper) {
        return null;
    }
}
