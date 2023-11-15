package com.atguigu.bo;

/**
 * @author zqh
 * @date 2023-11-14 17:17
 */
public class Department {
    String name;
    String path;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public Department() {
    }

    @Override
    public String toString() {
        return "Department{" +
                "name='" + name + '\'' +
                ", path='" + path + '\'' +
                '}';
    }

    public Department(String name, String path) {
        this.name = name;
        this.path = path;
    }
}
