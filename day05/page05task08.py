# # Task 08
# # Test this code and try to explain it: list(filter(lambda x: x > 10, [42, 3, 4, 18, 3, 10]))
#
# so it is using filter to see if the x>10, it returns true or false, if true the list integrates x to the list
# ChatGPT
#
# Exactly, well done! The filter() function iterates through the list [42, 3, 4, 18, 3, 10]. For each element, it applies the lambda function lambda x: x > 10, which returns True or False. If the lambda function returns True (meaning that the element is greater than 10), the element is included in the output list. Otherwise, it's excluded.

