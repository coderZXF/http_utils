package com.zxf.httpclient.common.utils;

public class HttpClientUtils {

    //编码格式，发送编码格式统一用UTF-8
    private static final String ENCODING = "UTF-8";

    //连接超时时间，单位毫秒
    private static final long CONNECT_TIMEOUT = 6000;

    //请求获取数据超时时间（即响应时间），单位毫秒
    private static final long SOCKET_TIMEOUT = 6000;

    /**
     * 发送Get请求，不带请求头和请求参数
     * @param url
     * @return
     * @throws Exception
     */
    public static HttpClientResult doGet(String url) throws Exception{

        return doGet(url,null,null);
    }







}
