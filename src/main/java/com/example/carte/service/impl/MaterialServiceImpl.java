package com.example.carte.service.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.carte.mapper.MaterialMapper;
import com.example.carte.model.MaterialDO;
import com.example.carte.service.MaterialService;
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
public class MaterialServiceImpl extends ServiceImpl<MaterialMapper, MaterialDO> implements MaterialService {

    @Override
    public boolean saveBatch(Collection<MaterialDO> entityList, int batchSize) {
        return false;
    }

    @Override
    public boolean saveOrUpdateBatch(Collection<MaterialDO> entityList, int batchSize) {
        return false;
    }

    @Override
    public boolean updateBatchById(Collection<MaterialDO> entityList, int batchSize) {
        return false;
    }

    @Override
    public boolean saveOrUpdate(MaterialDO entity) {
        return false;
    }

    @Override
    public MaterialDO getOne(Wrapper<MaterialDO> queryWrapper, boolean throwEx) {
        return null;
    }

    @Override
    public Map<String, Object> getMap(Wrapper<MaterialDO> queryWrapper) {
        return null;
    }

    @Override
    public <V> V getObj(Wrapper<MaterialDO> queryWrapper, Function<? super Object, V> mapper) {
        return null;
    }

    @Override
    public Class<MaterialDO> getEntityClass() {
        return null;
    }
}
