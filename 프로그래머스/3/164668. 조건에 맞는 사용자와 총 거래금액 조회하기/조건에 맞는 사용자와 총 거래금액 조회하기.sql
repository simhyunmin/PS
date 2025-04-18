-- 코드를 입력하세요
SELECT u.USER_ID, u.NICKNAME, SUM(PRICE) AS TOTAL_SALES
FROM USED_GOODS_BOARD AS b
JOIN USED_GOODS_USER AS u ON b.WRITER_ID = u.USER_ID
WHERE STATUS = 'DONE'
GROUP BY b.WRITER_ID
HAVING SUM(PRICE) >= 700000
ORDER BY TOTAL_SALES
