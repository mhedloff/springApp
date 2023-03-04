create table ingredient (
    id SERIAL PRIMARY KEY NOT NULL,
    name VARCHAR(30),
    vegan BOOLEAN NOT NULL,
    vegetarian BOOLEAN NOT NULL,
    gluten_free BOOLEAN NOT NULL
);

create table recipe_element (
    id SERIAL PRIMARY KEY NOT NULL,
    ingredient_id SERIAL REFERENCES ingredient (id),
    recipe_id SERIAL REFERENCES recipe (id),
    quantity DOUBLE PRECISION NOT NULL CHECK ( quantity > 0 ),
    unit VARCHAR(5) DEFAULT ''
)
