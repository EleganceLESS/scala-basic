package com.nhnent.scala

import org.scalatest.FunSuite

class RationalTest extends FunSuite {
  test("create rational number") {
    assert(new Rational(1, 2) == new Rational(1, 2))
  }

  test("reduction of fraction") {
    assert(new Rational(2, 4) == new Rational(1, 2))
  }

  test("negative numer, denom") {
    assert(new Rational(-2, -4) == new Rational(1, 2))
  }

  test("default denominator") {
    assert(new Rational(3) == new Rational(3, 1))
  }

  test("add two rational numbers") {
    val r = new Rational(1, 2)
    val s = new Rational(1, 3)
    assert(r + s == new Rational(5, 6))
  }

  test("add two rational numbers (2)") {
    val r = new Rational(1, 2)
    val s = new Rational(-1, 3)
    assert(r + s == new Rational(1, 6))
  }

  test("add rational number and integer") {
    val r = new Rational(1, 2)
    assert(r + 1 == new Rational(3, 2))
    assert(1 + r == new Rational(3, 2))
  }

  test("sub two rational numbers") {
    val r = new Rational(1, 2)
    val s = new Rational(1, 3)
    assert(r - s == new Rational(1, 6))
  }

  test("sub two rational numbers (2)") {
    val r = new Rational(1, 2)
    val s = new Rational(-1, 3)
    assert(r - s == new Rational(5, 6))
  }

  test("sub rational number and integer") {
    val r = new Rational(3, 2)
    assert(r - 1 == new Rational(1, 2))
    assert(1 - r == new Rational(-1, 2))
  }

  test("multiple two rational numbers") {
    val r = new Rational(1, 2)
    val s = new Rational(1, 3)
    assert(r * s == new Rational(1, 6))
  }

  test("multiple two rational numbers (2)") {
    val r = new Rational(-1, 2)
    val s = new Rational(1, 3)
    assert(r * s == new Rational(-1, 6))
  }

  test("multiple two rational numbers (3)") {
    val r = new Rational(-1, 2)
    val s = new Rational(-1, 3)
    assert(r * s == new Rational(1, 6))
  }

  test("multiple rational number and integer") {
    val r = new Rational(3, 2)
    assert(r * 2 == new Rational(3))
    assert(3 * r == new Rational(9, 2))
  }

  test("divide two rational numbers") {
    val r = new Rational(1, 2)
    val s = new Rational(1, 3)
    assert(r / s == new Rational(3, 2))
  }

  test("divide two rational numbers (2)") {
    val r = new Rational(-1, 2)
    val s = new Rational(1, 3)
    assert(r / s == new Rational(-3, 2))
  }

  test("divide two rational numbers (3)") {
    val r = new Rational(-1, 2)
    val s = new Rational(-1, 3)
    assert(r / s == new Rational(3, 2))
  }

  test("divide rational number and integer") {
    val r = new Rational(3, 2)
    assert(r / 2 == new Rational(3, 4))
    assert(3 / r == new Rational(2))
  }
}
