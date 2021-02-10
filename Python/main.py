from car import Car
from account import Account
from uberX import UberX
from uberBlack import UberBlack
from uberPool import UberPool
from uberVan import UberVan

if __name__ == "__main__":
    print("Hola mundo")

    car = Car("ANT123", Account("Antoine", "ANT123"))
    print(vars(car))
    print(vars(car.driver))
    print("")

    uberPool = UberPool("ANT123", Account("Antoine", "ANT123"), "BMW", "M5")
    print(vars(uberPool))
    print(vars(uberPool.driver))
    print("")

    uberVan = UberVan("LUI123", Account("Luis", "ANT123"), "BMW", "M2")
    print(vars(uberVan))
    print(vars(uberVan.driver))
    print("")
