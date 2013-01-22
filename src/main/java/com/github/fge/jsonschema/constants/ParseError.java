package com.github.fge.jsonschema.constants;

import com.google.common.collect.ImmutableSet;

import java.util.Set;

public final class ParseError
{
    private ParseError()
    {
    }

    public static final String LINE = "line";
    public static final String COLUMN = "column";

    public static final Set<String> ALL_FIELDS = ImmutableSet.of(LINE, COLUMN);
}