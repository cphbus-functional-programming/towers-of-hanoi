package dk.cphbusiness.util;

public interface Path<T> {
  T getFirst();
  Path<T> getRest();
  }
