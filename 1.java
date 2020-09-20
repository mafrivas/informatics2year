SELECT model, speed, hd FROM pc WHERE price < 50SELECT DISTINCT maker

SELECT DISTINCT maker FROM product WHERE type = 'printer';

SELECT model, ram, screen FROM laptop WHERE price > 1000;

SELECT * FROM printer WHERE color = 'y';

SELECT model, speed, hd FROM pc WHERE cd IN ('12x', '24x') and price < 600;

SELECT DISTINCT maker, speed FROM product JOIN laptop ON product.model = laptop.model AND laptop.hd >= 10;

SELECT pc.model, pc.price FROM pc INNER JOIN product p ON pc.model = p.model WHERE maker = 'B'
UNION
SELECT l.model, l.price FROM laptop l INNER JOIN product p ON l.model = p.model WHERE maker = 'B'
UNION
SELECT prt.model, prt.price FROM printer prt INNER JOIN Product p ON prt.model = p.model WHERE maker = 'B';

SELECT DISTINCT maker FROM product WHERE type = 'pc' AND maker NOT IN(SELECT maker FROM product WHERE type = 'laptop');

SELECT model, price FROM printer WHERE price = (SELECT MAX(price) FROM printer);

SELECT AVG(speed) FROM pc;

SELECT AVG(speed) FROM laptop WHERE price > 1000;

SELECT AVG(speed) FROM pc INNER JOIN product ON pc.model = product.model WHERE product.maker = 'A';
 SELECT s.class, s.name, c.country FROM ships s INNER JOIN classes c ON s.class = c.class WHERE c.numGuns >=10;
 
 SELECT hd FROM pc GROUP BY hd HAVING COUNT(hd) >1;
 
 SELECT DISTINCT a.model AS Model_A, b.model AS Model_B, a.speed, a.ram
FROM pc a INNER JOIN pc b ON a.speed = b.speed AND a.ram = b.ram AND a.model > b.model ORDER BY a.model;
