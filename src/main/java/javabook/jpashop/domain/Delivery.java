package javabook.jpashop.domain;

import org.omg.CORBA.PRIVATE_MEMBER;

import javax.persistence.*;

@Entity
public class Delivery {

        //@Id @GeneratedValue == 키본키 자동 생성  
        //@GeneratedValue은 pk로 지정한다는 의미
        @Id @GeneratedValue
        private Long id;

        private String city;
        private String street;
        private String zipcode;
        private DeliveryStatus status;

        @OneToOne(mappedBy = "delivery")
        private Order order;



}
