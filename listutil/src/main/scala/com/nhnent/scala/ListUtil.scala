package com.nhnent.scala

object ListUtil {
  // Sublists and element access
  def length[T](xs: List[T]): Int = xs match {
    case List() => 0
    case y :: ys => 1 + length(ys)
  }

  def last[T](xs: List[T]): T = xs match {
    case List() => throw new Error("Empty List")
    case List(x) => x
    case y :: ys => last(ys)
  }

  def init[T](xs: List[T]): List[T] = xs match {
    case List() => throw new Error("Empty List")
    case List(x) => Nil
    case y :: ys => y :: init(ys)
  }

  def take[T](xs: List[T], n: Int): List[T] =
    if (n == 0) Nil
    else xs match {
      case List() => Nil
      case y :: ys => y :: take(ys, n - 1)
    }

  def drop[T](xs: List[T], n: Int): List[T] =
    if (n == 0) xs
    else xs match {
      case List() => Nil
      case y :: ys => drop(ys, n - 1)
    }

  def index[T](xs: List[T], n: Int): T = xs match {
    case List() => throw new Error("Out of Index")
    case y :: ys => if (n == 0) y else index(ys, n - 1)
  }

  // Creating new lists
  def concat[T](xs: List[T], ys: List[T]): List[T] = xs match {
    case List() => ys
    case z :: zs => z :: concat(zs, ys)
 }

  def reverse[T](xs: List[T]): List[T] = xs match {
    case List() => xs
    case y :: ys => reverse(ys) ++ List(y)
  }
}
