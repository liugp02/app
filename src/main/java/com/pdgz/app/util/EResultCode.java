package com.pdgz.app.util;

/**
 * rest 接口返回状态码
 */
public enum EResultCode {
    success("000000"),//成功
    error("100101"),//系统异常
    paramError("100102"),//系统异常
    ;

    public String code;

    EResultCode(String code) {
        this.code = code;
    }
}
