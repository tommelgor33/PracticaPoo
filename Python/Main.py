from Car import Car

if __name__ == "__main__":
    print("Running")
    car = Car()
    car.license = "MIT"
    car.driver = "Carl"
    print(car.driver + " conduce el: " + car.license)