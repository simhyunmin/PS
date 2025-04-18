SELECT DISTINCT (SELECT SUM(SCORE) FROM HR_GRADE WHERE EMP_NO = he.EMP_NO) AS SCORE, he.EMP_NO, he.EMP_NAME, he.POSITION, he.EMAIL
FROM HR_EMPLOYEES AS he
JOIN HR_DEPARTMENT AS hd ON he.DEPT_ID = hd.DEPT_ID
JOIN HR_GRADE AS hg ON he.EMP_NO = hg.EMP_NO
WHERE he.EMP_NO = (
    SELECT EMP_NO 
    FROM (
        SELECT EMP_NO, SUM(SCORE) AS TOTAL_SCORE 
        FROM HR_GRADE
        GROUP BY EMP_NO
    ) AS grades
    ORDER BY TOTAL_SCORE DESC
    LIMIT 1
);