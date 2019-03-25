package attacks;

public class Element {
    public static final int NONE = 0;
    public static final int FIRE = 1;
    public static final int WATER = 2;
    public static final int EARTH = 3;
    public static final int LIGHT = 4;
    public static final int DARK = 5;

    private int element;

    public Element(int _element) {
        element = _element;
    }

    public int getElement() {
        return element;
    }

    public boolean equals(Element e) {
        return (this.element == e.getElement());
    }
}
