// Return a list of customers, sorted by the ascending number of orders they made
fun Shop.getCustomersSortedByNumberOfOrders(): List<Customer> {
    print(customers.sortedBy{ it.orders.size })
    print(customers.sortedByDescending{ it.orders.size }.reversed())

    return customers.sortedBy{ it.orders.size }
}
