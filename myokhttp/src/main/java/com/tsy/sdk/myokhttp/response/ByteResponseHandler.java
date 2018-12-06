package com.tsy.sdk.myokhttp.response;

import okhttp3.Response;

/**
 * raw 字符串结果回调
 * Created by tsy on 16/8/18.
 */
public abstract class ByteResponseHandler implements IResponseHandler {

    public abstract void onSuccess(int statusCode, Response response);

    @Override
    public void onProgress(long currentBytes, long totalBytes) {

    }
}
