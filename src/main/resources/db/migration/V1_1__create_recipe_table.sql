CREATE TABLE recipe (
    id SERIAL PRIMARY KEY NOT NULL,
    title varchar(50),
    description varchar(200),
    created_on timestamp,
    modified_on timestamp
);
