# l1=[5, 3, 1, 2, 4, 8, 6, 9, 7, 10]

# def insertion_sort(unsorted_list):
#     for x in range(1,len(unsorted_list)):
#         current = x
#         while

class Product:
    def __init__(self, name: str, price: int):
        self.name = name
        self.price = price

    def __str__(self) -> str:
        return f"{self.name} {self.price}"


class Machine:
    def __init__(self):
        self.products: dict[Product] = dict()
        self.balance = 0


p1 = Product('one', 1)
p1 = Product('two', 2)
x = Machine()
print(x.products)
