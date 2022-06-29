package com.cg.program3;

import java.util.Comparator;

public class nameComp implements Comparator<Employees> {

    @Override
    public int compare(Employees o1, Employees o2) {
        return o1.getName().compareTo(o2.getName());
    }

}

