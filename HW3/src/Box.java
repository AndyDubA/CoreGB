import java.util.ArrayList;
import java.util.Arrays;

public class Box<C extends Fruit> {
    private final ArrayList<C> items;

    @SafeVarargs
    public Box(C... items) {
        this.items = new ArrayList<>(Arrays.asList(items));
    }

    @SafeVarargs
    public final void add(C... items) {
        this.items.addAll(Arrays.asList(items));
    }

    public void clear() {
        items.clear();
    }

    public float getWeight() {
        if (items.size() == 0) return 0;
        float weight = 0;
        for (C item: items) weight += item.getWeight();
        return weight;
    }

    public boolean compare(Box box) {
        return this.getWeight() == box.getWeight();
    }

    public void change(Box<? super C> box) {
        box.items.addAll(this.items);
        clear();
    }
}