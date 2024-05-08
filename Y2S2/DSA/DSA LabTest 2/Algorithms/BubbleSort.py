# Unsorted data list
numbers = [7, 4, 8, 2, 6, 3, 9, 1, 5]

print("Unsorted numbers:", numbers)


def bubble_sort(number_list):
    """
    Sorts a list of numbers in ascending order using the bubble sort algorithm.

    Args:
        number_list: The list of numbers to be sorted.
    """

    # Get the number of elements in the list
    number_of_elements = len(number_list)

    # Outer loop to control the number of passes
    for outer_pass in range(number_of_elements - 1):
        swapped = False  # Flag to track if any swaps occurred in the current pass

        # Inner loop to compare adjacent elements
        for inner_pass in range(number_of_elements - outer_pass - 1):
            # Check if elements are in the wrong order
            if number_list[inner_pass] > number_list[inner_pass + 1]:
                # Swap elements if necessary
                number_list[inner_pass], number_list[inner_pass + 1] = number_list[inner_pass + 1], number_list[inner_pass]
                swapped = True  # Set flag to indicate a swap occurred

        # If no swaps occurred in the current pass, the list is already sorted
        if not swapped:
            break

# Sort the list using bubble sort
bubble_sort(numbers)

print("Sorted numbers:", numbers)
