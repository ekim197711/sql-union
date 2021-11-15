SELECT * FROM spaceship_captain
WHERE planet_origin = 'Mars' AND no_crashes < 100
EXCEPT
SELECT * FROM spaceship_captain
WHERE name LIKE 'B%'
order by name