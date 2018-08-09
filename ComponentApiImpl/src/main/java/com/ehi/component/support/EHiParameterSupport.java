package com.ehi.component.support;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

import java.util.Set;

/**
 * time   : 2018/08/09
 *
 * @author : xiaojinzi 30212
 */
public class EHiParameterSupport {

    public static final String PREFIX = "EHiRouterParameter";
    public static final String KEY_BUNDLE = "EHiRouterBundle";

    @Nullable
    public static String getString(@NonNull Intent intent, @NonNull String key, String defaultValue) {

        Bundle routerParameterBundle = intent.getBundleExtra(KEY_BUNDLE);
        if (routerParameterBundle == null) {
            return null;
        }

        // may be null
        String value = routerParameterBundle.getString(PREFIX + key);

        if (value == null) {
            return defaultValue;
        }

        return value;
    }

    @Nullable
    public static Integer getInt(@NonNull Intent intent, @NonNull String key, Integer defaultValue) {

        Bundle routerParameterBundle = intent.getBundleExtra(KEY_BUNDLE);
        if (routerParameterBundle == null) {
            return null;
        }

        // may be null
        String value = routerParameterBundle.getString(PREFIX + key);

        if (value == null) {
            return defaultValue;
        }

        try {
            return Integer.valueOf(value);
        } catch (Exception ignore) {
            return null;
        }
    }

    @Nullable
    public static Long getLong(@NonNull Intent intent, @NonNull String key, Long defaultValue) {

        Bundle routerParameterBundle = intent.getBundleExtra(KEY_BUNDLE);
        if (routerParameterBundle == null) {
            return null;
        }

        // may be null
        String value = routerParameterBundle.getString(PREFIX + key);

        if (value == null) {
            return defaultValue;
        }

        try {
            return Long.valueOf(value);
        } catch (Exception ignore) {
            return null;
        }

    }

    @Nullable
    public static Double getDouble(@NonNull Intent intent, @NonNull String key, Double defaultValue) {

        Bundle routerParameterBundle = intent.getBundleExtra(KEY_BUNDLE);
        if (routerParameterBundle == null) {
            return null;
        }

        // may be null
        String value = routerParameterBundle.getString(PREFIX + key);

        if (value == null) {
            return defaultValue;
        }

        try {
            return Double.valueOf(value);
        } catch (Exception ignore) {
            return null;
        }
    }

    @Nullable
    public static Float getFloat(@NonNull Intent intent, @NonNull String key, Float defaultValue) {

        Bundle routerParameterBundle = intent.getBundleExtra(KEY_BUNDLE);
        if (routerParameterBundle == null) {
            return null;
        }

        // may be null
        String value = routerParameterBundle.getString(PREFIX + key);

        if (value == null) {
            return defaultValue;
        }

        try {
            return Float.valueOf(value);
        } catch (Exception ignore) {
            return null;
        }
    }

    @Nullable
    public static Boolean getBoolean(@NonNull Intent intent, @NonNull String key, Boolean defaultValue) {

        Bundle routerParameterBundle = intent.getBundleExtra(KEY_BUNDLE);
        if (routerParameterBundle == null) {
            return null;
        }

        // may be null
        String value = routerParameterBundle.getString(PREFIX + key);

        if (value == null) {
            return defaultValue;
        }

        try {
            return Boolean.valueOf(value);
        } catch (Exception ignore) {
            return null;
        }
    }

    @Nullable
    public static Short getShort(@NonNull Intent intent, @NonNull String key, Short defaultValue) {

        Bundle routerParameterBundle = intent.getBundleExtra(KEY_BUNDLE);
        if (routerParameterBundle == null) {
            return null;
        }

        // may be null
        String value = routerParameterBundle.getString(PREFIX + key);

        if (value == null) {
            return defaultValue;
        }

        try {
            return Short.valueOf(value);
        } catch (Exception ignore) {
            return null;
        }
    }

    @Nullable
    public static Byte getByte(@NonNull Intent intent, @NonNull String key, Byte defaultValue) {

        Bundle routerParameterBundle = intent.getBundleExtra(KEY_BUNDLE);
        if (routerParameterBundle == null) {
            return null;
        }

        // may be null
        String value = routerParameterBundle.getString(PREFIX + key);

        if (value == null) {
            return defaultValue;
        }

        try {
            return Byte.valueOf(value);
        } catch (Exception ignore) {
            return null;
        }
    }

    public static void put(@NonNull Intent intent, @NonNull Uri uri) {
        Bundle routerParameterBundle = new Bundle();
        Set<String> queryParameterNames = uri.getQueryParameterNames();
        if (queryParameterNames != null) {
            for (String key : queryParameterNames) {
                String value = uri.getQueryParameter(key);
                routerParameterBundle.putString(PREFIX + key, value);
            }
        }
        intent.putExtra(KEY_BUNDLE, routerParameterBundle);
    }

}
