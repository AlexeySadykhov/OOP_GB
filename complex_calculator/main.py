from calculator.calculator import ComplexCalculator
from calculator.complex_number import ComplexNumber

calculator = ComplexCalculator()
num1 = ComplexNumber(3, 5)
num2 = ComplexNumber(4, 2)

addition = calculator.add(num1, num2)
multiplication = calculator.multiply(num1, num2)
division = calculator.divide(num1, num2)
