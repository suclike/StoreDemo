package com.nytimes.storedemo.model;

import org.immutables.gson.Gson;
import org.immutables.value.Value;

import java.util.List;

/**
 * Created by brianplummer on 12/19/15.
 */
@Value.Immutable
public abstract class Children {
    public abstract PostData data();
}