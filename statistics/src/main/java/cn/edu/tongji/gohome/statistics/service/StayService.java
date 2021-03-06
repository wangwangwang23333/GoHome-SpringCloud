package cn.edu.tongji.gohome.statistics.service;


import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

/**
 * StayService类
 *
 * @author 汪明杰
 * @date 2021/11/22 21:42
 */
@Service
public interface StayService {
    List<Long> getHighestScoreStay();

    List<Long> getMostOrdersStay();

    List<Long> getMinPriceStay();

    HashMap<String, Integer> getStayCustomerAgeByStayId(long stayId);

    HashMap<String, Integer> getStayCustomerGenderByStayId(long stayId);

    List<HashMap<String,Object>> getStayMonthOrderAndCommentScore(long stayId);
}
