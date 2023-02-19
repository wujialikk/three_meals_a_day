package com.example.carte.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.carte.service.MaterialService;
import net.xdclass.mapper.MaterialMapper;
import net.xdclass.model.MaterialDO;
import org.springframework.stereotype.Service;

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

}
