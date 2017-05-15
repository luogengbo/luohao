package org.tarena.test;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.tarena.dao.CostDao;
import org.tarena.entity.Cost;
import org.tarena.util.MyBatisUtil;

public class CostTest {

	public static void main(String[] args) {

		
		
		SqlSession session = MyBatisUtil.getSession();
		System.out.println(session);
	//	List<Cost> list = session.selectList("findAll");
//		List<Cost> list = session.selectList("findPage",5);
//		for(Cost c: list){
//			System.out.println(c.getCost_id()+" "+c.getName());
//		}
		//测试返回Map结果
//		List<Map<String,Object>> list = session.selectList("findMap");
//		for(Map<String,Object>data:list){
//			System.out.println(data);
//		}
		//测试返回int值
//		int rows = session.selectOne("findRows");
//		System.out.println("记录数"+rows);
		
//		
//		List<CostBean1> list = session.selectList("findCost");
//		for(CostBean1 c:list){
//			System.out.println(c.getId()+" "+c.getName());
//		}
		
		//测试Mapper映射器接口
		CostDao costDao = session.getMapper(CostDao.class); //根据CostDao接口生成实现对象
		System.out.println(costDao.getClass().getName());
		List<Cost> list = costDao.findAll();
		for(Cost c:list){
			System.out.println(c.getCost_id()+" "+c.getName());
		}
		session.close();
		
		
		
		
	}

}
