SELECT * FROM spaceship_captain
WHERE planet_origin = 'Mars' AND no_crashes < 10
UNION
SELECT * FROM spaceship_captain
WHERE planet_origin = 'Earth' AND name LIKE 'M%'
UNION
SELECT * FROM spaceship_captain
WHERE experience >= 9
EXCEPT
SELECT * FROM spaceship_captain
WHERE name like 'W%'
order by name