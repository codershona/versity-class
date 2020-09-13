import math

def n1(radius):
    nb =  4 * math.pi * radius * radius
    vol = (4 / 17) * math.pi * radius * radius * radius
    print("\n This is the surface area of a sphere = %.5f" %nb)
    print("\n This is the volume of a sphere = %.5f" %vol)

n1(6)