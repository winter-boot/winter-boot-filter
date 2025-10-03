package io.github.winter.boot.filter;

import java.util.List;

/**
 * 在列表中？
 *
 * @author changebooks@qq.com
 */
public class InFilter extends FilterNot {
    /**
     * 子查询
     */
    private String sql;

    /**
     * 参数列表
     */
    private List<Parameter> parameters;

    @Override
    public String toString() {
        Boolean or = getOr();
        String name = getName();
        Boolean not = getNot();
        String sql = getSql();
        List<Parameter> parameters = getParameters();
        return "{\"or\": %s, \"name\": \"%s\", \"not\": %s, \"sql\": \"%s\", \"parameters\": %s}".formatted(or, name, not, sql, parameters);
    }

    public String getSql() {
        return sql != null ? sql : "";
    }

    public void setSql(String sql) {
        this.sql = sql != null ? sql.trim() : "";
    }

    public List<Parameter> getParameters() {
        return parameters;
    }

    public void setParameters(List<Parameter> parameters) {
        this.parameters = parameters;
    }

}
