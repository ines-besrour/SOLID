package com.directi.training.ocp.exercise_refactored;

public interface IResourceAllocator {
    int allocate();
    void free(int resourceId);
}
