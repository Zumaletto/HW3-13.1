package ru.netology.repo;

import ru.netology.domain.Product;

public class ProdRepo {

    private Product[] items = new Product[0];

    public void save(Product item) {
        int length = items.length + 1;
        Product[] tmp = new Product[length];
        System.arraycopy(items, 0, tmp, 0, items.length);
        int indexLast = tmp.length - 1;
        tmp[indexLast] = item;
        items = tmp;
    }

    public Product[] findAll() {
        return items;
    }

    public void removedById(int id) {
        int length = items.length - 1;
        Product[] tmp = new Product[length];
        int index = 0;
        for (Product item : items) {
            if (item.getId() != id) {
                tmp[index] = item;
                index++;
            }
        }
        items = tmp;
    }

    public Product findById(int id) {
        Product tmp = new Product();
        for (Product item : items) {
            if (item.getId() == id) {
                tmp = item;
            }
        }
        return tmp;
    }

}
