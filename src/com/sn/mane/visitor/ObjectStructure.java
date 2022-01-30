package com.sn.mane.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * Holds objects in structure. Provides interface to allow visitors to visit its
 * elements.
 *
 */
public class ObjectStructure {

    private List<Element> children = new ArrayList<>();

    public void add(Element element) {
        children.add(element);
    }

    public void remove(Element element) {
        children.remove(element);
    }

    public Element getChild(int index) {
        return children.get(index);
    }

    public void acceptAll(Visitor visitor) {
        children.forEach(element -> {
            element.accept(visitor);
        });
    }
}
