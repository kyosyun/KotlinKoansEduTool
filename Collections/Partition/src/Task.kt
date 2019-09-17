// Return customers who have more undelivered orders than delivered
fun Shop.getCustomersWithMoreUndeliveredOrdersThanDelivered(): Set<Customer> = customers.filter {
    var (deliverd, undeliverd) = it.orders.partition { it.isDelivered }
     deliverd.count() < undeliverd.count()
}.toSet()
