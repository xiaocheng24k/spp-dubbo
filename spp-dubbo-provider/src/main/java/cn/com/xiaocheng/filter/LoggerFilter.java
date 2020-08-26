package cn.com.xiaocheng.filter;

import com.alibaba.dubbo.rpc.*;
import com.alibaba.dubbo.rpc.service.GenericService;
import com.alibaba.fastjson.JSON;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggerFilter implements Filter {

    private static final Logger logger = LoggerFactory.getLogger(LoggerFilter.class);

    @Override
    public Result invoke(Invoker<?> invoker, Invocation invocation) throws RpcException {

        long startTime = System.currentTimeMillis();
        //invoke调用
        Result result = invoker.invoke(invocation);
        if(result.hasException() && invoker.getInterface() != GenericService.class) {

        }
        //响应处理
        long elapsed = System.currentTimeMillis() - startTime;
        logger.info("\n[Cost] {}ms \n[Method] {} \n[Interface] {} \n[Params] {} \n[Result] {} ",
                elapsed,
                invocation.getMethodName(),
                invocation.getInvoker().getInterface().getName(),
                JSON.toJSONString(invocation.getArguments()),
                JSON.toJSONString(result.getValue())
        );
        return result;
    }
}
