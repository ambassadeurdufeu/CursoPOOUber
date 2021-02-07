from car import Car
from account import Account

if __name__ == "__main__":
    print("Hola mundo")
    car = Car("ANT123", Account("Antoine", "ANT123"))
    print(vars(car))
    print(vars(car.driver))

