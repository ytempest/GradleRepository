package com.ytempest.gradlerepository;

/**
 * @author heqidu
 * @since 2019/12/3
 */
public class PhoneBean {
    private String name;
    private String description;

    public PhoneBean(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
