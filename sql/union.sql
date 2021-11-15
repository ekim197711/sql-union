-- SELECT * FROM spaceship_captain
-- WHERE no_crashes > 440 or
--       (planet_origin = 'Venus' AND no_crashes > 400);


SELECT * FROM spaceship_captain
WHERE no_crashes > 440
UNION
SELECT * FROM spaceship_captain
WHERE planet_origin = 'Venus' AND no_crashes > 400

order by name
