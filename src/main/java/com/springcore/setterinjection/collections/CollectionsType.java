package com.springcore.setterinjection.collections;

import java.util.*;

public class CollectionsType {
    private Set<String> name;
    private List<Integer> id;
    private Map<String,String> subject;
    private Properties properties;

    public Set<String> getName() {
        return name;
    }

    public void setName(Set<String> name) {
        this.name = name;
    }

    public List<Integer> getId() {
        return id;
    }

    public void setId(List<Integer> id) {
        this.id = id;
    }

    public Map<String, String> getSubject() {
        return subject;
    }

    public void setSubject(Map<String, String> subject) {
        this.subject = subject;
    }

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }
}
