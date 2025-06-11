package io.github.winter.boot.filter;

/**
 * 条件
 *
 * @author changebooks@qq.com
 */
public class Filter extends BaseFilter {
    /**
     * 名称
     */
    private String name;

    @Override
    public String toString() {
        Boolean or = getOr();
        String name = getName();
        return "{\"or\": %s, \"name\": \"%s\"}".formatted(or, name);
    }

    public String getName() {
        return name != null ? name : "";
    }

    public void setName(String name) {
        this.name = name != null ? name.trim() : "";
    }

}
