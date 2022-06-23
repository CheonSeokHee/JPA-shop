package javabook.jpashop.domain;


import javax.persistence.*;

@Entity
public class Category {


         @Id
         @GeneratedValue
         private Long id;

         private String name;

         @ManyToOne
         @JoinColumn(name = "PARENT_ID")
         private Category parent;



}
