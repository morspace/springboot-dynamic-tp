package com.souche.springboot.dynamic.tp.web;

import com.dtp.core.DtpRegistry;
import com.dtp.core.thread.DtpExecutor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author mojianhan
 * @date 2023-04-12
 */

@Slf4j
@RestController
@SuppressWarnings("all")
public class TestController {

    @Value("${data.value}")
    String dateValue;


    @GetMapping("test")
    public String hello() {
        return dateValue;
    }

    @GetMapping("/dtp/test")
    public String test() {
        new Thread(() -> {
            try {
                task();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
        return "success";
    }

    public void task() throws InterruptedException {
        DtpExecutor dtpExecutor1 = DtpRegistry.getDtpExecutor("dtpExecutor1");
        for (int i = 0; i < 500; i++) {
            dtpExecutor1.execute(() -> {
                try {
                    log.info("i am dtpExecutor1 task");
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
        }
    }
}
