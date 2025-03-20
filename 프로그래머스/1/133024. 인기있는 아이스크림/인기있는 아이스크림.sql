SELECT A.FLAVOR
FROM FIRST_HALF AS A
ORDER BY 
    CASE A.FLAVOR
        WHEN 'chocolate' THEN 1
        WHEN 'melon' THEN 2
        WHEN 'white_chocolate' THEN 3
        WHEN 'strawberry' THEN 4
        WHEN 'mango' THEN 5
        WHEN 'orange' THEN 6
        WHEN 'pineapple' THEN 7
        WHEN 'vanilla' THEN 8
        WHEN 'caramel' THEN 9
        WHEN 'peach' THEN 10
        WHEN 'watermelon' THEN 11
        WHEN 'mint_chocolate' THEN 12
        ELSE 13  -- 이 외의 값은 나중에 정렬
    END;
