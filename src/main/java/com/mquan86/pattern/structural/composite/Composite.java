package com.mquan86.pattern.structural.composite;

import java.util.List;

/**
 * @author Minh Quan Pham (mquan86@gmail.com)
 *
 */
public class Composite implements Component {
    private List<Component> components;

    @Override
    public void operation() {}

    public List<Component> getComponents() {
        return components;
    }

    public void setComponents(List<Component> components) {
        this.components = components;
    }

}
