package ru.netology.repo;

import org.junit.jupiter.api.Test;
import ru.netology.domain.Product;

import static org.junit.jupiter.api.Assertions.*;

class ProdRepoTest {

    @Test
    void removedById() {
        ProdRepo repo = new ProdRepo();
        Product first = new Product(1, "Zuma", 157.12);
        Product second = new Product(22, "Zuma", 120.12);
        Product third = new Product(333, "Zuma", 137.12);
        Product forth = new Product(4444, "Zuma", 147.12);

        repo.save(first);
        repo.save(second);
        repo.save(third);
        repo.save(forth);

        repo.removedById(1);


    }
}