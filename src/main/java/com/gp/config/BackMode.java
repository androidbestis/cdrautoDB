package com.gp.config;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Map;

/**
 * 返回参数
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class BackMode {

    private int code;
    private Map data;
    private String  msg;

    public static BackMode emptyExamine(String paramname){
        BackMode bm = new BackMode();
        bm.setCode(400);
        bm.setMsg(paramname + "不能为空!");
        bm.setData(null);
        return bm;
    }

}
