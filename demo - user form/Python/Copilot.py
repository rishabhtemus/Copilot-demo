
def findSmallest(numbers):
    smallest = numbers[0]
    for i in range(1, len(numbers)):
        if numbers[i] < smallest:
            smallest = numbers[i]
    return smallest

if __name__ == '__main__':
    numbers = [1, 2, 3, 4, 5]
    print("The Smallest number is :", findSmallest(numbers))