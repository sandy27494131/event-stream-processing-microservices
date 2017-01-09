package demo.function;

import demo.order.domain.Order;
import demo.order.domain.OrderStatus;
import demo.order.event.OrderEvent;
import demo.order.event.OrderEventType;
import org.apache.log4j.Logger;
import org.springframework.statemachine.StateContext;

import java.util.function.Function;

public class InventoryReserved extends OrderFunction {

    final private Logger log = Logger.getLogger(InventoryReserved.class);

    public InventoryReserved(StateContext<OrderStatus, OrderEventType> context, Function<OrderEvent, Order> lambda) {
        super(context, lambda);
    }

    /**
     * Apply an {@link OrderEvent} to the lambda function that was provided through the
     * constructor of this {@link OrderFunction}.
     *
     * @param event is the {@link OrderEvent} to apply to the lambda function
     */
    @Override
    public Order apply(OrderEvent event) {
        log.info("Executing workflow for some inventory reserved...");
        return super.apply(event);
    }
}