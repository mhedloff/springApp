CREATE TABLE recipe
(
    id          SERIAL PRIMARY KEY NOT NULL,
    title       varchar(50),
    description varchar(200)
);

Create table recipe_version
(
    id          SERIAL PRIMARY KEY NOT NULL,
    recipe_id   SERIAL             NOT NULL
        CONSTRAINT FK_RECIPE_VERSION_RECIPE_ID REFERENCES recipe (id),
    version     INTEGER            NOT NULL DEFAULT 1,
    notes       varchar(200)       NOT NULL DEFAULT '',
    created_on  timestamp,
    modified_on timestamp
);
