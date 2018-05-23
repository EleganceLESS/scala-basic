package com.nhnent.scala

import org.scalatest.FunSuite

class ListUtilTest extends FunSuite{
  test("length of List") {
    assert(ListUtil.length(List()) == 0)
    assert(ListUtil.length(List(1)) == 1)
    assert(ListUtil.length(List(1, 2)) == 2)
    assert(ListUtil.length(List(1, 2, 3)) == 3)
  }

  test("last of List") {
    assert(ListUtil.last(List(1)) == 1)
    assert(ListUtil.last(List(1, 2)) == 2)
    assert(ListUtil.last(List(1, 2, 3)) == 3)
  }

  test("init of List") {
    assert(ListUtil.init(List(1)) == List())
    assert(ListUtil.init(List(1, 2)) == List(1))
    assert(ListUtil.init(List(1, 2, 3)) == List(1, 2))
  }

  test("take List") {
    assert(ListUtil.take(List(), 1) == List())
    assert(ListUtil.take(List(1), 1) == List(1))
    assert(ListUtil.take(List(1), 2) == List(1))
    assert(ListUtil.take(List(1, 2), 1) == List(1))
    assert(ListUtil.take(List(1, 2), 2) == List(1, 2))
    assert(ListUtil.take(List(1, 2), 3) == List(1, 2))
  }

  test("drop List") {
    assert(ListUtil.drop(List(), 1) == List())
    assert(ListUtil.drop(List(1), 1) == List())
    assert(ListUtil.drop(List(1), 2) == List())
    assert(ListUtil.drop(List(1, 2), 1) == List(2))
    assert(ListUtil.drop(List(1, 2), 2) == List())
    assert(ListUtil.drop(List(1, 2, 3), 1) == List(2, 3))
    assert(ListUtil.drop(List(1, 2, 3), 2) == List(3))
  }

  test("index of List") {
    assert(ListUtil.index(List(1), 0) == 1)
    assert(ListUtil.index(List(1, 2), 0) == 1)
    assert(ListUtil.index(List(1, 2), 1) == 2)
    assert(ListUtil.index(List(1, 2, 3), 0) == 1)
    assert(ListUtil.index(List(1, 2, 3), 1) == 2)
    assert(ListUtil.index(List(1, 2, 3), 2) == 3)
  }

  test("concat List") {
    assert(ListUtil.concat(List(), List()) == List())
    assert(ListUtil.concat(List(), List(1)) == List(1))
    assert(ListUtil.concat(List(1), List()) == List(1))
    assert(ListUtil.concat(List(1), List(2)) == List(1, 2))
    assert(ListUtil.concat(List(), List(1, 2)) == List(1, 2))
    assert(ListUtil.concat(List(1, 2), List()) == List(1, 2))
    assert(ListUtil.concat(List(1, 2), List(3, 4)) == List(1, 2, 3, 4))
  }

  test("reverse List") {
    assert(ListUtil.reverse(List()) == List())
    assert(ListUtil.reverse(List(1)) == List(1))
    assert(ListUtil.reverse(List(1, 2)) == List(2, 1))
    assert(ListUtil.reverse(List(1, 2, 3)) == List(3, 2, 1))
  }
}

