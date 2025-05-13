SELECT
    date_id,
    make_name,
    COUNT(DISTINCT lead_id) AS unique_leads,
    COUNT(DISTINCT partner_id) AS unique_partners
FROM
    DailySales
GROUP BY
    date_id,
    make_name;

    /*Пояснение:
       COUNT(DISTINCT lead_id) — считает уникальные lead_id для каждой группы.
       COUNT(DISTINCT partner_id) — считает уникальные partner_id для каждой группы.
       Группировка идет по date_id и make_name.
       Этот запрос вернет нужный результат в любом порядке, как требуется в задаче.
    */