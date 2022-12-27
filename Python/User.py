from Account import Account

class UberBlack(Account):
    typeCarAccepted = []
    seatsMaterial = []

    def __init__(self, license, driver, type, seats):
        super.__init__(license, driver)
        typeCarAccepted = type
        seatsMaterial = seats