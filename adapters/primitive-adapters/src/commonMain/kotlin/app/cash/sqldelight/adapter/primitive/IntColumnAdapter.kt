package app.cash.sqldelight.adapter.primitive

import app.cash.sqldelight.ColumnAdapter
import app.cash.sqldelight.Transacter

object IntColumnAdapter : ColumnAdapter<Int, Long> {
  override fun decode(database: Transacter?, databaseValue: Long): Int = databaseValue.toInt()

  override fun encode(value: Int): Long = value.toLong()
}
