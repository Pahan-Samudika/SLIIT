# Unsorted data list
numbers = [7, 4, 8, 2, 6, 3, 9, 1, 5]

print("Unsorted numbers:", numbers)


def insertion_sort(number_list):
    """
    Sorts a list of numbers in ascending order using the insertion sort algorithm.

    Args:
        number_list: The list of numbers to be sorted.
    """

    # Get the number of elements in the list
    number_of_elements = len(number_list)

    # Outer loop iterates through each element (except the first)
    for current_index in range(1, number_of_elements):
        # Current element to be inserted
        current_value = number_list[current_index]

        # Index of the element to be compared with
        previous_index = current_index - 1

        # Shift elements to the right until a smaller element is found
        while previous_index >= 0 and number_list[previous_index] > current_value:
            number_list[previous_index + 1] = number_list[previous_index]
            previous_index -= 1

        # Insert the current element at the correct position
        number_list[previous_index + 1] = current_value

# Sort the list using insertion sort
insertion_sort(numbers)

print("Sorted numbers:", numbers)
