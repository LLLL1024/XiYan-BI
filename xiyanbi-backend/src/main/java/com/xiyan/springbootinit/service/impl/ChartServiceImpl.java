package com.xiyan.springbootinit.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xiyan.springbootinit.model.entity.Chart;
import com.xiyan.springbootinit.service.ChartService;
import com.xiyan.springbootinit.mapper.ChartMapper;
import org.springframework.stereotype.Service;

/**
* @author 罗文俊
* @description 针对表【chart(图表信息表)】的数据库操作Service实现
* @createDate 2024-08-28 15:31:23
*/
@Service
public class ChartServiceImpl extends ServiceImpl<ChartMapper, Chart>
    implements ChartService{

}




