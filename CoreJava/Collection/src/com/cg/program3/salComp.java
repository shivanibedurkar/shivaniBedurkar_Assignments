package com.cg.program3;

import java.util.Comparator;

public class salComp implements Comparator<Employees> {

    @Override
    public int compare(Employees o1, Employees o2) {
        if (o1.getSalary() > o2.getSalary()) {
            return 1;
        } else {
            return -1;
        }

    }

}
