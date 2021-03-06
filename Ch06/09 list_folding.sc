val list = List(4, 5, 6)
val list2 = List("이", "삼", "사")

// fold(start value)(reduce function)
val fold = list2.fold("일")(_ + _)

// foldLeft
val foldLeft = list.foldLeft(0)(_ + _)

// foldRight
val foldRight = list.foldRight(0)(_ + _)

// reduce(reduce function)
val reduce = list.reduce(_ + _)

// reduceLeft
val reduceLeft = list.reduceLeft(_ + _)

// reduceRight
val reduceRight = list.reduceRight(_ + _)

// scan
val scan = list.scan(0)(_ + _)

// scanLeft
val scanLeft = list.scanLeft(0)(_ + _)

// scanRight
val scanRight = list.scanRight(0)(_ + _)
