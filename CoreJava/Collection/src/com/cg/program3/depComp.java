package com.cg.program3;

import java.util.Comparator;

public class depComp implements Comparator<Employees>{

    @Override
    public int compare(Employees o1, Employees o2) {
        return o1.getDepartment().compareTo(o2.getDepartment());
    }

}
