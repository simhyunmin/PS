select 
    sd.ROUTE, 
    CONCAT(ROUND(SUM(sd.D_BETWEEN_DIST), 1), 'km') as TOTAL_DISTANCE, 
    CONCAT(ROUND(AVG(sd.D_BETWEEN_DIST), 2), 'km') as AVERAGE_DISTANCE
from 
    SUBWAY_DISTANCE as sd
group by 
    sd.ROUTE
order by 
    SUM(sd.D_BETWEEN_DIST) DESC;