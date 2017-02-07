package dk.cphbusiness.util;

public class LinkedPath<T> implements Path<T> {
  private final T first;
  private final Path<T> rest;
  
  public LinkedPath(T first, Path<T> rest) {
    this.first = first;
    this.rest = rest;
    }
  
  public LinkedPath(T first, T... elements) {
    this.first = first;
    if (elements.length == 0) rest = null;
    else rest = new LinkedPath(0, elements);
    }

  private LinkedPath(int index, T[] elements) {
    this.first = elements[index];
    if (index == elements.length - 1) rest = null;
    else rest = new LinkedPath(index + 1, elements);
    }

  @Override
  public T getFirst() { return first; }

  @Override
  public Path<T> getRest() { return rest; }

  }
