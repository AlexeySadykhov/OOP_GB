import logging

# Класс логгера


class Logger:
    # Конструктор
    def __init__(self):
        self.logger = logging.getLogger("calculator_logger")
        self.logger.setLevel(logging.INFO)
        handler = logging.FileHandler("calculator.log")
        formatter = logging.Formatter("%(asctime)s - %(message)s")
        handler.setFormatter(formatter)
        self.logger.addHandler(handler)

    # Запись сообщения
    def log(self, message):
        self.logger.info(message)
