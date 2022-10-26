package me.hibiki.chapter03;

/**
 * @author koukoukon
 * @date 2022/10/10 12:37
 */
public class ContainerAndComponent {

}

class Container {
    Component component;

    public void addComponent() {
        component = new Component(this);
    }
}

class Component {
    Container container;

    public Component(Container container) {
        this.container = container;
    }
}
