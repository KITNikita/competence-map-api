package com.competence.map.mapper;

public interface Mapper<V, E> {

  V toView(E entity);

  E toEntity(V view);
}
