package ru.netology.repo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.domain.Product;

import static org.junit.jupiter.api.Assertions.*;

class ProdRepoTest {
    ProdRepo repo = new ProdRepo();
    Product first = new Product(1, "Zuma", 157.12);
    Product second = new Product(22, "Leto", 120.12);
    Product third = new Product(333, "Vesna", 137.12);
    Product forth = new Product(4444, "Ocen'", 137.12);

    @BeforeEach
    public void SetUp() {
        repo.save(first);
        repo.save(second);
        repo.save(third);
        repo.save(forth);
    }

    @Test
    public void ShouldRemoveByExistsId() {
        repo.removedById(333);
        Product[] expected = new Product[]{first, second,forth};
        Product[] actual = repo.findAll();
        assertArrayEquals(expected, actual);
    }

    @Test
    public void ShouldRemoveByNoExistsId() {
        assertThrows(NotFoundException.class, () ->{
            repo.removedById(33);
        });
    }


}
