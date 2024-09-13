package com.xiyan.springbootinit.model.enums;

import lombok.Getter;

/**
 * 图表状态枚举类
 */
@Getter
public enum ResultEnum {
    WAIT("wait"),
    RUNNING("running"),
    SUCCEED("succeed"),
    FAILED("failed");

    private final String des;

    ResultEnum(String des) {
        this.des = des;
    }
}