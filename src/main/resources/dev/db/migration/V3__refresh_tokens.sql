SELECT COUNT(*)
INTO @columnCount
FROM INFORMATION_SCHEMA.COLUMNS
WHERE TABLE_NAME = 'tokens'
  AND TABLE_SCHEMA = 'ShopApp'
  AND COLUMN_NAME = 'refresh_token';

SET @alterStatement = IF(@columnCount = 0,
    'ALTER TABLE tokens ADD COLUMN refresh_token VARCHAR(255) DEFAULT '''';',
    'SELECT 1;'); -- No-op statement if column exists
PREPARE stmt FROM @alterStatement;
EXECUTE stmt;
DEALLOCATE PREPARE stmt;

SELECT COUNT(*)
INTO @columnCount
FROM INFORMATION_SCHEMA.COLUMNS
WHERE TABLE_NAME = 'tokens'
  AND TABLE_SCHEMA = 'ShopApp'
  AND COLUMN_NAME = 'refresh_expiration_date';

SET @alterStatement = IF(@columnCount = 0,
    'ALTER TABLE tokens ADD COLUMN refresh_expiration_date datetime;',
    'SELECT 1;'); -- No-op statement if column exists
PREPARE stmt FROM @alterStatement;
EXECUTE stmt;
DEALLOCATE PREPARE stmt;