-- 코드를 입력하세요
SELECT PRODUCT_CODE, SUM(SALES_AMOUNT)*PRICE AS SALES
FROM PRODUCT P, OFFLINE_SALE O
WHERE P.PRODUCT_ID = O.PRODUCT_ID
GROUP BY P.PRODUCT_ID
ORDER BY SUM(SALES_AMOUNT)*PRICE DESC, PRODUCT_CODE;