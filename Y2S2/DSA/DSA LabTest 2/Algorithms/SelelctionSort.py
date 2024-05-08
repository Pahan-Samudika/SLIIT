# Unsorted data list
numbers = [7, 4, 8, 2, 6, 3, 9, 1, 5]

print("Unsorted numbers:", numbers)


def selection_sort(number_list):
    """
    Sorts a list of numbers in ascending order using the selection sort algorithm.

    Args:
        number_list: The list of numbers to be sorted.
    """

    # Get the number of elements in the list
    number_of_elements = len(number_list)

    # Outer loop iterates through each element (excluding the last sorted part)
    for current_index in range(number_of_elements):
        # Index of the element with the minimum value found so far
        min_index = current_index

        # Inner loop to find the element with the minimum value in the unsorted part
        for next_index in range(current_index + 1, number_of_elements):
            if number_list[next_index] < number_list[min_index]:
                min_index = next_index

        # Swap the minimum element with the element at the current index
        if min_index != current_index:
            number_list[current_index], number_list[min_index] = number_list[min_index], number_list[current_index]

# Sort the list using selection sort
selection_sort(numbers)

print("Sorted numbers:", numbers)
