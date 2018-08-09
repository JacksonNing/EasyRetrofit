package com.yhfund.net;

import io.reactivex.annotations.Nullable;

public interface SubscriberInterface<T> {

    void doOnNext(@Nullable T val);

    void doOnError(@Nullable Throwable throwable);
}
