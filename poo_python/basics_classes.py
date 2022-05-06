class Monster:
    def __init__(self, health, damage, func):
        self.health  = health
        self.damage  = damage
        self.attack  = func

    def __call__(self):
        print('the monster has been called!')

    def __len__(self):
        return self.health

    def __add__(self, something):
        return self.health + something

    def __str__(self):
        return f'el monstruo tiene una vida de {self.health} y un daño de {self.damage}'

    def get_damage(self, amount):
        self.health -= amount

class Attacks:
    def __init__(self):
        pass

    def bite(self):
        print('attacking with bite')
    def strike(self):
        print('attacking with strike')
    def slash(self):
        print('attacking with slash')
    def kick(self):
        print('attacking with kick')

class Hero:
    def __init__(self, damage, monster):
        self.damage  = damage
        self.monster = monster

    def attack(self):
        self.monster.get_damage(self.damage)


attacks = Attacks()
monster1 = Monster(100, 45, attacks.bite)
hero1 = Hero(13, monster1)
print(monster1.health)
hero1.attack()
print(monster1.health)
