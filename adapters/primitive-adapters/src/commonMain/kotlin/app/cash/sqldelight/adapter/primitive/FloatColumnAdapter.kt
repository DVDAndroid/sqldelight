package app.cash.sqldelight.adapter.primitive

import app.cash.sqldelight.ColumnAdapter
import app.cash.sqldelight.Transacter

object FloatColumnAdapter : ColumnAdapter<Float, Double> {
  override fun decode(database: Transacter?, databaseValue: Double): Float = databaseValue.toFloat()

  override fun encode(value: Float): Double = value.toDouble()
}
