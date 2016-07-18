package com.yoreay.design.patterns.iterator;

import java.util.Iterator;
import java.util.List;

/**
 * Created by sanze on 2016/7/18.
 */
public class PancakeHouseMenuIterator implements Iterator {
    List<MenuItem> list;
    int position = 0;

    public PancakeHouseMenuIterator(List<MenuItem> list) {
        this.list = list;
    }

    @Override
    public boolean hasNext() {
        if (position >= list.size() || list.get(position) == null) {
            return false;
        }
        return true;
    }

    @Override
    public Object next() {
        MenuItem menuItem = list.get(position);
        position += 1;
        return menuItem;
    }

    @Override
    public void remove() {

    }
}
