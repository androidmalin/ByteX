package com.ss.android.ugc.bytex.const_inline;

import com.ss.android.ugc.bytex.common.BaseExtension;

import java.util.HashSet;

/**
 * https://github.com/androidmalin/ByteX/blob/master/wiki/ByteX-Developer-API-zh.md
 * Extension,它是一个数据结构,对应于插件在app工程里的配置信息.
 * 对应 example/plugin-bytex.gradle
 * apply plugin: 'bytex.const_inline'
 * const_inline {
 * }
 */
public class ConstInlineExtension extends BaseExtension {
    /**
     * 使用插件内置的反射检查过滤掉可能的反射常量，建议为true
     */
    private boolean autoFilterReflectionField = false;

    /**
     * 使用插件内置字符串匹配可能反射常量，建议为false
     */
    private boolean supposesReflectionWithString = false;

    /**
     * 过滤掉带有运行时注解的常量，推荐true
     */
    private boolean skipWithRuntimeAnnotation = true;

    private HashSet<String> skipWithAnnotations = new HashSet<>();

    /**
     * The classes in the whiteList will skip check
     * Format:ClassName.FieldName.FieldDesc
     * Support pattern matching
     * such as "com/meizu/cloud/*"
     */
    private HashSet<String> whiteList = new HashSet<>();

    @Override
    public String getName() {
        return "const_inline";
    }

    public HashSet<String> getWhiteList() {
        return whiteList;
    }

    public void setWhiteList(HashSet<String> whiteList) {
        this.whiteList = whiteList;
    }

    public boolean isAutoFilterReflectionField() {
        return autoFilterReflectionField;
    }

    public void setAutoFilterReflectionField(boolean autoFilterReflectionField) {
        this.autoFilterReflectionField = autoFilterReflectionField;
    }

    public boolean isSupposesReflectionWithString() {
        return supposesReflectionWithString;
    }

    public void setSupposesReflectionWithString(boolean supposesReflectionWithString) {
        this.supposesReflectionWithString = supposesReflectionWithString;
    }

    public HashSet<String> getSkipWithAnnotations() {
        return skipWithAnnotations;
    }

    public void setSkipWithAnnotations(HashSet<String> skipWithAnnotations) {
        this.skipWithAnnotations = skipWithAnnotations;
    }

    public boolean isSkipWithRuntimeAnnotation() {
        return skipWithRuntimeAnnotation;
    }

    public void setSkipWithRuntimeAnnotation(boolean skipWithRuntimeAnnotation) {
        this.skipWithRuntimeAnnotation = skipWithRuntimeAnnotation;
    }
}
