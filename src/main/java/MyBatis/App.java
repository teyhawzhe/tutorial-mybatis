package myBatis;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import model.PersonProfile;

public class App {

	private static Logger log = LoggerFactory.getLogger(App.class);
	
	public static void main(String[] args) throws IOException {
	
		log.debug("logging");
		
		System.out.println("starting");
		String resource = "myBatis-config.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		
		try(SqlSession session = sqlSessionFactory.openSession()){
			log.debug("session");
			
			/*List<PersonProfile> personProfileList = session.selectList("personProfile.getAll");
			
			System.out.println("personProfileList size = " + personProfileList.size());
			
			
			for(PersonProfile index : personProfileList) {
				System.out.println(index.toString());
			}
			
			System.out.println("------------------------------");
			
			PersonProfile personProfile = (PersonProfile) session.selectOne("personProfile.getById", 1);
			
			System.out.println("personProfile:\n"+personProfile.toString());
			
			PersonProfile liqingzhao = new PersonProfile();
			liqingzhao.setName("李清照");
			liqingzhao.setGender("2");
			liqingzhao.setEmail("liqingzhao@email.com");
			liqingzhao.setPostCode("370100");
			liqingzhao.setBirth("10840313");
			liqingzhao.setAddress("山東省濟南市");
			liqingzhao.setTel("0912345678");
			
			int delResult = session.delete("personProfile.deleteByName", "李清照");
			System.out.println("delete result " + delResult);
			
			int insResult = session.insert("personProfile.insert",liqingzhao);
			System.out.println("insert result " + insResult);
			
			Map<String,Object> parameter = new HashMap<>();
			parameter.put("gender", "2");
			parameter.put("name", "李白");
			int upResult = session.update("personProfile.updateGenderByName", parameter);
			System.out.println("update result " + upResult);
			
			
			parameter.put("gender", "1");
			parameter.put("personId", 1);
			int upResult1 = session.update("personProfile.update", parameter);
			System.out.println("update1 result " + upResult1);
			
			session.commit();
			
			List<Map<String,Object>> map = session.selectList("personProfile.getAllMap");
			
			for(Map<String,Object> index : map) {
				System.out.println("***************************************");
				System.out.println(index.get("PERSON_ID"));
				System.out.println(index.get("NAME"));
				System.out.println(index.get("BIRTH"));
				System.out.println(index.get("GENDER"));
				System.out.println(index.get("POST_CODE"));
				System.out.println(index.get("ADDRESS"));
				System.out.println(index.get("TEL"));
				System.out.println(index.get("EMAIL"));
				System.out.println("***************************************");
			}
			
	 
			parameter.put("gender", "2");
			parameter.put("name", "李白");
		
			map = session.selectList("personProfile.getAllMapByMap" , parameter);
			for(Map<String,Object> index : map) {
				System.out.println("1***************************************");
				System.out.println(index.get("PERSON_ID"));
				System.out.println(index.get("NAME"));
				System.out.println(index.get("BIRTH"));
				System.out.println(index.get("GENDER"));
				System.out.println(index.get("POST_CODE"));
				System.out.println(index.get("ADDRESS"));
				System.out.println(index.get("TEL"));
				System.out.println(index.get("EMAIL"));
				System.out.println("1***************************************");
			}*/
			
			
			
			
			
			session.close();
		}
		
		 
		
		System.out.println("ending");
	}

}
