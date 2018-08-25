package com.wwjswly.entity;

import lombok.Data;

import java.util.Date;

/**
 * Created by Javaer on 2018/8/25.
 */
@Data
public class Message {
    private long id;
    private String msg;
    private Date sendTime;

}
