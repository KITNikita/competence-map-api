package com.competence.map.util;

import java.util.Collection;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public final class ListUtils {

  private ListUtils() {
    throw new UnsupportedOperationException();
  }

  public static <T, R> List<R> map(Collection<T> list, Function<T, R> mapper) {
    return list.stream()
        .map(mapper)
        .collect(Collectors.toList());
  }
}
