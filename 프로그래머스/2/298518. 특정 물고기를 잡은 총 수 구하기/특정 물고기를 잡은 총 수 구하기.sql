-- 코드를 작성해주세요
SELECT COUNT(*) AS FISH_COUNT
FROM FISH_INFO I, FISH_NAME_INFO N
WHERE I.FISH_TYPE=N.FISH_TYPE
AND FISH_NAME IN('BASS','SNAPPER')