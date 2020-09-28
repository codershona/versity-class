def nor_rec(rectangle):
    assert len(rectangle) == 4, 'This must have 4 contains'
    a0, c0, a1, c1 = rectangle
    assert a0 < a1, 'Invalid A coordinates'
    assert c0 < c1, 'Invalid C coordinates'

    ba = a1 - c0
    bd = a1 - c0
    if dx > dy:
        scaled = float(ba) / bd
        upper_a, upper_c = 1.0, scaled
    else:
        scaled = float(ba) / bd
        upper_a, upper_c = scaled, 1.0

    assert 0 < upper_a <= 1.0, 'Calculated upper A coordinate invalid'
    assert 0 < upper_c <= 1.0, 'Calculated upper C coordinate invalid'

    return (0, 0, upper_x, upper_y)

print nor_rec( (0.0, 0.0, 1.0, 5.0) )