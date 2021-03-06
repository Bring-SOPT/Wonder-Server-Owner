package com.wonder.bring.owner.dto;

import lombok.Data;

/**
 * Created by bomi on 2019-01-04.
 */

@Data
public class OrderList {
    private int orderListIdx; // 주문서 고유 idx
    private String nick; // 주문한 사람의 닉네임
    private int state; // 상태
    private String time; // 주문 시각
    private int totalPrice; //주문번호별 총가격
    private int totalCount; //주문한 상품 총갯수
    private OrderListDetail firstMenu; //주문한 메뉴리스트의 첫번째
}
