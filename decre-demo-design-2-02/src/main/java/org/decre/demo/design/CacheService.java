package org.decre.demo.design;

import org.decre.demo.design.fcactroy.ICacheAdapter;

import java.util.concurrent.TimeUnit;

public interface CacheService {

    String get(final String key);

    void set(String key, String value);

    void set(String key, String value, long timeout, TimeUnit timeUnit);

    void del(String key);

}
