select
sample_id,
dna_sequence,
species,
count(CASE WHEN dna_sequence LIKE 'ATG%' THEN 1 END) as has_start,
count(CASE WHEN dna_sequence LIKE '%TAA' OR dna_sequence LIKE '%TAG' OR dna_sequence LIKE '%TGA' THEN 1 END) as has_stop,
count(CASE WHEN dna_sequence LIKE '%ATAT%' THEN 1 END) as has_atat,
count(CASE WHEN dna_sequence LIKE '%GGG%' OR dna_sequence LIKE '%GGGG%' THEN 1 END) as has_ggg,
from Samples
GROUP BY
    sample_id, dna_sequence, species
ORDER BY
    sample_id ASC;