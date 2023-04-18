package com.souche.springboot.dynamic.tp.config;

import com.dtp.common.em.QueueTypeEnum;
import com.dtp.common.em.RejectedTypeEnum;
import com.dtp.core.support.ThreadPoolBuilder;
import com.dtp.core.thread.DtpExecutor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.concurrent.ThreadPoolExecutor;

/**
 * @author mojianhan
 * @date 2023-04-12
 */
@Configuration
public class DtpConfig {

//    @Bean
//    public ThreadPoolExecutor dtpExecutor2() {
//        return ThreadPoolBuilder.newBuilder()
//                .threadPoolName("dynamic-tp-test-2")
//                .corePoolSize(6)
//                .maximumPoolSize(12)
//                .keepAliveTime(40)
//                .allowCoreThreadTimeOut(true)
//                .workQueue(QueueTypeEnum.SYNCHRONOUS_QUEUE.getName(), null, false)
//                .rejectedExecutionHandler(RejectedTypeEnum.CALLER_RUNS_POLICY.getName())
//                .buildDynamic();
//    }
}
