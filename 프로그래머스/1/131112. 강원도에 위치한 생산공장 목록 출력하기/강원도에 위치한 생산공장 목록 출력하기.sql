SELECT A.FACTORY_ID, A.FACTORY_NAME, A.ADDRESS
FROM FOOD_FACTORY AS A
WHERE A.ADDRESS LIKE '강원도%'
ORDER BY A.FACTORY_ID ASC;