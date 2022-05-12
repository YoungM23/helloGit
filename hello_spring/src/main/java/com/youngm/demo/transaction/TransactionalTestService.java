package com.youngm.demo.transaction;

import com.youngm.demo.transaction.mapper.OperatorMapper;
import com.youngm.demo.transaction.mapper.StationMapper;
import com.youngm.demo.transaction.pojo.Operator;
import com.youngm.demo.transaction.pojo.Station;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * @author zqh
 * @date 2022-05-12 15:17
 */
@Service
public class TransactionalTestService {
    
    @Resource
    private StationMapper stationMapper;
    
    @Resource
    private OperatorMapper operatorMapper;

    /**
     * 加了 @Transactional注解的方法中，只有等方法体总共的逻辑执行完成，没有报错，才会提交事务。
     * 期间删除了某条数据，还没提交事务的时候，在数据库中这条数据是存在的，其他线程对这条数据的操作不影响。
     * 如果方法执行时有报错，这事务会回滚，数据库数据不影响。
     */
    @Transactional
    public  void doStation(){
        Station station = stationMapper.selectById(1);
        stationMapper.deleteById(station);
//        int i = 1/0;
        Operator operator = operatorMapper.selectById(1001);
        System.out.println(operator);
    }
}
