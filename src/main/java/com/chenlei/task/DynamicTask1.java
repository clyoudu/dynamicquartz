package com.chenlei.task;

import com.chenlei.util.DateUtil;
import org.springframework.stereotype.Component;

/**
 * Created by chenlei on 2017/8/28.
 */
@Component("DynamicTask1")
public class DynamicTask1 implements DynamicTask {
    public void run() {
        System.out.println(DateUtil.nowDateStr() + this.getClass().getName());
    }
}
