package app.cash.sqldelight.adapter.primitive

import app.cash.sqldelight.ColumnAdapter
import app.cash.sqldelight.Transacter

object ShortColumnAdapter : ColumnAdapter<Short, Long> {
  override fun decode(database: Transacter?, databaseValue: Long): Short = databaseValue.toShort()

  override fun encode(value: Short): Long = value.toLong()
}
