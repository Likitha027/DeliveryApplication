package org.example;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor@Setter@Getter@NoArgsConstructor
public class Order
{
    Integer OrderedId;
    String OrderDescription;
    double price;
    String PaymentMode;

}
