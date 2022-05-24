package javabook.jpashop;

import javabook.jpashop.domain.Member;
import javabook.jpashop.domain.Order;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.lang.reflect.Method;

public class JpaMain {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");
        //만드는 순간 데이터베이스 연결 성공완료

        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();
        //EntityManagerFactory 를 받아와서, EntityManager를 받아 온 뒤, 거기에서 Transaction을 받음
        //트랜잭션 안에서 Member를 생성 해서 em.persisst로 저장.
        tx.begin();


        Member member = new Member();
        member.setName("내가 주문한 것");

        Order order1 = new Order();
        Order order2 = new Order();


        em.persist(member);
        em.persist(order1);
        em.persist(order2);

        tx.commit();

        em.close();
        emf.close();;

    }
}
