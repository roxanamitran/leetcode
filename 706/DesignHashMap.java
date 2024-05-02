package MasterOfTheCode_LeetCode;

public class DesignHashMap {
    private int[] elements;

    public DesignHashMap() {
        this.elements = new int[1000001];
        for(int i = 0; i < 1000001; i++) {
            elements[i] = -1;
        }
    }

    public void put(int key, int value) {
        elements[key] = value;
    }

    public int get(int key) {
        return elements[key];
    }

    public void remove(int key) {
        elements[key] = -1;
    }
}
