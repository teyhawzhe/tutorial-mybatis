package myBatis;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import model.PersonProfile;

public class App {

	public static void main(String[] args) throws IOException {
	
		System.out.println("starting");
		String resource = "myBatis-config.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		
		try(SqlSession session = sqlSessionFactory.openSession()){
			System.out.println("session");
			
			List<PersonProfile> personProfileList = session.selectList("personProfile.getAll");
			
			System.out.println("personProfileList size = " + personProfileList.size());
			
			
			for(PersonProfile index : personProfileList) {
				System.out.println("代號:"+index.getPersonId());
				System.out.println("姓名:"+index.getName());
				System.out.println("性別:"+index.getGender());
				System.out.println("生日:"+index.getBirth());
				System.out.println("郵政區號:"+index.getPostCode());
				System.out.println("地址:"+index.getAddress());
				System.out.println("電話:"+index.getTel());
				System.out.println("EMAIL:"+index.getEmail());
			}
			
			PersonProfile personProfile = (PersonProfile) session.selectOne("personProfile.getById", 1);
			
			System.out.println("personProfile:"+personProfile.toString());
			
			session.close();
		}
		
		 
		
		System.out.println("ending");
	}

}
