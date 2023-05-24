# Класс, описывающий комплексное число и операции над ним
class ComplexNumber:
    # Конструктор
    def __init__(self, real, imaginary):
        self.real = real # Реальная часть
        self.imaginary = imaginary # Мнимая часть

    # Сложение комплексных чисел
    def __add__(self, num):
        return ComplexNumber(self.real + num.real, self.imaginary + num.imaginary)

    # Умножение комплексных чисел
    def __mul__(self, num):
        real_part = (self.real * num.real) - (self.imaginary * num.imaginary)
        imaginary_part = (self.real * num.imaginary) + (self.imaginary * num.real)
        return ComplexNumber(real_part, imaginary_part)

    # Деление комплексных чисел
    def __truediv__(self, num):
        denominator = (num.real ** 2) + (num.imaginary ** 2)
        real_part = ((self.real * num.real) + (self.imaginary * num.imaginary)) / denominator
        imaginary_part = ((self.imaginary * num.real) - (self.real * num.imaginary)) / denominator
        return ComplexNumber(real_part, imaginary_part)
