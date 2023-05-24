from calculator.logging import Logger


# Класс калькулятора
class ComplexCalculator:
    # Конструктор
    def __init__(self):
        self.logger = Logger() # инициализация логгера

    # Метод для отображения числа в виде строки
    def show_number(self, num):
        return f"(r={num.real}, i={num.imaginary})"

    # Сложение
    def add(self, x, y):
        result = x + y
        message = f"Сложение: {self.show_number(x)} + {self.show_number(y)} = {self.show_number(result)}"
        print(message)
        self.logger.log(message)

    # Умножение
    def multiply(self, x, y):
        result = x * y
        message = f"Умножение: {self.show_number(x)} * {self.show_number(y)} = {self.show_number(result)}"
        print(message)
        self.logger.log(message)

    # Деление
    def divide(self, x, y):
        result = x / y
        message = f"Деление: {self.show_number(x)} / {self.show_number(y)} = {self.show_number(result)}"
        print(message)
        self.logger.log(message)
