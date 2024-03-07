package com.directi.training.dip.exercice_refactored;

import java.util.HashMap;
import java.util.Map;

public interface IDatabase {
    static Map<Integer, String> _data = new HashMap<>();
    static int _count = 0;

    public int write(String inputString);
}
