# Test this code and try to explain it:
print([*enumerate([42, 3, 4, 18, 3, 10])])
print(list(enumerate([42, 3, 4, 18, 3, 10])))
#
# n the expression [*enumerate([42, 3, 4, 18, 3, 10])], the asterisk * is actually not being used for unpacking variables. Instead, it's being used to unpack an iterator into a list.
#
# When you use enumerate, it returns an iterator that produces tuples containing the index and the value from the iterable. The asterisk * here is unpacking those tuples into a list.
#
# Exactly! The * operator in unpacking collects all elements that were not explicitly assigned to other variables. You can think of it as a "catch-all" for remaining elements in the iterable.
#
# For example, in the expression first, *rest, last = [1, 2, 3, 4, 5], the variable first would get 1, last would get 5, and rest would collect the remaining elements [2, 3, 4].