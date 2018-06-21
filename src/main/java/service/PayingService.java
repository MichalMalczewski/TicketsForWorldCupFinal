package service;

import schema.CreditCard;
import schema.Order;
import schema.TicketOrder;

public interface PayingService {

    Order ticketOrder (TicketOrder order, CreditCard creditCard );
}
