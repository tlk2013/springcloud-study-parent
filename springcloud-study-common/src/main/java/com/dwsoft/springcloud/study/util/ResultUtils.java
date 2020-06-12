package com.dwsoft.springcloud.study.util;

/**
 * @author tlk
 * @date 2020/6/8-18:21
 */
public class ResultUtils<T> {
    private String result;
    private String message;
    private T data;
    private static final String SUCCESS="SUCCESS";
    private static final String FAILED="FAILED";
    public static final String NO_MESSAGE = "NO_MESSAGE";
    public static final String NO_DATA = "NO_DATA";
    //成功无数据
    public static ResultUtils<String> successWithNoData(){

        return new ResultUtils<String>(SUCCESS,NO_MESSAGE,NO_DATA);
    }
    //成功有数据
    public static <E>ResultUtils<E> successWithData(E data){

        return new ResultUtils<E>(SUCCESS,NO_MESSAGE,data);
    }

    //失败有信息
    public static <F>ResultUtils<F> faileWith(String message){

        return new ResultUtils(FAILED,message,null);
    }

    public ResultUtils() {
    }

    public ResultUtils(String result, String message, T data) {
        this.result = result;
        this.message = message;
        this.data = data;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
