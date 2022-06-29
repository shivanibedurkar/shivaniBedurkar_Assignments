package com.cg.program3;

import java.util.Comparator;

public class idComp implements Comparator<Employees> {

    @Override
    public int compare(Employees o1, Employees o2) {
        if (o1.getId() > o2.getId()) {
            return 1;
        } else {
            return -1;
        }
    }


}
