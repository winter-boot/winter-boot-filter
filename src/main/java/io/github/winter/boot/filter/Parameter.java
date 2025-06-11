package io.github.winter.boot.filter;

import io.github.winter.boot.tuple.Value;

import java.io.Serializable;
import java.util.Optional;

/**
 * 参数
 *
 * @author changebooks@qq.com
 */
public final class Parameter implements Serializable {
    /**
     * 名称
     */
    private String name;

    /**
     * 值
     */
    private Value value;

    @Override
    public String toString() {
        String name = getName();
        Class<?> type = getType();
        Value value = getValue();
        return "{\"name\": \"%s\", \"type\": \"%s\", \"value\": \"%s\"}"
                .formatted(name, type, Optional.ofNullable(value).map(Value::toString).orElse(""));
    }

    public String getName() {
        return name != null ? name : "";
    }

    public void setName(String name) {
        this.name = name != null ? name.trim() : "";
    }

    public Class<?> getType() {
        return value != null ? value.getType() : Object.class;
    }

    public Value getValue() {
        return value;
    }

    public void setValue(Value value) {
        this.value = value;
    }

}
