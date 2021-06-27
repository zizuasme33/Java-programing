package day57_abstaction_polymorphism.abstract_class_vs_interface;

import java.io.Serializable;

public interface InterfaceB extends InterfaceA, Serializable, Cloneable {
    // interface can only EXTENDS multiple other interface, can not implements extends
}
