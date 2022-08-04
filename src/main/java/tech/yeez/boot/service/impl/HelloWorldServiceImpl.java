package tech.yeez.boot.service.impl;

import tech.yeez.boot.model.entity.HelloWorld;
import tech.yeez.boot.mapper.HelloWorldMapper;
import tech.yeez.boot.service.IHelloWorldService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author xiangbin
 * @since 
 */
@Service
public class HelloWorldServiceImpl extends ServiceImpl<HelloWorldMapper, HelloWorld> implements IHelloWorldService {

}
