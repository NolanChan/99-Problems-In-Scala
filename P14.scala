// P14 (*) Duplicate the elements of a list.
// Example:
// scala> duplicate(List('a, 'b, 'c, 'c, 'd))
// res0: List[Symbol] = List('a, 'a, 'b, 'b, 'c, 'c, 'c, 'c, 'd, 'd)

def duplicate[A](l: List[A]): List[A] = l flatMap (e => List(e,e))

println(duplicate(List('a, 'b, 'c, 'c, 'd)))

// first time I matched the solution!