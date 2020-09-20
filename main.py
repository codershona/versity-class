def case_one(x1, y2):
    if len(x1) > 3:
        if len(y2) > 3:
            print(f"{x1} are measure to {y2}")
        else:
            print(f"{x1} are not measure to {y2}")
    else:
        print('The measurement might not be exact! Sorry!')


def case_two(a1, b2):
    if len(a1) > 3 and len(b2) > 3:
        print(f"{a1} output would be {b2}")
    else:
        print(f"{a1} output not would be {b2}")

case_one('Lima', 'Anny')
case_one('Robin', 'Rohit')
print('----!!!!!!!---This is the case one output----!!!!\n')

case_two('Lisa', 'Bobby')
case_two('Pinky', 'Brown')

print('----!!!!!!!---This is the case two output----!!!!\n')