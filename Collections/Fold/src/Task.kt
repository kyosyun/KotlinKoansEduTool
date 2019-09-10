// Return the set of products that were ordered by every customer
// TODO: 再
fun Shop.getSetOfProductsOrderedByEveryCustomer(): Set<Product> {
    var allProducts = customers.flatMap { it.orders }.flatMap { it.products }.toSet()
    return customers.fold(allProducts) { allProducts, customers ->
        allProducts.filter { customers.orders.flatMap { it.products }.contains(it) }.toSet()
    }
}
