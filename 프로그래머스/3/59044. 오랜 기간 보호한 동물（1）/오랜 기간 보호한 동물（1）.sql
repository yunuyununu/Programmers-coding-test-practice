-- 코드를 입력하세요
SELECT NAME, DATETIME
FROM ANIMAL_INS I
WHERE NOT EXISTS (SELECT ANIMAL_ID FROM ANIMAL_OUTS O WHERE I.ANIMAL_ID = O.ANIMAL_ID)
ORDER BY DATETIME
LIMIT 3;