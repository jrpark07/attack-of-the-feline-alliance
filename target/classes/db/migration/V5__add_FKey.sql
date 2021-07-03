ALTER TABLE laser_cannons
ADD COLUMN ship_id INT NOT NULL REFERENCES ships(id);
